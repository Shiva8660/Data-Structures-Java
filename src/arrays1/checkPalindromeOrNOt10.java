package arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class checkPalindromeOrNOt10 {

// method 1
//    public static boolean isPalindrome(int[] arr) {
//        int low = 0, high = arr.length-1;
//
//        while(low < high){
//            if(arr[low] != arr[high]){
//                return false;
//            }
//            low++; high--;
//        }
//        return true;
//    }

// Method 2
    public static boolean isPalindrome(int[] arr) {
        int n = arr.length;
        for(int i=0;i<n/2;i++){
            if(arr[i] != arr[n-1-i]){
                return false;
            }
       }
       return true;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n : ");
        int n = sc.nextInt();

        if(n<=0){
            System.out.println("Invalid size");
        }

        int[] arr = new int[n];

        System.out.println("Enter array elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }



        boolean flag = isPalindrome(arr);

        if(flag){
            System.out.println("This is palindrome");
        }
        else {
            System.out.println("This is not a palindrome");
        }
    }


}
