package demo;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.insert("Q");
        linkedList.insert("U");
        linkedList.insert("Qusai");
        linkedList.insert("A");
        linkedList.insert("I");


        System.out.println(linkedList.datatoString());
        System.out.println(linkedList.includes("J"));



    }
}