// LeetCode Problem 1669 : Merge In Between Linked Lists 

// class Solution {
//     public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {

//         ListNode aPointer = list1;
//         for(int i=0;i<a-1;i++){
//             aPointer = aPointer.next;
//         }

//         ListNode bPointer = aPointer.next;
//         for(int i=a;i<b;i++){
//             bPointer = bPointer.next;
//         }

//         ListNode tailOfList2 = list2;
//         while(tailOfList2.next != null){
//             tailOfList2 = tailOfList2.next;
//         }

//         aPointer.next = list2;
//         tailOfList2.next = bPointer.next;

//         return list1;

//     }
// }