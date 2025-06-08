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
        Stack st = new Stack();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

        st.show();

        System.out.println(st.isEmpty());
        System.out.println(st.isFull());
        

    }
}
