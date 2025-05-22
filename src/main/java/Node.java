public class Node { //esta clase es parte del problema 3
    private int data;
    private Node left;
    private Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
    public int getData() {
        return data;
    }
    public void setData(int data) {
        this.data = data;
    }
    public Node getLeft() {
        return left;
    }
    public void setLeft(Node left) {
        this.left = left;
    }
    public Node getRight() {
        return right;
    }
    public void setRight(Node right) {
        this.right = right;
    }
}
