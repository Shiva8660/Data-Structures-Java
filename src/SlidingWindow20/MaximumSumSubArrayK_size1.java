package SlidingWindow20;

//public class MaximumSumSubArrayK_size1 {
//    public static void main(String[] args) {
//        int[] arr = {10, 20, 1, 3, -40, 80, 10};
//        int k = 3;
//
//        int n = arr.length;
//        int maxSum = Integer.MIN_VALUE;
//
//        for(int i=0;i<n-k+1;i++){
//            int sum = 0;
//            for (int j = i; j < i+k; j++) {
//               sum += arr[j];
//            }
//            maxSum = Math.max(maxSum, sum);
//        }
//        System.out.println("The maximum sum is : " + maxSum);
//    }
//}

public class MaximumSumSubArrayK_size1 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 1, 3, -40, 80, 10};
        int k = 3;
        int n = arr.length;

        int sum = 0;
        for (int a = 0; a < k; a++) {
            sum += arr[a];
        }

        int i=1, j=k;

        int maxSum = Integer.MIN_VALUE;

        while (j < n){
            sum = sum - arr[i-1] + arr[j];
            maxSum = Math.max(maxSum, sum);
            i++; j++;
        }


        System.out.println("The max sum is : " + maxSum);
    }
}
