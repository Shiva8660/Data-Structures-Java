package TwoDimArray;

import java.util.Scanner;

public class PrintSpiralForm7 {
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

        System.out.println("\n---The matrix in spiral form---");
        int minr = 0, maxr = m - 1, minc = 0, maxc = n - 1;
        int totalElements = m * n;
        int count = 0;

        while (count < totalElements) {
            // Print the minimum row
            for (int j = minc; j <= maxc && count < totalElements; j++) {
                System.out.print(a[minr][j] + " ");
                count++;
            }
            minr++;

            // Print the maximum column
            for (int i = minr; i <= maxr && count < totalElements; i++) {
                System.out.print(a[i][maxc] + " ");
                count++;
            }
            maxc--;

            // Print the maximum row
            for (int j = maxc; j >= minc && count < totalElements; j--) {
                System.out.print(a[maxr][j] + " ");
                count++;
            }
            maxr--;

            // Print the minimum column
            for (int i = maxr; i >= minr && count < totalElements; i--) {
                System.out.print(a[i][minc] + " ");
                count++;
            }
            minc++;
        }

        scanner.close();
    }
}

