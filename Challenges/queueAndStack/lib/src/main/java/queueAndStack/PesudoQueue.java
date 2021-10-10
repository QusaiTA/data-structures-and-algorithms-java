package queueAndStack;

public class PesudoQueue {

    Stack firstStack = new Stack();
    Stack secondStack = new Stack();

    public String enQueue (String data){
        while (!firstStack.isEmpty()){
            secondStack.push(firstStack.pop());
        }

        firstStack.push(data);

        while (!secondStack.isEmpty()){
            firstStack.push(secondStack.pop());
        }
        return data;
    }

    public String deQueue(){
        if (firstStack.isEmpty()){
            System.out.println("Stack empty");
        }
        String data = firstStack.peek();
        firstStack.pop();
        return data;
    }

}
