package PatterPinting.CompositePatterns;

import java.util.Scanner;

public class NumberBridge7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();

        for(int k=1; k<=2*n-1;k++){
            System.out.print(k + " ");
        }
        System.out.println();

// shiva bhai
//        int jBaba = 4;
//        for (int i = 1; i <= n ; i++) {
//
//            for (int j = 1; j <= n+1-i; j++) {
//                System.out.print(j + " ");
//            }
//            for (int j = 1; j <= 2*i-1; j++) {
//                System.out.print(" " + " ");
//            }
//
//            for (int j = 1; j <= n+1-i; j++) {
//                System.out.print(j+jBaba + " ");
//            }
//            jBaba++;
//            System.out.println();
//
//        }
        // second shiva bhai techinque
//        int m = n;
//        n--;
//        for (int i = 1; i <= n ; i++) {
//            int num = 1;
//            for (int j = 1; j <= n + 1 - i; j++) {
//                System.out.print(j + " ");
//            }
//            for (int j = 1; j <= 2 * i - 1; j++) {
//                System.out.print(" " + " ");
//            }
//            for (int j = 1; j <= n + 1 - i; j++) {
//                System.out.print(j+m + " ");
//            }
//            m++;
//            System.out.println();
//        }
        n--;
        for (int i = 1; i <= n ; i++) {
            int num = 1;
            for (int j = 1; j <= n + 1 - i; j++) {
                System.out.print(num + " ");
                num++;
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(" " + " ");
                num++;
            }
            for (int j = 1; j <= n + 1 - i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}
