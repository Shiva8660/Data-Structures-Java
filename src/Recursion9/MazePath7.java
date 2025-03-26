package Recursion;

import java.util.Scanner;

import java.util.Scanner;

public class MazePath7 {

    // with 4 variables
    public static int maze1(int row, int col, int m, int n) {
        if (row == m || col == n) {
            return 1;
        }
        int rightWays = maze1(row, col + 1, m, n);
        int downWays = maze1(row + 1, col, m, n);
        return rightWays + downWays;
    }

    // with 2 variables only at traversing reverse becoz we know at the end we have to reach at (1,1)
    public static int maze2(int m, int n) {
        if (m == 1 || n == 1) {
            return 1;
        }
        int rightWays = maze2(m, n - 1);
        int downWays = maze2(m - 1, n);
        return rightWays + downWays;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.print("Enter m: ");
        int m = sc.nextInt();

//        System.out.println("Maze1: " + maze1(1, 1, m, n));
        System.out.println("Maze2: " + maze2(m, n));
    }
}
