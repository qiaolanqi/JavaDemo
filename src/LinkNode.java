public class LinkNode {
    private int key;
    private String data;

    private LinkNode nextLinkNode = null;

    public LinkNode(int key, String data) {
        this.key = key;
        this.data = data;
        this.nextLinkNode = null;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public LinkNode getNextLinkNode() {
        return nextLinkNode;
    }

    public void setNextLinkNode(LinkNode nextLinkNode) {
        this.nextLinkNode = nextLinkNode;
    }

}
