package PatterPinting.Squares;

import java.util.Scanner;

public class alphabetSquare3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();


        for (int i = 0; i < n; i++) {
//            for (int j = 65; j < 65 + n; j++) {
//                System.out.print((char)j + " ");
//            }
            for (int j = 0; j < n; j++) {
                System.out.print((char)(j+65) + " ");
            }
            System.out.println();
        }
    }
}
