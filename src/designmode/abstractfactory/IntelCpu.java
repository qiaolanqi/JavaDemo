
package designmode.abstractfactory;

public class IntelCpu implements ICpu {

    private int pins;

    public IntelCpu(int pins) {
        this.pins = pins;
    }

    public void calculate() {
        System.out.println("Intel CPU的针脚数：" + pins);
    }

}
