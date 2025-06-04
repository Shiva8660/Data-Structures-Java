package LinkedList12.PART_3;

class Node{
    int val;
    Node next;
    Node prev;

    Node(int val){
        this.val = val;
    }
}

public class DLL {

    public static void print(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void printReverse(Node tail){
        Node temp = tail;
        while(temp != null){
            System.out.print(temp.val + " ");
            temp = temp.prev;
        }
        System.out.println();
    }

    public static void printFromAnyNode(Node randomNode){
        Node temp = randomNode;
        while (temp.prev != null){
            temp = temp.prev;
        }
        print(temp);
    }

    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);

        a.next = b;  b.prev = a;
        b.next = c;  c.prev = b;
        c.next = d;  d.prev = c;

        print(a);
        printReverse(d);
        printFromAnyNode(c);


    }
}
