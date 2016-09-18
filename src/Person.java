public class Person {
	private String name;
	public int age;
	// 爱好
	public String like1 = "football";
	public String like2 = "basketball";

	public Person() {
		this.name = "Jim";
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "] like1:" + like1
				+ ",like2:" + like2;
	}
}
