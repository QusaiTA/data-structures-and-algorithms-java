package trees;

import java.util.LinkedList;
import java.util.Queue;

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
//
//        System.out.println(binarySearchTree.contains(14));
//        System.out.println("*****************************************");
//        System.out.println(binarySearchTree.maximumValue());
//        binarySearchTree.inorderTraversal();
//
//        BinaryTree binaryTree =new BinaryTree();
//
//        binaryTree.root = new Node(2);
//        binaryTree.root.leftNode = new Node(7);
//        binaryTree.root.rightNode = new Node(5);
//        binaryTree.root.leftNode.rightNode = new Node(6);
//        binaryTree.root.leftNode.leftNode = new Node(2);
//        binaryTree.root.rightNode.rightNode = new Node(9);
//        binaryTree.root.rightNode.rightNode.leftNode = new Node(4);
//        binaryTree.root.leftNode.rightNode.rightNode = new Node(11);
//        binaryTree.root.leftNode.rightNode.leftNode = new Node(5);
//
//        System.out.println("Level order traversal => ");
//        binaryTree.printLevelOrderForNodes();
//        System.out.println("*********************");
//
//        System.out.println(binarySearchTree.sumOdd(binarySearchTree.root));

        KaryTree <Integer> karyTree=new KaryTree<>(6);
        karyTree.add(15);
        karyTree.add(30);//0
        karyTree.add(10);//1
        karyTree.add(6);//2
        karyTree.add(3);//3
        karyTree.add(15);//4
        karyTree.add(24);//5


        System.out.println(fizzBuzz(karyTree).root.children.get(0).data);
        System.out.println(fizzBuzz(karyTree).root.children.get(1).data);
        System.out.println(fizzBuzz(karyTree).root.children.get(2).data);
        System.out.println(fizzBuzz(karyTree).root.children.get(3).data);
        System.out.println(fizzBuzz(karyTree).root.children.get(4).data);
        System.out.println(fizzBuzz(karyTree).root.children.get(5).data);









    }
    public static KaryTree<String> fizzBuzz(KaryTree<Integer> tree){
        KaryTree<String> newTree = new KaryTree<>(tree.K);
        Queue<KaryNode<Integer>> karyNodeQueue = new LinkedList<>();
        if(tree.root != null){
            karyNodeQueue.add(tree.root);
            while (!karyNodeQueue.isEmpty()){
                KaryNode<Integer> currentNode = karyNodeQueue.poll();
                String current;
                if(currentNode.data % 3 == 0 && currentNode.data % 5 == 0){
                    current = "FizzBuzz";
                } else if(currentNode.data % 3 == 0) {
                    current = "Fizz";
                }  else if(currentNode.data % 5 == 0) {
                    current = "Buzz";
                } else {
                    current = currentNode.data.toString();
                }

                newTree.add(current);
                if(!currentNode.children.isEmpty()){
                    karyNodeQueue.addAll(currentNode.children);
                }
            }
        }
        return newTree;
    }

}
