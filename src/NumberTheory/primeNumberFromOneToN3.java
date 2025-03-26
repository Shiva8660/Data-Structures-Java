package NumberTheory;

import java.util.Scanner;

public class primeNumberFromOneToN3 {

    public static boolean checkPrime(int n){
        if(n < 2) return false;
        for(int i = 2; i*i < n; i++){
            if(n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        for (int i = 1; i < n; i++) {
            if(checkPrime(i)) System.out.print(i + " ");
        }

    }
}
