package arrays;


public class MergeSortedArrays5 {
    public static void main(String[] args) {
        int[] num1 = {11, 22, 33, 44};
        int m = num1.length;

        int[] num2 = {9, 19, 29, 39};
        int n = num2.length;

        int[] result = mergeTwoArrays(num1, m, num2, n);

        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    public static int[] mergeTwoArrays(int[] num1, int m, int[] num2, int n) {
        int[] sortedArray = new int[m + n];

        int i = 0, j = 0, k = 0;

        while (i < m && j < n) {
            if (num1[i] <=    num2[j]) {
                sortedArray[k++] = num1[i++];
            } else {
                sortedArray[k++] = num2[j++];
            }
        }
        while (i < m) {
            sortedArray[k++] = num1[i++];
        }
        while (j < n) {
            sortedArray[k++] = num2[j++];
        }

        return sortedArray;
    }
}
