package arrays;

import java.util.Scanner;

public class prac {
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


        for (int i = 0; i < n; i++) {
            while(k>0){
                res[i] = arr[n-k];
                k--;
            }


        }
    }
}
