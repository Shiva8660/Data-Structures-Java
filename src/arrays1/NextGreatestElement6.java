package arrays;


public class NextGreatestElement6  {
    public static void main(String[] args) {
        int[] arr = {12, 8, 41, 37, 2, 49, 16, 28, 21};
        int n = arr.length;

        int[] res = new int[n];
        res[n-1] = -1;

// method 1 : brute force method

//
//        for(int i=0;i<n-1;i++){
//            int max = Integer.MIN_VALUE;
//            for(int j=i+1;j<n;j++){
//                max = Math.max(max,arr[j]);
//            }
//            res[i] = max;
//        }

     // method 2 : Optimized
        int nge = arr[n-1];
        for(int i=n-2;i>=0;i--){
            res[i] = nge;
            nge = Math.max(nge,arr[i]);
        }
        for(int ele : res){
            System.out.print(ele + " ");
        }

    }
}
