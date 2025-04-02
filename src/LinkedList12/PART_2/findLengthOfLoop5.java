package LinkedList12.PART_2;

public class findLengthOfLoop5 {

    public static int findLength(Node head) {
        Node slow = head, fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast) return getLength(slow);
        }
        return -1;
    }

    public static int getLength(Node slow){
        Node temp = slow;
        int length = 1;

        while(temp.next != slow){
            temp = temp.next;
            length++;
        }
        return length;
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
        g.next = b;

        int sizeOfLoop = findLength(head);
        System.out.println("The size of loop is : " +sizeOfLoop);

    }
}
