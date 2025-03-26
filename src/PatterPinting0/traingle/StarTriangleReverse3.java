package PatterPinting.traingle;

import java.util.Scanner;

public class StarTriangleReverse3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();

        int col = n;
        for (int i = 1; i <= n; i++) {
            // i+ j_max = n+1 -> j_max = n+1-i;
            for (int j = 1; j <= col; j++) {
                    System.out.print("* ");
            }
            col--;
            System.out.println();
        }
    }
}
