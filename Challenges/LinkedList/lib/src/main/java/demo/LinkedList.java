package demo;

public class LinkedList {
    private LinkedListNode head;
    //LinkListNodeTest.java
    //LinkedListNodeTest

    public void insert(String addedNode){
        int counter = 0;
        if(head == null){
            LinkedListNode node = new LinkedListNode(addedNode);
            head = node;

        }else {
            LinkedListNode existingNode = head;

            while (existingNode.getNext() != null){
                existingNode = existingNode.getNext();
            }
            LinkedListNode newNode = new LinkedListNode(addedNode);
            existingNode.setNext(newNode);
            counter ++;
            System.out.println(counter);
        }
    }

    public String datatoString(){
      String linkedList = " Head -> ";
      LinkedListNode node = head;
      while(node != null){
          linkedList += node.getData() + " ->  ";
          node = node.getNext();
      }



      return linkedList + "Null" ;


    }

   public boolean includes(String data){
        LinkedListNode node = head;
        while (node != null){
            if(node.getData() == data) {
                return true;
            } else {
                node = node.getNext();
            }
        }
       return false;
    }

    @Override
    public String toString() {
        return datatoString();
    }
}