public class MemberInnerClass {
    public static void main(String[] args) {
        // 第一种方式：
        Outter outter = new Outter(3.14);
        Outter.Inner inner1 = outter.new Inner(); // 必须通过Outter对象来创建

        // 第二种方式：
        Outter.Inner inner2 = outter.getInnerInstance();
    }
}

class Outter {
    private double radius = 0;
    public static int count = 1;
    private Inner inner = null;

    public Outter(double radius) {
        this.radius = radius;
    }

    public Inner getInnerInstance() {
        if (inner == null)
            inner = new Inner();
        return inner;
    }

    /**
     * 内部类
     */
    class Inner {
        public Inner() {

        }

        public void drawSahpe() {
            System.out.println(radius); // 外部类的private成员
            System.out.println(count); // 外部类的静态成员
        }
    }
}
