package NumberTheory;

import java.util.Scanner;

public class FactorsNumber2 {

    public static void printFactors(int n){
        for (int i = 1; i * i < n; i++) {
            if(n % i == 0){
                System.out.print(i + " ");
                if(i != (n/i)){
                    System.out.print(n/i + " ");
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        printFactors(n);
    }
}
