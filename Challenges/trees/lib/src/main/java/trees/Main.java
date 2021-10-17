package trees;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello");

        BinarySearchTree<Integer> binarySearchTree  = new BinarySearchTree<>();
        binarySearchTree.add(10);
        binarySearchTree.add(2);
        binarySearchTree.add(13);
        binarySearchTree.add(11);
        binarySearchTree.add(5);
        binarySearchTree.add(6);
//        System.out.println(binarySearchTree);
        System.out.println(" 10 -> 2 - > 13 - > 11 -> 5 -> 6");

        System.out.println(binarySearchTree.contains(14));
        System.out.println("*****************************************");
        System.out.println(binarySearchTree.maximumValue());
        binarySearchTree.inorderTraversal();





    }
}
