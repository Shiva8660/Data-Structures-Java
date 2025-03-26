package Recursion;

import java.util.Scanner;

public class PrintOneToN3 {
    private static void printNumber(int n,int num) {
        if(num > n) return;
        System.out.println(num);
        printNumber(n,num+1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();

        printNumber(n,1);
    }


}