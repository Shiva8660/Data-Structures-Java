package Recursion;

// Question - ConstructBinaryString of length n without consecutive 1's
// binary String = " 010100110101"

import java.util.Scanner;

public class ConstructBinaryString14 {

    public static void printBinaryString(String s,int n) {
        int len = s.length();

        if(len == n){
            System.out.println(s);
            return;
        }

        // If you want all possible  

        if(len == 0 || s.charAt(len-1) == '0'){
            printBinaryString(s+0,n);
            printBinaryString(s+1,n);
        }
        else printBinaryString(s+0,n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st number : ");
        int n = sc.nextInt();

        printBinaryString("",n);

    }


}
