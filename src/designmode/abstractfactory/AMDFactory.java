
package designmode.abstractfactory;

public class AMDFactory implements IFactory {

    public ICpu createCpu() {
        return new AMDCpu(938);
    }

    public IMainBoard createMainBoard() {
        return new AMDMainBoard(938);
    }

}
