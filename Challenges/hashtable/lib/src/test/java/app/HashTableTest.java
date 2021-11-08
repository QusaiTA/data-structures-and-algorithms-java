/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package app;

import app.BinaryTree.BinaryTree;
import app.BinaryTree.Node;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class HashTableTest {
    BinaryTree<Integer> tree1;
    BinaryTree<Integer> tree2;
    BinaryTree<Integer> tree3;
    BinaryTree<Integer> tree4;
    BinaryTree<Integer> tree5;
    BinaryTree<Integer> tree6;

    HashTable<String, Integer> hashTable = new HashTable<>();

    @Test
    public void addingTest(){
        hashTable.add("Test",10);
        assertTrue(hashTable.contains("Test"));
    }

    @Test
    public void getTest(){
        hashTable.add("Test",10);
        assertEquals(10,hashTable.get("Test"));
    }

    @Test
    public void testNull(){
        hashTable.add("Test",10);
        assertNull(hashTable.get("notTest"));
    }

    @Test
    public void handleCollision(){
        hashTable.add("Test1",10);
        hashTable.add("Test2",20);
        hashTable.add("Test3",30);
        hashTable.add("Test4",40);

        assertEquals(4,hashTable.getSize());
    }

    @Test
    public void retrieveFromCollision(){
        hashTable.add("Test1",10);
        hashTable.add("Test2",20);
        hashTable.add("Test3",30);
        hashTable.add("Test4",40);
        hashTable.add("Test1",10);
        hashTable.add("Test2",20);
        hashTable.add("Test3",30);
        hashTable.add("Test4",40);

        assertEquals(40,hashTable.get("Test4"));
    }


    @Test
    public void testRepeated(){
        String testCaseString = "Hello my name is Qusai Hello Again";
        String outPut = hashTable.repeatedWord(testCaseString);
        assertEquals("hello" , outPut);
    }


    // Test with punctuation

    @Test
    public void testWithPunctuation(){
        String testCaseString = "Hello, my, name. is Qusai Hello Again";
        String outPut = hashTable.repeatedWord(testCaseString);
        assertEquals("hello" , outPut);
    }

    // Test no repeated words

    @Test
    public void noRepeatedTest(){
        String testCaseString = "Hello, my, name. is Qusai Again";
        String outPut = hashTable.repeatedWord(testCaseString);
        assertNull(outPut);
    }

    @Test
    public void testInterSection(){

        new Main();
        tree1 = new BinaryTree<>();
        tree2 = new BinaryTree<>();

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

        Integer[] arr = Main.intersection(tree1,tree2);
        Integer[] expectedArray = {20,60,25,40};
        assertArrayEquals(expectedArray, arr);
    }

    @Test
    public void testNoInterSection(){

        new Main();
        tree3 = new BinaryTree<>();
        tree4 = new BinaryTree<>();

        tree3.root = new Node<>(10);
        tree3.root.left = new Node<>(20);

        tree4.root = new Node<>(15);
        tree4.root.left = new Node<>(30);

        Integer[] arr = Main.intersection(tree3,tree4);
        Integer[] expectedArray = {};
        assertArrayEquals(expectedArray, arr);
    }

    @Test
    public void testEmptyTrees(){

        new Main();
        tree5 = new BinaryTree<>();
        tree6 = new BinaryTree<>();
        Integer[] arr = Main.intersection(tree5,tree6);

        Integer[] expectedArray = {};
        assertArrayEquals(expectedArray, arr);
    }
}
