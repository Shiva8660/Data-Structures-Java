///**
// * Definition for singly-linked list.
// * public class ListNode {
// *     int val;
// *     ListNode next;
// *     ListNode() {}
// *     ListNode(int val) { this.val = val; }
// *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
// * }
// */
//class Solution {
//    public ListNode removeNthFromEnd(ListNode head, int n) {
//        if(head == null || head.next == null) return null;
//
//        int size = 0;
//        ListNode temp = head;
//
//        while(temp != null){
//            temp = temp.next;
//            size++;
//        }
//
//        size = size - n;
//        temp = head;
//
//        for(int i=0;i<size-1;i++){
//            temp = temp.next;
//        }
//        if(n==1){
//            temp.next = null;
//        }
//        else temp.next = temp.next.next;
//
//        return head;
//
//
//    }
//}