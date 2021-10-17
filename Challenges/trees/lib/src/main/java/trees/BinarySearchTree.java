package trees;

public class BinarySearchTree<T extends Comparable<T>> {

    public Node<T> root;

    public void add(T data){
        if(isEmpty()){

            root = new Node<>(data);
        } else {
            addHelper(data,root);


        }
    }

    private void addHelper(T data, Node<T> root) {
        Node<T> node = new Node<>(data);
        if (data.compareTo(root.getData()) < 0) {
            if (root.getLeftNode() == null) {
                root.setLeftNode(node);
            } else {
                addHelper(data, root.getLeftNode());
            }
        }
        if (data.compareTo(root.getData()) > 0){
            if (root.getRightNode() == null) {
                root.setRightNode(node);
            } else {
                addHelper(data, root.getRightNode());
            }
    }

    }

    public void inorderTraversal() {
        if (isEmpty()) {
            return;
        }

        traverseInorder(root);
    }

    private void traverseInorder(Node<T> root) {
        if (root.getLeftNode() != null) { // traverse left
            traverseInorder(root.getLeftNode());
        }
        System.out.print("->" + root.getData());

        if (root.getRightNode() != null) { // traverse right
            traverseInorder(root.getRightNode());
        }
    }
    public boolean isEmpty(){
        return root == null;
    }

    public boolean contains( T key )
    {
        return contains( key, root );
    }
    private boolean contains( T key, Node<T> root )
    {
        if( root == null )
            return false;
        int compareResult = key.compareTo(root.getData());
        if( compareResult < 0 )
            return contains( key, root.getLeftNode());
        else if( compareResult > 0 )
            return contains( key, root.getRightNode() );
        else
            return true; // Match
    }

    public Integer maximumValue() {
        return maximumValue(root);
    }

    private Integer maximumValue(Node<T> node) {
        if (node.getRightNode() != null) {
            return maximumValue(node.getRightNode());
        }
        return  (Integer) node.getData();

    }
    @Override
    public String toString() {
        return "BinarySearchTree{" +
                "root=" + root.getData() +
                '}';
    }
}
