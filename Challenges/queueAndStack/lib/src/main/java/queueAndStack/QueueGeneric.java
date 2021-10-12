package queueAndStack;

public class QueueGeneric<T> {

    private NodeGeneric<T> front;
    private NodeGeneric<T> rear;

    public QueueGeneric() {
    }

    public void enqueue(T data) {
        if (isEmpty()) {
            NodeGeneric<T> node = new NodeGeneric<T>(data);
            front = node;
            rear = node;
        } else {
            NodeGeneric<T> node1 = new NodeGeneric<T>(data);
            rear.setNext(node1);
            rear = node1;
        }
    }

    public T dequeue() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is empty");
        } else {
            T data = front.getData();
            front = front.getNext();
            return data;
        }
    }

    public T peek() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is empty");
        } else {
            return front.getData();
        }
    }

    public boolean isEmpty() {
        return front == null;
    }


}
