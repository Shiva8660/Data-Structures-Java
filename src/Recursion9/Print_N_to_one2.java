package Recursion;
import java.util.Scanner;

// 5 4 3 2 1
public class Print_N_to_one2 {
    private static void printNum(int n) {
        if(n==0) return;
        System.out.println(n);
        printNum(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();

        printNum(n);
    }
}

// 1 2 3 4 5 -> only one line Interchange
//public class Print_N_to_one2 {
//    private static void printNum(int n) {
//        if(n==0) return;
//        printNum(n-1);
//        System.out.println(n);
//
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number : ");
//        int n = sc.nextInt();
//
//        printNum(n);
//    }
//}


