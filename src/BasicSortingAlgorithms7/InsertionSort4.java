package BasicSortingAlgorithms;

import java.util.Arrays;

public class InsertionSort4 {
    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6};
        int n = arr.length;
        int swaps = 0;

        for (int i = 1; i < n; i++) {
            int j = i;
            while (j >= 1 && arr[j] < arr[j - 1]) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
                swaps++;
            }
        }

        System.out.println("-- The Insertion Sort --");
        System.out.println(Arrays.toString(arr));
        System.out.println("The number of swaps is: " + swaps);
    }
}

