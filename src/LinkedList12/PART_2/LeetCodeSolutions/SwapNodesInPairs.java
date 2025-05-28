package LinkedList12.PART_2.LeetCodeSolutions;

public class SwapNodesInPairs {
    public static ListNode swapPairs(ListNode head) {
        ListNode temp = head;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode prev = dummy;

        while (temp != null && temp.next != null) {
            ListNode first = temp;
            ListNode second = temp.next;

            prev.next = second;
            first.next = second.next;
            second.next = first;

            prev = first;
            temp = first.next;
        }

        return dummy.next;
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

        printList(head);
        ListNode result = swapPairs(head);
        printList(result);
    }
}

