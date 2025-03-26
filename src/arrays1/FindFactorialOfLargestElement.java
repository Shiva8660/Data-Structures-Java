package arrays;

import java.util.Scanner;

public class FindFactorialOfLargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid size");
            return;
        }

        int[] arr = new int[n];

        System.out.println("Enter array elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }

        System.out.println("The large number in array is : " + max);

        long fact = 1;
        for(int i=2;i<=max;i++){
            fact *= i;
        }

        System.out.println("The factorial of largest number is : " + fact);
    }
}
