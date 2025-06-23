package Queue14;

class Node{
    int val;
    Node next;

    Node(int val){
        this.val = val;
    }
}

class Que{
    private Node front = null , rear = null;
    private int size = 0;

    public boolean isEmpty(){
        return size == 0;
    }

    public void add(int val){
        Node temp = new Node(val);

        if(isEmpty()){
            front = rear = temp;
        } else {
            rear.next = temp;
            rear = temp;
        }
        size++;
    }

    public int remove(){
        if(isEmpty()){
            System.out.print("Queue is Empty..");
            return -1;
        }
        int val = front.val;
        front = front.next;
        size--;
        return val;
    }

    public int peek(){
        if(isEmpty()){
            System.out.print("Queue is Empty..");
            return -1;
        }
        return front.val;
    }

    public int getSize(){
        return size;
    }

    public void printQue(){
        if(isEmpty()){
            System.out.print("Queue is Empty..");
            return;
        }
        Node temp = front;

        while (temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class LinkedListImplementationOfQueue5 {
    public static void main(String[] args) {
        Que ob = new Que();
        ob.add(10); ob.add(20); ob.add(30); ob.add(40); ob.add(50);ob.add(60);
        ob.printQue();

        System.out.println(ob.remove());
        System.out.println(ob.remove());
        ob.printQue();
        System.out.println(ob.peek());
        System.out.println(ob.isEmpty());
        System.out.println(ob.getSize());
    }
}
