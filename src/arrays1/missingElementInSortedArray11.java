package arrays;

import java.util.Scanner;

public class missingElementInSortedArray11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid size");
            return;
        }

        int[] arr = new int[n];

        System.out.println("Enter sorted array elements (ascending order): ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int smallestMissingElement = findMissElement(arr,0,arr.length-1);

        System.out.println("Smallest missing element: " + smallestMissingElement);

    }

    private static int findMissElement(int[] arr,int low, int high) {
        // Method 1 - order of n
//        int start = arr[0];
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] != start) {
//                return start;
//            }
//            start++;
//        }
//        return start;
//    }
        // binary search - order of logn
        if (low > high) {
            return low;
        }
        int mid = (low + high) / 2;

        if (arr[mid] == mid) return findMissElement(arr, mid + 1, high);
        else return findMissElement(arr, low, mid - 1);
    }
}
