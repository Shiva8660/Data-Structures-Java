package LinkedList12.PART_1;

public class PrintingUsingTemp3 {

    public static void PrintNodes(Node head){
        // Node temp = head;
        while(head != null){
            System.out.println(head.value);
            head = head.next;
        }
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

        PrintNodes(a);

        System.out.println(a.value);

    }
}
