package PrefixSum19;

public class prefixSumBasic1 {
    public static void main(String[] args) {
        int[] arr = {5, 1, 8, 2, 4, 3, 2 };

//        int sum = 0;

        for (int i = 1; i < arr.length; i++) {
//            sum += arr[i];
            arr[i] = arr[i] + arr[i-1];
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
