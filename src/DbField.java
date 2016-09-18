import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
// 注解生命周期在程序运行期间
@Target(ElementType.FIELD)
// 只能声明在类属性前
public @interface DbField {
	public enum DataType {
		INTEGER, BIGINT, REAL, TEXT, BLOB
	};

	String value() default "";

	DataType type() default DataType.TEXT;

	String name() default "";

	boolean isNull() default true;

	boolean isPrimaryKey() default false;

	boolean isAutoIncrement() default false;
}
