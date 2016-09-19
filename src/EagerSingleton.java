/**
 * 单例（饿汉式）
 * 
 * @author yuejiaoli
 * 
 */
public class EagerSingleton {
	private static EagerSingleton sInstance = new EagerSingleton();

	// 私有默认构造方法
	private EagerSingleton() {
	}

	// 静态工厂方法
	public static EagerSingleton getInstance() {
		return sInstance;
	}
}
