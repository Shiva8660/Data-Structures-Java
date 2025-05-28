package LinkedList12.PART_2.LeetCodeSolutions;

public class OddEvenLinkedList {
    public static ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode a = head;
        ListNode b = head.next;

        ListNode tempA = a;
        ListNode tempB = b;

        while (tempB != null && tempB.next != null) {
            tempA.next = tempB.next;
            tempA = tempA.next;

            tempB.next = tempA.next;
            tempB = tempB.next;
        }

        tempA.next = b;

        return a;
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        printList(head);
        ListNode result = oddEvenList(head);
        printList(result);
    }
}

