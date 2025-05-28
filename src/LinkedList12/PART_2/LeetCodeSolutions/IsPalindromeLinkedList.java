package LinkedList12.PART_2.LeetCodeSolutions;

class IsPalindromeLinkedList {

    public static class ListNode {
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

    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        if (fast != null) slow = slow.next;

        ListNode j = reverseList(slow);
        ListNode i = head;

        while (j != null) {
            if (j.val != i.val) return false;
            j = j.next;
            i = i.next;
        }
        return true;
    }

    public static void main(String[] args) {
        IsPalindromeLinkedList solution = new IsPalindromeLinkedList();

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(1);

        boolean result = solution.isPalindrome(head);
        System.out.println(result);
    }
}
