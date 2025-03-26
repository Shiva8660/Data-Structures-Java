package PatterPinting.traingle;

import java.util.Scanner;

public class OddNumberTriangle4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int num = 1;
            // Sout(2*j-1) -> Odd number
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num += 2;
            }

            System.out.println();
        }
    }
}
