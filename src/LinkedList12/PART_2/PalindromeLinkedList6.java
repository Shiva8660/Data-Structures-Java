package LinkedList12.PART_2;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }

        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode secondHalf = reverseList(slow);
        ListNode firstHalf = head;

        ListNode temp = secondHalf;
        while (temp != null) {
            if (firstHalf.val != temp.val) {
                return false;
            }
            firstHalf = firstHalf.next;
            temp = temp.next;
        }

        reverseList(secondHalf);
        return true;
    }

    private ListNode reverseList(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
}

public class PalindromeLinkedList6 {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);

        Solution solution = new Solution();
        System.out.println(solution.isPalindrome(head)); // Output: true
    }
}

