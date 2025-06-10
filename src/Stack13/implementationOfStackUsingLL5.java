package Stack13;

class Node {
    int val = 0;
    Node next;

    Node(int val){
        this.val = val;
    }
}

class StackLL{
    Node head = null;
    int size = 0;

    public boolean isEmpty(){
        return head == null;
    }

    public void push(int val) {
        Node temp = new Node(val);
        temp.next = head;
        head = temp;
        size++;
    }

    public void pop(){
        if(isEmpty()){
            System.out.println("Stack is empty..");
            return;
        }
        System.out.println(head.val);
        head = head.next;
        size--;
    }

    public void peek(){
        if(isEmpty()){
            System.out.println("Stack is empty..");
            return;
        }
        System.out.println(head.val);
    }

    public void getSize(){
        System.out.println();
        System.out.println(size);
    }

    public void showReverse(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void showOriginalOrder(){
        displayRec(head);
    }

    public void displayRec(Node temp){

        if(temp == null) return;
        displayRec(temp.next);
        System.out.print(temp.val + " ");
    }

}

public class implementationOfStackUsingLL5 {
    public static void main(String[] args) {
        StackLL stack = new StackLL();
        stack.peek();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        stack.showReverse();
        stack.pop();
        stack.showOriginalOrder();
        stack.getSize();
        System.out.println(stack.isEmpty());




    }
}
