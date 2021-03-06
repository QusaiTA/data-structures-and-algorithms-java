package trees;

public class Node<T> {

    public T data;
    public Node<T> leftNode;
    public Node<T> rightNode;

    public Node() {
    }

    public Node(T data){
        this.data=data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node<T> getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(Node<T> leftNode) {
        this.leftNode = leftNode;
    }

    public Node<T> getRightNode() {
        return rightNode;
    }

    public void setRightNode(Node<T> rightNode) {
        this.rightNode = rightNode;
    }

    @Override
    public String toString() {
        return "Node{" +
                "leftNode=" + leftNode +
                ", rightNode=" + rightNode +
                '}';
    }
}
