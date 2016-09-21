
package designmode.abstractfactory;

public class IntelFactory implements IFactory {

    public ICpu createCpu() {
        return new IntelCpu(755);
    }

    public IMainBoard createMainBoard() {
        return new IntelMainBoard(755);
    }
}
