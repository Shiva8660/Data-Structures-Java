package LinkedList12.PART_1;

public class PrintNodesRecursively4 {

    public static void PrintRecursion(Node head){

        if(head == null) return;
        System.out.println(head.value);
        PrintRecursion(head.next);

    }

    public static void main(String[] args) {
        Node a = new Node(14);
        Node b = new Node(27);
        Node c = new Node(45);
        Node d = new Node(67);
        Node e = new Node(74);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        PrintRecursion(a);
    }

}
