package Recursion;

import java.util.Scanner;

public class Factorial1 {
    public static int Fact(int n){
        if(n==0 || n==1) return 1;
        return n * Fact(n-1);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n :");
        int n = sc.nextInt();

        System.out.println(Fact(n));
    }
}
