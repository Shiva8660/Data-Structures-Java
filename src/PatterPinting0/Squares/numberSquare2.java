package PatterPinting.Squares;

import java.util.Scanner;

public class numberSquare2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
               // System.out.print(i+1+" ");
                System.out.print(j+1+" ");
            }
            System.out.println();
        }
    }
}
