public class LinkStack {
    private LinkNode top = null;

    public LinkStack() {
        top = new LinkNode(0, "bottom");
    }

    /**
     * 新建一个新的栈顶元素，将该元素的下一个指向原先的栈顶元素
     * 
     * @param element
     */
    public void push(LinkNode element) {
        if (element != null) {
            element.setNextLinkNode(top);
            top = element;
        }
    }

    /**
     * 1.保存栈顶元素的值， 2.将栈顶元素设置为下一个元素：
     */
    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return;
        }
        top = top.getNextLinkNode();
    }

    public LinkNode getTop() {
        if (isEmpty()) {
            return null;
        }
        return top;
    }

    public boolean isEmpty() {
        if (top == null) {
            return true;
        }
        return false;
    }

    public void printStack(LinkNode currentNode) {
        while (currentNode != null) {
            System.out.println(currentNode.getKey() + ":" + currentNode.getData());
            // 获取栈下一个结点
            currentNode = currentNode.getNextLinkNode();
        }
    }

    public static void main(String[] args) {
        LinkStack stack = new LinkStack();
        for (int i = 0; i < 5; i++) {
            LinkNode node = new LinkNode(i + 1, "name" + (i + 1));
            stack.push(node);
        }
        stack.printStack(stack.top);
    }
}
