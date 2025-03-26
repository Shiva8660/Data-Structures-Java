package BasicSortingAlgorithms;

import java.util.Arrays;

public class SelectionSort3 {
    public static void main(String[] args) {
        int[] arr = {29, 10, 14, 37, 13};
        int n = arr.length;
        int swaps = 0;

        System.out.println("-- The Unsorted Array --");
        System.out.println(Arrays.toString(arr));

        // Selection sort
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                swaps++;
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
        }

        System.out.println("\n-- The Sorted Array --");
        System.out.println(Arrays.toString(arr));
        System.out.println("The number of swaps are: " + swaps);
    }
}

