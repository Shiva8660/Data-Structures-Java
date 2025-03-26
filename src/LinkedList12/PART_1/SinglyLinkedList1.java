package LinkedList12.PART_1;

class Node{
    int value;
    Node next;

    Node(int value){
        this.value = value;
    }
}

public class SinglyLinkedList1 {
    public static void main(String[] args) {

        // creating nodes
        Node a = new Node(10); // A is head node
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);

        // linking nodes
        a.next = b;  // 10->20
        b.next = c;  // 10->20->30
        c.next = d;  // 10->20->30->40
        d.next = e;  // 10->20->30->40->50

        // printing all values
        System.out.println(a.value);
        System.out.println(b.value);
        System.out.println(c.value);
        System.out.println(d.value);
        System.out.println(e.value);

        System.out.println();

        // printing all values using a node only
        System.out.println(a.value);
        System.out.println(a.next.value);
        System.out.println(a.next.next.value);
        System.out.println(a.next.next.next.value);
        System.out.println(a.next.next.next.next.value);

    }
}
