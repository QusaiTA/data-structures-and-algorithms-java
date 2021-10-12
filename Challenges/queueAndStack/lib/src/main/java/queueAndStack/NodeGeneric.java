package queueAndStack;

public class NodeGeneric<T> {


   private T data;
   private NodeGeneric<T> next;

    public NodeGeneric(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public NodeGeneric<T> getNext() {
        return next;
    }

    public void setNext(NodeGeneric<T> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "NodeGeniric{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }
}
