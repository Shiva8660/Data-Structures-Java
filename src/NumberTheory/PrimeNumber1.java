package NumberTheory;

import java.util.Scanner;

public class PrimeNumber1 {

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

        boolean bool = checkPrime(n);

        if(bool){
            System.out.println("Prime !");
        }
        else System.out.println("Not Prime !");
    }
}

