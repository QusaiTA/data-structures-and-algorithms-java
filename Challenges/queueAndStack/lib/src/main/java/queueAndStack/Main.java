package queueAndStack;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");

        Stack stack = new Stack();
        stack.push("Q");
        stack.push("U");
        stack.push("S");
        stack.push("A");
        stack.push("I");

        System.out.println(stack);
        System.out.println("top element of Stack :" +stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        Queue queue = new Queue();
        queue.enqueue("Q");
        queue.enqueue("U");
        queue.enqueue("S");
        queue.enqueue("A");
        queue.enqueue("I");
        System.out.println(queue);
        System.out.println("top element of Queue :" + queue.peek());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());

    }
}
