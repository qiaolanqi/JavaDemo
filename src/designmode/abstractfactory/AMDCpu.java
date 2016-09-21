
package designmode.abstractfactory;

public class AMDCpu implements ICpu {

    private int pins = 0;

    public AMDCpu(int pins) {
        this.pins = pins;
    }

    public void calculate() {
        System.out.println("AMD CPU的针脚数：" + pins);
    }

}
