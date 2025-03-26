package Recursion;

import java.util.Scanner;

public class HCF13 {

    // hcf = highest common factor
    private static int hcf(int a, int b) {
        for (int i = Math.min(a,b); i >=1; i--) { // TC = O(min(a,b))
            if(a%i == 0 && b%i == 0) return i;
        }
        return 1;
    }

    // gcd = greatest common divisor
    public static int gcd(int a, int b){
        if(b%a == 0) return a;
        return gcd(b%a,a);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st number : ");
        int a = sc.nextInt();

        System.out.print("Enter 2st number : ");
        int b = sc.nextInt();

        // Iterative
//        int num = hcf(a,b);
//        System.out.println("The hcf is : " + num);

        // Recursive
        int n = gcd(a,b);
        System.out.println("The hcf is : " + n);
    }
}
