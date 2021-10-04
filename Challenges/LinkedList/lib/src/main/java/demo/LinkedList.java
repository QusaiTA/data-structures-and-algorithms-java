package demo;

public class LinkedList<T> {
    private LinkedListNode head;


    public void insert(String addedNode) {
        int counter = 0;
        if (head == null) {
            LinkedListNode node = new LinkedListNode(addedNode);
            head = node;

        } else {
            LinkedListNode existingNode = head;

            while (existingNode.getNext() != null) {
                existingNode = existingNode.getNext();
            }
            LinkedListNode newNode = new LinkedListNode(addedNode);
            existingNode.setNext(newNode);
            counter++;
            System.out.println(counter);
        }
    }

    public String datatoString() {
        String linkedList = " Head -> ";
        LinkedListNode node = head;
        while (node != null) {
            linkedList += node.getData() + " ->  ";
            node = node.getNext();
        }


        return linkedList + "Null";


    }

    public boolean includes(String data) {
        LinkedListNode node = head;
        while (node != null) {
            if (node.getData() == data) {
                return true;
            } else {
                node = node.getNext();
            }
        }
        return false;
    }

    public void insertAfter(String newVal, String currentVal) {
        LinkedListNode newNode = new LinkedListNode(newVal);

        LinkedListNode current = head;

        while (current != null) {
            if (current.getData().equals(currentVal)) {
                newNode.setNext(current.getNext());
                current.setNext(newNode);
                break;
            } else {
                current = current.getNext();
            }
        }
    }
    public void insertBefore(String reference, String data)
    {
        LinkedListNode current = head;
        LinkedListNode previous = current;

        while( current != null )
        {
            if( current.getData().equals(reference) )
            {
                LinkedListNode n = new LinkedListNode(data);
                n.setNext (current);
                previous.setNext(n);
                break;
            }
            previous = current;
            current = current.getNext();
        }
    }

    public LinkedListNode printNthFromEnd(int value)
    {
        int length = 0;
        LinkedListNode searchingNode = head;
        while (searchingNode.getNext() != null)
        {
            searchingNode = searchingNode.getNext();
            length++;
        }
        if (length < value) {
            System.out.println("list is empty");;
        }
        searchingNode = head;
        for (int i = 1; i < length - value + 1; i++) {
            searchingNode = searchingNode.getNext();
        }
        System.out.println(value+"th node from the end is "+searchingNode.getData());

        return searchingNode;
    }




    @Override
    public String toString () {
        return datatoString();
    }
}