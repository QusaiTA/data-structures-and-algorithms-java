//package trees;
//
//public class BinaryTree<T> {
//
//    private final Node<T> root;
//
//    public BinaryTree(Node<T> root) {
//        this.root = root;
//    }
//
//
////    public BinaryTree(T rootData) {
////        this.root = new Node<>(rootData);
////    }
//
//    public boolean isEmpty(){
//        return root == null;
//    }
//    // inOrder Traversal
//    public void inOrderTraversal(){
//        if(isEmpty()){
//            return;
//        }
//        traversInorder(root);
//    }
//
//    private void traversInorder(Node<T> root){
//        if(root.getLeftNode() != null){
//            traversInorder(root.getLeftNode());
//        }
//
//        System.out.println(root.getData());
//
//        if(root.getRightNode() != null){
//            traversInorder(root.getRightNode());
//        }
//    }
//
//}
