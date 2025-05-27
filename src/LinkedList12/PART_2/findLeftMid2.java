package LinkedList12.PART_2;

class Node{
    int val;
    Node next;

    Node(int val){
        this.val = val;
    }
}

public class findLeftMid2 {

    public static void PrintNodes(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // my method
//    private static Node deleteNode1(Node head) {
//        Node slow = head, fast = head;
//
//        while(fast.next != null && fast.next.next != null){
//            fast = fast.next.next;
//            slow = slow.next;
//        }
//        return slow;
//    }
    private static Node deleteNode2(Node head) {
        Node slow = head, fast = head, prev = null;

        while(fast != null && fast.next!= null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    
    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        Node f = new Node(50);


        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        PrintNodes(a);

        Node temp = deleteNode2(a);
        System.out.println("The middle node is : " + temp.val);
    }


}

