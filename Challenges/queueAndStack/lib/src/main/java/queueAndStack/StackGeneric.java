package queueAndStack;

public class StackGeneric<T> {

    private NodeGeneric<T> top;

    public StackGeneric() {

    }
    public boolean isEmpty(){
        return top == null;
    }

    public void push(T data) {
        if (isEmpty()) {
            NodeGeneric<T> newNode = new NodeGeneric<T>(data);
            top = newNode;
        } else {
            NodeGeneric<T> newNode = new NodeGeneric<T>(data);
            newNode.setNext(top);
            top = newNode;

        }
    }
    public T pop() throws Exception{
        if(isEmpty()){
            throw new Exception("Stack is empty");
        } else {
            T data = top.getData();
            top = top.getNext();
            return data;
        }
    }

    public T peek() throws Exception{
        if (isEmpty()){
            throw new Exception("Stack is empty");
        } else {
            return top.getData();
        }
    }

    @Override
    public String toString() {
        return "Stack{" +
                "top=" + top +
                '}';
    }
}
