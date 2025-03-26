package arrays;

import java.util.Scanner;

public class RotateArray2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter value of k: ");
        int k = sc.nextInt();

        k = k % n; // To handle cases where k >= n
        int[] res = new int[n];

        // Rotate the array
        for (int i = 0; i < k; i++) {
            res[i] = arr[n - k + i];
        }
        for (int i = k; i < n; i++) {
            res[i] = arr[i - k];
        }

        System.out.println("Rotated Array: ");
        for (int ele : res) {
            System.out.print(ele + " ");
        }
    }
}
// 189 rotate array leet code - efficient code