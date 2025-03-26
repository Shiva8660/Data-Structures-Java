package PatterPinting.CompositePatterns;

import java.util.Scanner;

public class StarBridge6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();


        // 1st line
        for(int k=1; k<=2*n-1;k++){
            System.out.print("@ " + " ");
        }
        System.out.println();

        // this is mine
//        int m = n-1;
//
//        int leftStars = m;
//        int middleSpace = 1;
//        int rightStars = m;
//
//        for (int i = 1; i <= m; i++) {
//
//            // below for loop will print like this
//            // * * *
//            // * *
//            // *
//            for (int j = 1; j <= leftStars; j++) {
//                System.out.print("@ " + " ");
//            }
//            leftStars--;
//
//            // for middle spaces
//            for (int j = 1; j <= middleSpace; j++) {
//                System.out.print("  " + " ");
//            }
//            middleSpace += 2;
//
//            // below loop will print right stars
//            // * * *
//            // * *
//            // *
//            for (int j = 1; j <= rightStars; j++) {
//                System.out.print("@ " + " ");
//            }
//            rightStars--;
//
//            System.out.println();
//        }

        // sir code
        n--;
        for (int i = 1; i <= n ; i++) {
            // n+1-i -> increasing iterations

            for (int j = 1; j <= n+1-i; j++) {
                System.out.print("@ " + " ");
            }
            //2*i-1; or use nsp=1; nsp += 2;
            for (int j = 1; j <= 2*i-1; j++) {
                System.out.print("  " + " ");
            }
            for (int j = 1; j <= n+1-i; j++) {
                System.out.print("@ " + " ");
            }
            System.out.println();

        }
    }
}
