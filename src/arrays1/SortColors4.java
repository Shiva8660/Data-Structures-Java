// leetcode -  75
package arrays;

// 1st solution
//class Solution {
//    public void sortColors(int[] nums) {
//        int noOfZeros = 0, noOfOnes = 0;
//
//        for(int i=0;i<nums.length;i++){
//            if(nums[i] == 0) noOfZeros++;
//            if(nums[i] == 1) noOfOnes++;
//        }
//
//        int count = 0;
//
//        for(int i=0;i<nums.length;i++){
//            if (i<noOfZeros) nums[count++] = 0;
//            else if (i<noOfOnes + noOfZeros) nums[count++] = 1;
//            else nums[count++] = 2;
//        }
//    }
//}

// dutch flag algorithm - method 2 => (In one pass i.e using only one loop)

class SortColors4{
    public static void main(String[] args) {

        int[] arr = {1, 0, 2, 0, 1, 2, 0, 2, 0, 1};
        int mid = 0, low = 0, high = arr.length-1;

        while(mid <= high){
            if(arr[mid]==0){
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                low++; mid++;
            }
            else if (arr[mid] == 1) {
                mid++;
            }
            else{  // arr[mid] == 2
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }
}