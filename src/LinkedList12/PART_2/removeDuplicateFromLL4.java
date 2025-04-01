package LinkedList12.PART_2;

public class removeDuplicateFromLL4 {

    public static void PrintNodes(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val);
            temp = temp.next;
        }
        System.out.println();
    }


    public static Node removeDup(Node head, int val) {

        if(head == null) return head;

        Node dummy = new Node(100);
        dummy.next = head;

        Node prev = dummy;
        Node temp = head;

        while(temp != null){
            if(temp.val == val) prev.next = temp.next;
            else prev = prev.next;
            temp = temp.next;

        }
        return dummy.next;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        Node b = new Node(2);
        Node c = new Node(6);
        Node d = new Node(3);
        Node e = new Node(4);
        Node f = new Node(5);
        Node g = new Node(6);

        head.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;

        int val = 7;

        PrintNodes(head);
        Node updatedHead = removeDup(head,val);
        PrintNodes(updatedHead);

    }
}
