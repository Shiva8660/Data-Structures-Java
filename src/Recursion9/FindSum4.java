package Recursion;

import java.util.Scanner;

//public class FindSum4 {
//    public static void Sum(int n,int sum){
//        if(n==0) {
//            System.out.println("The sum is :" + sum);
//            return;
//        }
//        sum += n;
//        Sum(n-1,sum);
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number : ");
//        int n = sc.nextInt();
//
//        Sum(n,0);
//    }
//}

public class FindSum4 {
    public static int Sum(int n){
        if(n==0 || n==1) return n;
        return n + Sum(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();

        int sum = Sum(n);
        System.out.println("The sum is : " + sum);
    }
}
