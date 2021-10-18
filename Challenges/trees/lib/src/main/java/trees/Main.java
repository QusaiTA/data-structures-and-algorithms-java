package trees;

public class Main {

    public static void main(String[] args) {
//        System.out.println("Hello");
//
//        BinarySearchTree<Integer> binarySearchTree  = new BinarySearchTree<>();
//        binarySearchTree.add(10);
//        binarySearchTree.add(2);
//        binarySearchTree.add(13);
//        binarySearchTree.add(11);
//        binarySearchTree.add(5);
//        binarySearchTree.add(6);
//        System.out.println(binarySearchTree);
//        System.out.println(" 10 -> 2 - > 13 - > 11 -> 5 -> 6");

//        System.out.println(binarySearchTree.contains(14));
//        System.out.println("*****************************************");
//        System.out.println(binarySearchTree.maximumValue());
//        binarySearchTree.inorderTraversal();

        BinaryTree binaryTree =new BinaryTree();

        binaryTree.root = new Node(2);
        binaryTree.root.leftNode = new Node(7);
        binaryTree.root.rightNode = new Node(5);
        binaryTree.root.leftNode.rightNode = new Node(6);
        binaryTree.root.leftNode.leftNode = new Node(2);
        binaryTree.root.rightNode.rightNode = new Node(9);
        binaryTree.root.rightNode.rightNode.leftNode = new Node(4);
        binaryTree.root.leftNode.rightNode.rightNode = new Node(11);
        binaryTree.root.leftNode.rightNode.leftNode = new Node(5);

        System.out.println("Level order traversal => ");
        binaryTree.printLevelOrderForNodes();







    }
}
