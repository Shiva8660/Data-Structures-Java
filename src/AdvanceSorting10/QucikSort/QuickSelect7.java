package AdvanceSorting;


public class QuickSelect7 {

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

        for (int i = lo + 1; i <= hi; i++) {
            if (arr[i] <= pivot) smallerCount++;
        }

        int correctIdx = pivotIdx + smallerCount;
        swap(arr, pivotIdx, correctIdx);


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

    public static void quickSelect(int[] arr, int lo, int hi, int k) {
        if (lo > hi) return;
        // this is optional - not really required
//        if(lo == hi){
//            if(lo == k-1){
//                System.out.println("The "+k+"th element : " + arr[lo]);
//                return;
//            }
//        }

        int idx = partition(arr, lo, hi);

        if(idx == k-1){
            System.out.println("The "+k+"th element is : " + arr[idx]);
            return;
        }

        if(k-1 < idx) quickSelect(arr, lo, idx - 1,k);
        else quickSelect(arr, idx + 1, hi,k);
    }

    public static void main(String[] args) {
        // this is for kth smallest element
//        int[] arr = {4,9,1,2,6,5,8};
//        System.out.println("Original array:");
//        printArray(arr);
//
//
//        int k = 6;
//        quickSelect(arr, 0, n - 1,k);


        // this is going to find kth largest element from last
        int[] arr = {4,9,1,2,6,5,8};
        int n = arr.length;
        System.out.println("Original array:");
        printArray(arr);


        int k = 2;
        quickSelect(arr, 0, n - 1,n-k+1);

    }
}

