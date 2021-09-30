package demo.structer;

import org.w3c.dom.Node;

public class LinkedList<T>{


    public Node head;
    public int length;
    public LinkedList() {
        this.head = null;
    }

    public void insert(T data){
        Node newNode = new Node(data);
        if(this.head == null) {
            head = newNode;
        }
        else {
            Node temp = head;
            head = newNode;
            head.next = temp;

        }
        length++;

    }





}
