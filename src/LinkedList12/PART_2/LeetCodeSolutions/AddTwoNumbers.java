package LinkedList12.PART_2.LeetCodeSolutions;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        ListNode a = l1, b = l2;
        int carry = 0;

        while(a != null || b != null){
            int val1 = 0;
            int val2 = 0;

            if(a != null) val1 = a.val;
            if(b != null) val2 = b.val;

            int num = val1 + val2 + carry;
            ListNode newNode = new ListNode(num % 10);
            temp.next = newNode;
            temp = temp.next;

            if(num > 9) carry = 1;
            else carry = 0;

            if(a != null) a = a.next;
            if(b != null) b = b.next;
        }

        if(carry == 1) {
            ListNode newNode = new ListNode(1);
            temp.next = newNode;
        }

        return dummy.next;
    }

    public static ListNode buildList(int[] arr) {
        if(arr.length == 0) return null;
        ListNode head = new ListNode(arr[0]);
        ListNode current = head;
        for(int i = 1; i < arr.length; i++) {
            current.next = new ListNode(arr[i]);
            current = current.next;
        }
        return head;
    }

    public static void printList(ListNode head) {
        while(head != null) {
            System.out.print(head.val);
            if(head.next != null) System.out.print(" -> ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] num1 = {2, 4, 3};
        int[] num2 = {5, 6, 4};

        ListNode l1 = buildList(num1);
        ListNode l2 = buildList(num2);

        AddTwoNumbers solution = new AddTwoNumbers();
        ListNode result = solution.addTwoNumbers(l1, l2);

        printList(result);
    }
}

