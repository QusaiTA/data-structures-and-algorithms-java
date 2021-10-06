package demo;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList1 = new LinkedList();
        linkedList1.append("1");
        linkedList1.append("2");
        linkedList1.append("3");
        linkedList1.append("4");
        linkedList1.append("5");
        linkedList1.append("11");
        linkedList1.append("12");



//        linkedList.insertAfter("G","Q");
//        linkedList.insertBefore("Qusai","Ahmad");
//        linkedList.insertAfter("C","A");
////        System.out.println("Hi");
        linkedList1.printNthFromEnd(3);
//        System.out.println(linkedList);


        LinkedList linkedList2 = new LinkedList();
        linkedList2.append("6");
        linkedList2.append("7");
        linkedList2.append("8");
        linkedList2.append("9");
        linkedList2.append("10");


        LinkedList linkedList3 = new LinkedList();

        System.out.println(linkedList3.zipList(linkedList1,linkedList2));





//        System.out.println(linkedList.datatoString());
//        System.out.println(linkedList.includes("Q"));



    }
}