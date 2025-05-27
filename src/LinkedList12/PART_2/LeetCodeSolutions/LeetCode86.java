package LinkedList12.PART_2.LeetCodeSolutions;

public class LeetCode86 {

    static class ListNode {
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

    static class Solution {
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
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + (head.next != null ? " -> " : ""));
            head = head.next;
        }
        System.out.println();
    }

    public static ListNode createList(int[] values) {
        if (values.length == 0) return null;

        ListNode head = new ListNode(values[0]);
        ListNode current = head;

        for (int i = 1; i < values.length; i++) {
            current.next = new ListNode(values[i]);
            current = current.next;
        }

        return head;
    }

    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 5};
        ListNode head = createList(values);

        printList(head);

        Solution solution = new Solution();
        ListNode rearrangedHead = solution.oddEvenList(head);

        printList(rearrangedHead);
    }
}

