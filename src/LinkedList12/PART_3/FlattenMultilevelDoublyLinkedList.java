package LinkedList12.PART_3;

// Problem: Flatten a Multilevel Doubly Linked List
// LeetCode: https://leetcode.com/problems/flatten-a-multilevel-doubly-linked-list/

class Dnode {
    public int val;
    public Dnode prev;
    public Dnode next;
    public Dnode child;

    public Dnode(int val) {
        this.val = val;
    }
}

public class FlattenMultilevelDoublyLinkedList {

    public Dnode flatten(Dnode head) {
        Dnode temp = head;

        while (temp != null) {
            Dnode n = temp.next;

            if (temp.child != null) {
                Dnode c = flatten(temp.child);
                Dnode d = c;
                while (d.next != null) d = d.next;

                temp.next = c;
                c.prev = temp;

                d.next = n;
                if (n != null) n.prev = d;

                temp.child = null;
            }

            temp = temp.next;
        }

        return head;
    }

    // Optional: For testing purposes, a method to print the flattened list
    public void printList(Dnode head) {
        Dnode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Optional: Main method to demonstrate usage
    public static void main(String[] args) {
        FlattenMultilevelDoublyLinkedList solution = new FlattenMultilevelDoublyLinkedList();

        // Construct nodes and child relationships manually for test case
        Dnode head = new Dnode(1);
        Dnode node2 = new Dnode(2);
        Dnode node3 = new Dnode(3);
        Dnode child1 = new Dnode(4);
        Dnode child2 = new Dnode(5);

        head.next = node2;
        node2.prev = head;
        node2.next = node3;
        node3.prev = node2;

        node2.child = child1;
        child1.next = child2;
        child2.prev = child1;

        Dnode flatHead = solution.flatten(head);
        solution.printList(flatHead); // Output: 1 2 4 5 3
    }
}

