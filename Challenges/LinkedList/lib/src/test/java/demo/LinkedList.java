/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package demo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {

    @Test
    @DisplayName("retrun true if the insertion done")
    public void isInserteDone() {
    LinkedList list = new LinkedList();
    list.append("Qusai");
    assertTrue(list.includes("Qusai"), "The method should return true to improve the inserting process");
     }


    @Test
    @DisplayName("retrun true if the multiple insertion done")
    public void insertMultinodes() {
        LinkedList list = new LinkedList();
        list.append("Qusai");
        list.append("Mohammad");
        list.append("Loai");
        assertTrue(list.includes("Qusai"), "The method should return true to improve the multiple insertion process");
        assertTrue(list.includes("Mohammad"), "The method should return true to improve the multiple insertion process");
        assertTrue(list.includes("Loai"), "The method should return true to improve the multiple insertion process");
    }

    @Test
    @DisplayName("retrun true if the node existing")
    public void findnodetrue() {
        LinkedList list = new LinkedList();
        list.append("C");
        assertTrue(list.includes("C"), "The method should return true  if the node existing");
    }

    @Test
    @DisplayName("retrun false if the node not existing")
    public void findnodefalse() {
        LinkedList list = new LinkedList();
        list.append("C");
        assertFalse(list.includes("A"), "The method should return false  if the node not existing");
    }

    @Test
    @DisplayName("retrun existing collection of value")
    public void returnCollection() {
        LinkedList list = new LinkedList();
        list.append("A");
        list.append("B");
        list.append("C");
        list.append("D");
        assertEquals(" Head -> A ->  B ->  C ->  D ->  Null", list.toString(),"");
    }
    @Test
    @DisplayName("retrun collection of value AFTER add values with AFTER Method")
    public void returnCollectionwithAfterMethod() {
        LinkedList list = new LinkedList();
        list.append("A");
        list.append("B");
        list.append("C");
        list.append("D");
        list.append("K");
        list.insertAfter("C","D");
        assertEquals(" Head -> A ->  B ->  C ->  D ->  C ->  K ->  Null", list.toString(),"");
    }

    @Test
    @DisplayName("retrun collection of value AFTER add values with BEFORE Method")
    public void returnCollectionwithBeforeMethod() {
        LinkedList list = new LinkedList();
        list.append("A");
        list.append("B");
        list.append("C");
        list.append("D");
        list.append("K");
        list.insertBefore("C","Q");
        assertEquals(" Head -> A ->  B ->  Q ->  C ->  D ->  K ->  Null", list.toString(),"");
    }
    @Test
    @DisplayName("retrun the node with the given index")
    public void returnNodeFromTheLast() {
        LinkedList list = new LinkedList();
        list.append("A");
        list.append("B");
        list.append("C");
        list.append("D");
        list.append("K");


        assertEquals("B", list.printNthFromEnd(3).getData());
    }

    @Test
    @DisplayName("return the zipped List")
    public void zipList() {
        LinkedList list1 = new LinkedList();
        list1.append("A");
        list1.append("B");
        list1.append("C");
        list1.append("D");
        list1.append("E");

        LinkedList list2 = new LinkedList();
        list2.append("F");
        list2.append("G");
        list2.append("H");
        list2.append("I");
        list2.append("J");


        LinkedList zippedList = new LinkedList();
        String expectedOutput =" Head -> A ->  F ->  B ->  G ->  C ->  H ->  D ->  I ->  E ->  J ->  Null";
        assertEquals(expectedOutput,zippedList.zipList(list1,list2));



    }



}