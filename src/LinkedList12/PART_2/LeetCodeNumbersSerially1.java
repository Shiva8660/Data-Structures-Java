//package LinkedList12.PART_2;

// leetcode 237, 876, 2095 , 160, 141, 142,202(HomeWork),83,82,61


// 1st approach - for LeetCode 876

//class Solution {
//    public ListNode middleNode(ListNode head) {
//
//        ListNode temp = head;
//        int len = 0;
//
//        while(temp != null){
//            temp = temp.next;
//            len++;
//        }
//
//        int mid = len/2 + 1;
//        temp = head;
//
//        for(int i=0;i<mid-1;i++){
//            temp = temp.next;
//        }
//        return temp;
//    }
//}

// 2nd approach

//class Solution {
//    public ListNode middleNode(ListNode head) {
//        ListNode slow = head;
//        ListNode fast = head;
//
//        while(fast != null && fast.next != null){
//            slow = slow.next;
//            fast = fast.next.next;
//        }
//        return slow;
//    }
//
//}

// difference
// while(fast != null && fast.next != null) -> true
// while(fast.next != null && fast != null) -> null don't have anything called next

