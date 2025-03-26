package arrays;

import java.util.Scanner;

public class findDuplicateElement9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        
    }
}
