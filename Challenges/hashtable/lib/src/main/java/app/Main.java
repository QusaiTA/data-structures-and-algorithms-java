package app;

import app.BinaryTree.BinaryTree;
import app.BinaryTree.Node;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("hello");

//        HashTable<String, Integer> hashTable = new HashTable<>();
//        hashTable.add("Ruaa", 300);
//        hashTable.add("Raghad", 400);
//        hashTable.add("Khair", 200);
//        hashTable.add("Jamal", 100);
//        hashTable.add("Doaa", 600);
//        hashTable.add("Farah", 700);
//        hashTable.add("Mohammad", 90000);
//        hashTable.add("Jemi", 800);
//        hashTable.add("Naim", 1000);
//        hashTable.add("Qusai", 1500);
//        hashTable.add("Deyaa", 10000);
//
//        System.out.println("The size is => " + hashTable.getSize());
//        System.out.println("The Qusai allowance is => " + hashTable.get("Qusai"));
//        System.out.println(hashTable.contains("Qusai"));
//        System.out.println(hashTable.getBucketIndex("Qusai"));
//        System.out.println(hashTable);

        HashTable<Integer,String>  sentence = new HashTable<>();
        sentence.add(1,"Once upon a time, there was a brave princess who...");
        sentence.add(2,"It was the best of times, it was the worst of times, it was the age of wisdom, it was the age of foolishness, it was the epoch of belief, it was the epoch of incredulity, it was the season of Light, it was the season of Darkness, it was the spring of hope, it was the winter of despair, we had everything before us, we had nothing before us, we were all going direct to Heaven, we were all going direct the other way – in short, the period was so far like the present period, that some of its noisiest authorities insisted on its being received, for good or for evil, in the superlative degree of comparison only...");
        sentence.add( 3,"It was a queer, sultry summer, the summer they electrocuted the Rosenbergs, and I didn’t know what I was doing in New York...");
        for(int i=0;i<sentence.getSize();i++){
            System.out.println(sentence.repeatedWord(sentence.get(i+1)));
        }

        BinaryTree<Integer> tree1 = new BinaryTree<>();
        BinaryTree<Integer> tree2 = new BinaryTree<>();

        tree1.root = new Node<>(10);
        tree1.root.left = new Node<>(20);
        tree1.root.right = new Node<>(25);
        tree1.root.right.right = new Node<>(40);
        tree1.root.right.left = new Node<>(50);
        tree1.root.right.left.right = new Node<>(60);


        tree2.root = new Node<>(15);
        tree2.root.left = new Node<>(20);
        tree2.root.right = new Node<>(25);
        tree2.root.right.right = new Node<>(40);
        tree2.root.right.left = new Node<>(55);
        tree2.root.right.left.right = new Node<>(60);

        System.out.println(Arrays.toString(intersection(tree1, tree2)));
    }

    public static Integer[] intersection(BinaryTree<Integer> tree1, BinaryTree<Integer> tree2){

        HashTable<Integer , Integer> hashTable = new HashTable<>();
        List<Integer> similarity = new ArrayList<>();
        for(int i : tree1.inOrder(tree1.root) ) {
            hashTable.add(i , 0);
        }
        List<Integer> list = tree2.inOrder(tree2.root);
        for(int x : list){
            if(hashTable.contains(x)) {
                similarity.add(list.get(list.indexOf(x)));
            }
            else {
                hashTable.add(list.get(list.indexOf(x)) , 0);
            }
        }
        return similarity.toArray( new Integer[0]);

    }


    }

