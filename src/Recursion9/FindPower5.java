package Recursion;

import java.util.Scanner;



public class FindPower5 {
    // method1 - Order(n) that is only -> O(b) - the power thing itself like total function calls
    public static int Power(int a, int b){
        if(b==0) return 1;
        return a * Power(a,b-1);
    }

    // method2 - Order(logn) -> O(logb)
    public static int Power1(int a, int b){
        if(b==0) return 1;

        int ans = Power1(a,b/2);

        if(b%2==0) return ans*ans;
        else return ans*ans*a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a : ");
        int a = sc.nextInt();
        System.out.print("Enter  b: ");
        int b = sc.nextInt();

        int pow = Power1(a,b);
        System.out.println(a+" power "+b+" is : " + pow);
    }
}

