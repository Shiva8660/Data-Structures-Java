package LinkedList12.PART_2.LeetCodeSolutions;

class MaximumTwinSumOfALinkedList {

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

    public int pairSum(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode j = reverseList(slow);
        ListNode i = head;

        int maxSum = 0;

        while(j != null){
            maxSum = Math.max((i.val + j.val),maxSum);
            j = j.next;
            i = i.next;
        }
        return maxSum;
    }

    public static void main(String[] args) {
        MaximumTwinSumOfALinkedList solution = new MaximumTwinSumOfALinkedList();

        ListNode head = new ListNode(1);
        head.next = new ListNode(100);
        head.next.next = new ListNode(50);
        head.next.next.next = new ListNode(2);

        int result = solution.pairSum(head);
        System.out.println(result);
    }
}

