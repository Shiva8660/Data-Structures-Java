package AdvanceSorting.CycleSort;

public class findDublicElement {
}
// leetcode - 287
// leetcode - 448 , 41,645,442

// solution
//class Solution {
//
//    public void swap(int[] arr,int i,int j){
//        int temp = arr[i];
//        arr[i] = arr[j];
//        arr[j] = temp;
//    }
//    public int findDuplicate(int[] arr) {
//
//        int n = arr.length;
//
//        int i=0;
//
//        while(i < n){
//            if(arr[i] == i) i++;
//            if(arr[i] == arr[arr[i]]) return arr[i];
//            else swap(arr,i,arr[i]);
//        }
//        return 154;
//
//
//    }
//}
