package TwoDimArray;

public class MaxAndTotalSum1 {
    public static void main(String[] args) {
        int[][] arr = {{4, 5, 6},{-9, 5, 3},{10, 8, 19}};

        int max = Integer.MIN_VALUE;
        int sum = 0;

        for(int i=0;i< arr.length;i++){
            for (int j = 0; j < arr[i].length; j++) {
                max = Math.max(max,arr[i][j]);
                sum += arr[i][j];
            }
        }
        System.out.println("Max is : " + max);
        System.out.println("Total sum is : " + sum);
    }
}
