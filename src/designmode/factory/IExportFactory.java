
package designmode.factory;

/**
 * 抽象工厂类
 * 
 * @author yuejiaoli
 */
public interface IExportFactory {
    public IExportProduct factory(String type);
}
