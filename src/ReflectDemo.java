import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectDemo {
	public static void main(String[] args) {
		// method();
		// changeb2a();
		// field();
		// construct();
		// newInstance();
		// printClassName(new String());
	}

	private static void method() {
		try {
			String str = "abc";
			// char ch = str.charAt(1);
			Method method = String.class.getMethod("charAt", int.class);
			Object obj = method.invoke(str, 2);
			System.out.println(obj);

		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
	}

	private static void changeb2a() {
		try {

			Person person = new Person("Tom", 18);
			Field[] fields = person.getClass().getFields();
			for (int i = 0; i < fields.length; i++) {
				Field field = fields[i];
				if (field.getType() == String.class) {
					String oldVal = (String) field.get(person);
					String newVal = oldVal.replace('a', 'b');
					field.set(person, newVal);
				}
			}
			System.out.println(person.toString());

		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}

	private static void field() {
		try {
			Person person = new Person("Tom", 7);
			Field fAge = person.getClass().getField("age");
			System.out.println(fAge.get(person));

			Field fName = person.getClass().getDeclaredField("name");
			fName.setAccessible(true);// 暴力反射
			System.out.println(fName.get(person));
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}

	private static void construct() {
		try {
			Constructor<String> cs = String.class
					.getConstructor(StringBuffer.class);
			System.out.println(cs);
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		}
	}

	// 利用Class的newInstance方法相当于调用类的默认的构造器
	private static void newInstance() {
		Person p = new Person();
		System.out.println(p.toString());

		Class<Person> clazz = Person.class;
		try {
			Person p2 = clazz.newInstance();
			System.out.println(p2.toString());
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}

	// 使用 Class 对象来显示对象的类名
	static void printClassName(Object obj) {
		System.out.println("The class of " + obj + " is "
				+ obj.getClass().getName());
	}

	/**
	 * 获取字节码
	 */
	static void getClassInstance() {
		String s1 = new String();
		// 下面的这三种方式都可以得到字节码
		Class c1 = String.class;
		Class c2 = s1.getClass();
		// 若存在则加载，否则新建,往往使用第三种,类的名字在写源程序时不需要知道，到运行时再传递过来
		try {
			Class c3 = Class.forName("java.lang.String");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
