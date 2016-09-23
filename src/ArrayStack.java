/**
 * 栈的数组实现
 * 
 * @author yuejiaoli
 */
public class ArrayStack {
    private int[] array;
    private int max;
    private int top;

    public ArrayStack(int max) {
        this.array = new int[max];
        this.max = max;
        this.top = 0;
    }

    /**
     * 压栈
     * 
     * @param value
     */
    public void push(int value) {
        if (isFull()) {
            System.out.println("stack is full");
            return;
        }
        array[top++] = value;
    }

    /**
     * 弹栈
     * 
     * @return
     */
    public int pop() {
        return array[--top];
    }

    /**
     * 是否栈满
     * 
     * @return
     */
    public boolean isFull() {
        if (top == max) {
            return true;
        }
        return false;
    }

    /**
     * 是否栈空
     * 
     * @return
     */
    public boolean isEmpty() {
        if (top == 0) {
            return true;
        }
        return false;
    }

    public void display() {
        while (!isEmpty()) {
            System.out.println(pop());
        }
    }

    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(5);
        stack.push(1);
        stack.push(3);
        stack.push(5);
        stack.push(7);
        stack.push(9);
        stack.display();
    }
}
