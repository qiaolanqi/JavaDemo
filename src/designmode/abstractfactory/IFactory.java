
package designmode.abstractfactory;

public interface IFactory {
    // 创建CPU对象
    public ICpu createCpu();

    // 创建主板对象
    public IMainBoard createMainBoard();

}
