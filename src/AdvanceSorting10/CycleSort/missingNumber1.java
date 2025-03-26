// leetcode - 268

// 1st method
// using extra array -> t.c = O(n) and s.c = O(n)
//class Solution {
//    public int missingNumber(int[] arr) {
//        int n = arr.length;
//
//        boolean[] a = new boolean[n+1];
//
//        for(int i=0;i<n;i++){
//            a[arr[i]] = true;
//        }
//        for(int j=0;j<a.length;j++){
//            if(a[j] == false) return j;
//        }
//        return -1;
//
//
//    }
//}

// t.c = O(n) and s.c = O(1)
// we are modifying this array -> that is only first we are doing sorting

//class Solution {
//
//    public void swap(int[] arr,int i,int j){
//        int temp = arr[i];
//        arr[i] = arr[j];
//        arr[j] = temp;
//    }
//    public int missingNumber(int[] arr) {
//        int n = arr.length;
//
//        int i=0;
//
//        while(i < n){
//            if(arr[i]==n || arr[i] == i) i++;
//            else swap(arr,i,arr[i]);
//        }
//
//        for(i=0;i<n;i++){
//            if(i != arr[i]) return i;
//        }
//        return i;
//
//    }
//}

// magical solution
// we are not modifying or sorting just simply calculating using formulae

//class Solution {
//    public int missingNumber(int[] arr) {
//        int n = arr.length;
//
//        int countSum = 0;
//        for(int i=0;i<n;i++){
//            countSum += arr[i];
//        }
//
//        return ((n*(n+1))/2 - countSum);
//    }
//}





