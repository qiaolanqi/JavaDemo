package designmode;
/**
 * 单例（懒汉式）
 * 
 * @author yuejiaoli
 * 
 */
public class LazySingleton {
	private static LazySingleton sInstance = null;

	// 私有默认构造方法
	private LazySingleton() {
	}

	// 静态工厂方法
	public static synchronized LazySingleton getInstance() {
		if (sInstance == null) {
			sInstance = new LazySingleton();
		}
		return sInstance;
	}
}
