package AdvanceSorting;

// Raghav sir code
import java.util.Arrays;

public class QuickSort5 {

    public static void printArray(int[] arr) {
        for(int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    public static int partition(int[] arr, int lo, int hi) {
        int pivot = arr[lo], pivotIdx = lo;
        int smallerCount = 0;

        // Counting elements <= pivot
        for (int i = lo + 1; i <= hi; i++) {
            if (arr[i] <= pivot) smallerCount++;
        }

        int correctIdx = pivotIdx + smallerCount;
        swap(arr, pivotIdx, correctIdx);

        // Partitioning
        int i = lo, j = hi;
        while (i < correctIdx && j > correctIdx) {
            if (arr[i] <= pivot) i++;
            else if (arr[j] > pivot) j--;
            else if(arr[i] > pivot && arr[j] <= pivot) {
                swap(arr, i, j);
            }
        }
        return correctIdx;
    }

    public static void quickSort(int[] arr, int lo, int hi) {
        if (lo > hi) return;

        // Pivot (arr[lo]) ko sahi jagah rako
        // & left part me <= pivot
        int idx = partition(arr, lo, hi);

        quickSort(arr, lo, idx - 1);
        quickSort(arr, idx + 1, hi);
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 4, 2, 7, 1, 10};
        System.out.println("Original array:");
        printArray(arr);

        quickSort(arr, 0, arr.length - 1);

        System.out.println("Sorted array:");
        printArray(arr);
    }
}
