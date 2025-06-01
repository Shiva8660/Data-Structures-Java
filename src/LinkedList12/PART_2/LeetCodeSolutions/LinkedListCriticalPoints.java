package LinkedList12.PART_2.LeetCodeSolutions;

// Problem: Linked List Critical Points

public class LinkedListCriticalPoints {

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
        }
    }

    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int[] arr = {-1, -1};
        if (head == null || head.next == null || head.next.next == null) return arr;

        ListNode left = head, mid = head.next, right = head.next.next;
        int first = -1, last = -1;
        int idx = 1;
        int minDistance = Integer.MAX_VALUE;

        while (right != null) {
            if ((mid.val < left.val && mid.val < right.val) ||
                    (mid.val > left.val && mid.val > right.val)) {
                if (first == -1) {
                    first = idx;
                }
                if (last != -1) {
                    int dist = idx - last;
                    minDistance = Math.min(minDistance, dist);
                }
                last = idx;
            }
            idx++;
            left = left.next;
            mid = mid.next;
            right = right.next;
        }

        if (first == last) return arr;

        int maxDistance = last - first;
        arr[0] = minDistance;
        arr[1] = maxDistance;
        return arr;
    }

    // Helper to create linked list from array
    public static ListNode createList(int[] values) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        for (int val : values) {
            curr.next = new ListNode(val);
            curr = curr.next;
        }
        return dummy.next;
    }

    // Main method
    public static void main(String[] args) {
        LinkedListCriticalPoints solution = new LinkedListCriticalPoints();

        int[] values = {1, 3, 2, 2, 3, 2, 2, 2, 7};
        ListNode head = createList(values);

        int[] result = solution.nodesBetweenCriticalPoints(head);
        System.out.println("Minimum distance: " + result[0]);
        System.out.println("Maximum distance: " + result[1]);
    }
}

