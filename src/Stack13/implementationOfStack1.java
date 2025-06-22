package Stack13;

class Stack{
    private int top;
    int[] stack;

    Stack(){
        this.top = -1;
        this.stack = new int[5];
    }
    Stack(int capacity){
        this.top = -1;
        this.stack = new int[capacity];
    }

    boolean isEmpty(){
        return top == -1;
    }
    boolean isFull(){
        return top == stack.length-1;
    }

    public void push(int data){
        if(isFull()) {
            System.out.println("Stack overFlow.");
            return;
        }
        stack[++top] = data;
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Stack underFolw..");
            return -1;
        }
        return stack[top--];
    }
    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is Empty..");
            return -1;
        }
        return stack[top];
    }

    public void show(){
        if(isEmpty()){
            System.out.println("Stack is empty..");
            return;
        }
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

}

public class implementationOfStack1 {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.println("Original stack..");
        stack.show();

        Stack revStack = new Stack();

        while(!stack.isEmpty()){
            revStack.push(stack.pop());
        }

        System.out.println();
        System.out.println("Reversed stack...");
        revStack.show();
    }
}
// Remaining
// Largest Rectangle in HistoGram
// Stock span Problem
// Number of visible of people in queue
