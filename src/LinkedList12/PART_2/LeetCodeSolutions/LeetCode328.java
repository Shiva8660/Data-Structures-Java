package LinkedList12.PART_2.LeetCodeSolutions;

// Problem: Odd Even Linked List

class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class LeetCode328 {
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode oddPointer = head;
        ListNode evenPointer = head.next;

        ListNode oddHead = oddPointer;
        ListNode evenHead = evenPointer;

        while (evenPointer != null && evenPointer.next != null) {
            oddPointer.next = evenPointer.next;
            oddPointer = oddPointer.next;

            evenPointer.next = oddPointer.next;
            evenPointer = evenPointer.next;
        }

        oddPointer.next = evenHead;
        return oddHead;
    }


    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + (head.next != null ? " -> " : ""));
            head = head.next;
        }
        System.out.println();
    }


    public static void main(String[] args) {

        ListNode head = new ListNode(1,
                new ListNode(2,
                        new ListNode(3,
                                new ListNode(4,
                                        new ListNode(5)))));

        LeetCode328 solution = new LeetCode328();
        ListNode result = solution.oddEvenList(head);
        printList(result);
    }
}

