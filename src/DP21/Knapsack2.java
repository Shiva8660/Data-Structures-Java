package DP21;

public class Knapsack2 {

    // TC = (2^n)
    public static int profit(int i, int[] price, int[] weight, int C){
        if(i == weight.length) return 0;

        int skip = profit(i+1, price, weight, C);
        if(weight[i] > C) return skip;

        int pick = price[i] + profit(i+1, price, weight, C-weight[i]);

        return Math.max(pick, skip);
    }


    public static void main(String[] args) {
        int[] price = {5, 3, 9, 16};
        int[] weight = {1, 2, 8, 10};

        int c = 8;

        System.out.println(profit(0, price, weight, c));


    }
}
