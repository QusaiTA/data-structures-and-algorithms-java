package demo;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.insert("Q");
        linkedList.insert("U");
        linkedList.insert("Qusai");
        linkedList.insert("A");
        linkedList.insert("I");
        linkedList.insertAfter("Q","U");
        linkedList.insertBefore("Qusai","Khair");
        linkedList.insertAfter("C","A");





        System.out.println(linkedList.datatoString());
        System.out.println(linkedList.includes("Q"));



    }
}