package LinkedList12.PART_2.LeetCodeSolutions;

class ReverseLinkedList1 {

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode prev = null;
        ListNode first = head;
        ListNode second = head.next;

        while (second != null) {
            first.next = prev;
            prev = first;
            first = second;
            second = second.next;
        }
        first.next = prev;
        return first;
    }

    public static void printList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val);
            if (curr.next != null) System.out.print(" -> ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ReverseLinkedList1 solution = new ReverseLinkedList1();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.print("Original List: ");
        printList(head);

        ListNode reversed = solution.reverseList(head);

        System.out.print("Reversed List: ");
        printList(reversed);
    }
}
