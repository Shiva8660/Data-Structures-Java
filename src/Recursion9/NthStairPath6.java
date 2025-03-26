package Recursion;
import java.util.Scanner;

// same as fibonacciSeries only base case check
// you can climb 1 step or 2 step's at once
public class NthStairPath6 {

    public static int Stairs(int n){
        if(n <= 2) return n;
        else return Stairs(n-1) + Stairs(n-2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n :");
        int n = sc.nextInt();

        System.out.println(Stairs(n));
    }
}


// you can climb 1 step or 3 stair's at once
//public class NthStairPath6 {
//
//    public static int Stairs(int n){
//        if(n == 1 || n== 3 ) return n;
//        else return Stairs(n-1) + Stairs(n-3);
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter n :");
//        int n = sc.nextInt();
//
//        System.out.println(Stairs(n));
//    }
//}
