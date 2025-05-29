package LinkedList12.PART_2.LeetCodeSolutions;

public class ReorderList {

    public ListNode reverseList(ListNode head){
        if(head == null) return head;
        ListNode prev = null;
        ListNode first = head;
        ListNode second = head.next;

        while(second != null){
            first.next = prev;
            prev = first;
            first = second;
            second = second.next;
        }
        first.next = prev;
        return first;
    }

    public void reorderList(ListNode head) {
        if(head == null || head.next == null) return;
        ListNode prev = null, slow = head, fast = head;
        while(fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        if(prev != null) prev.next = null;
        slow = reverseList(slow);

        ListNode dummy = new ListNode(-1);
        ListNode a = head, b = slow;

        while(a != null && b != null){
            dummy.next = a;
            a = a.next;
            dummy = dummy.next;

            dummy.next = b;
            b = b.next;
            dummy = dummy.next;
        }

    }

    public static void printList(ListNode head) {
        while(head != null) {
            System.out.print(head.val);
            if(head.next != null) System.out.print(" -> ");
            head = head.next;
        }
        System.out.println();
    }

    public static ListNode buildList(int[] values) {
        if(values.length == 0) return null;
        ListNode head = new ListNode(values[0]);
        ListNode current = head;
        for(int i = 1; i < values.length; i++) {
            current.next = new ListNode(values[i]);
            current = current.next;
        }
        return head;
    }

    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4, 5,6};
        ListNode head = buildList(input);
        System.out.print("Original List: ");
        printList(head);

        ReorderList solution = new ReorderList();
        solution.reorderList(head);

        System.out.print("Reordered List: ");
        printList(head);
    }
}
