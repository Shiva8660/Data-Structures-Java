package DP21;

// dp answer is in problem
public class subSetSum3 {
    public static void main(String[] args) {
        int[] arr = {8, 6, 2, 4};
        int target = 11;

        System.out.println(findSubSetSum(0, 0, arr, target));
    }

    private static boolean findSubSetSum(int i, int sum, int[] arr, int target) {
        if(i == arr.length){
            if(sum == target) return true;
            return false;
        }
        if(sum + arr[i] > target) return false; // only valid if all numbers are positive
        boolean skip = findSubSetSum(i+1, sum, arr, target);
        boolean take = findSubSetSum(i+1, sum+arr[i], arr, target);
        return take || skip;
    }
}

