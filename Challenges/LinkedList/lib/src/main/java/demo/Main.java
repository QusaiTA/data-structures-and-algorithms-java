package demo;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.insert("Q");
        linkedList.insert("U");
        linkedList.insert("Qusai");
        linkedList.insert("A");
        linkedList.insert("I");
        linkedList.insertAfter("G","Q");
        linkedList.insertBefore("Qusai","Ahmad");
        linkedList.insertAfter("C","A");
        System.out.println("Hi");
        linkedList.printNthFromEnd(3);
        System.out.println(linkedList);






        System.out.println(linkedList.datatoString());
        System.out.println(linkedList.includes("Q"));



    }
}