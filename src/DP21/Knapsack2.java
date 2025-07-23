package DP21;

//public class Knapsack2 {
//
//    // TC = (2^n)
//    public static int profit(int i, int[] price, int[] weight, int C){
//        if(i == weight.length) return 0;
//
//        int skip = profit(i+1, price, weight, C);
//        if(weight[i] > C) return skip;
//
//        int pick = price[i] + profit(i+1, price, weight, C-weight[i]);
//
//        return Math.max(pick, skip);
//    }
//
//
//    public static void main(String[] args) {
//        int[] price = {5, 3, 9, 16};
//        int[] weight = {1, 2, 8, 10};
//
//        int c = 8;
//
//        System.out.println(profit(0, price, weight, c));
//    }
//}

import java.util.Arrays;

public class Knapsack2 {

    // TC = (n*c) , sc = (n*c)
    public static int profit(int i, int[] price, int[] weight, int C, int[][] dp){
        if(i == weight.length) return 0;

        if(dp[i][C] != -1) return dp[i][C];

        int skip = profit(i+1, price, weight, C, dp);
        if(weight[i] > C) return dp[i][C] = skip;

        int pick = price[i] + profit(i+1, price, weight, C-weight[i], dp);

        return dp[i][C] = Math.max(pick, skip);
    }


    public static void main(String[] args) {
        int[] price = {5, 3, 7, 16};
        int[] weight = {1, 2, 8, 10};
        int n = price.length;

        int c = 8;
        int[][] dp = new int[n][c+1];

        for (int i = 0; i < dp.length; i++) {
            Arrays.fill(dp[i], -1);
        }

        System.out.println(profit(0, price, weight, c, dp));
    }
}
