import java.util.PriorityQueue;

class SLL1{
    private Node head;
    private Node tail;
    private int size;

    private class Node{
        int val;
        Node next;
        Node(int val) {
            this.val = val;
        }
    }

    void print() {
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    void insertAtHead(int val){
        Node temp = new Node(val);
        if(head == null) head = tail = temp;
        else{
         temp.next = head;
         head = temp;
        }
        size++;
    }

    void insertAtTail(int val){
        Node temp = new Node(val);
        if(head == null) head = tail = temp;
        else {
            tail.next = temp;
            tail = temp;
        }
        size++;
    }

    void insertAtMiddle(int idx, int val){

        if(idx < 0 || idx > size){
            System.out.println("Invalid Position !!");
            return;
        }
        if(idx == 0){
            insertAtHead(val);
            return;
        }
        if(idx == size) {
            insertAtTail(val);
            return;
        }

        Node newNode = new Node(val);
        Node temp = head;

        for(int i=0;i<idx-1;i++){
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        size++;
    }

    void deleteAtBegin(){
        if(head == null){
            System.out.println("No nodes are there !!");
            return;
        }

        head = head.next;
        size--;
    }
    void deleteAtAny(int idx){
        if(head == null ){
            System.out.println("No nodes are there !!");
            return;
        }
        if (head.next == null){
            head = tail = null;
        }
        if(idx < 0 || idx > size -1){
            System.out.println("Invalid position !!");
            return;
        }
        if(idx == 0){
            deleteAtBegin();
        }
        Node temp = head;
        for (int i = 0; i < idx-1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        size--;
    }
    int getSize() {
        return size;
    }


}


public class prac {



    public static void main(String[] args) {
        SLL1 ob = new SLL1();


        ob.insertAtHead(10);
        ob.insertAtHead(20);
        ob.insertAtHead(30);
        ob.insertAtHead(40);
        ob.print();

    }
}
