
package designmode.abstractfactory;

public class AMDMainBoard implements IMainBoard {
    /** CPU插槽的孔数 */
    private int cpuHoles = 0;

    /** 构造方法，传入CPU插槽的孔数 */
    public AMDMainBoard(int cpuHoles) {
        this.cpuHoles = cpuHoles;
    }

    @Override
    public void installCPU() {
        System.out.println("AMD主板的CPU插槽孔数是：" + cpuHoles);
    }

}
