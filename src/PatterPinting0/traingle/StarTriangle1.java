package PatterPinting.traingle;

import java.util.Scanner;

public class StarTriangle1 {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter n : ");
            int n = sc.nextInt();

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < i+1; j++) {
//                    System.out.print("* ");
//                    System.out.print((j+1) + " ");
                    System.out.print((char)(j+65) + " ");

                }
                System.out.println();
            }
        }
    }


