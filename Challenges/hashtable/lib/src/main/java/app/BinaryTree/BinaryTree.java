package app.BinaryTree;


import java.util.ArrayList;
import java.util.List;

public class BinaryTree<T> {
    public Node<Integer> root;
    List<T> data;

    public BinaryTree() {
        this.root = null;
        this.data = new ArrayList<>();
    }
    public List<T> inOrder(Node<T> node) {
        if (node != null) {
            inOrder(node.left);
            data.add(node.data);
            inOrder(node.right);
        }
        return data;
    }
}
