package arrays;

import java.util.Scanner;

public class Reverse_array1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements : ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        // 1st method
//        for(int i=0;i<n/2;i++){
//            int temp = arr[i];
//            arr[i] = arr[n-1-i];
//            arr[n-1-i] = temp;
//        }
//
//        for(int ele : arr){
//            System.out.print(ele + " ");
//        }

        // 2nd method using two pointer method

      //  int i = 2, j = 5; // specify index if you want part of array to be  reverse
        int i = 0, j = n-1; // full array reverse

        while(i<j){
            swapValue(arr,i,j);
            i++;
            j--;
        }

        for(int ele : arr){
            System.out.print(ele + " ");
        }

    }

    public static void swapValue(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
