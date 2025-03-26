package TwoDimArray;

import java.util.Scanner;

public class prac {

    public static void print(int[][] arr) {
        int m = arr.length, n = arr[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nEnter the number of rows: ");
        int m = scanner.nextInt();

        System.out.print("Enter the number of columns: ");
        int n = scanner.nextInt();

        int[][] a = new int[m][n];

        System.out.println("\n--Enter elements--");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = scanner.nextInt();
            }
        }





    }
}
