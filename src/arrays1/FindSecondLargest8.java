package arrays;

import java.util.Scanner;

public class FindSecondLargest8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int secondLargestElement = findSecondLargest(arr);
        System.out.println("Second Largest Element is : " + secondLargestElement);
    }

    public static int findSecondLargest(int[] arr) {
        int max = Integer.MIN_VALUE;
        int sMax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                sMax = max;
                max = arr[i];
            }
            else if (arr[i] > sMax && arr[i] != max) {
                sMax = arr[i];
            }
        }

        return sMax;
    }
}
