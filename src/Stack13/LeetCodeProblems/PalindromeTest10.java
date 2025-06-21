package Stack13.LeetCodeProblems;
import java.util.Stack;

class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

class PalindromeChecker {
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> st = new Stack();
        ListNode temp = head;
        while (temp != null) {
            st.push(temp.val);
            temp = temp.next;
        }
        temp = head;
        while (temp != null) {
            if (temp.val != st.pop()) return false;
            temp = temp.next;
        }
        return true;
    }
}

public class PalindromeTest10 {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);

        PalindromeChecker checker = new PalindromeChecker();
        boolean result = checker.isPalindrome(head);
        System.out.println(result);
    }
}

