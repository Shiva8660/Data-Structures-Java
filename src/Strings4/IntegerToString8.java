package Strings;

import java.util.Scanner;

public class IntegerToString8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        System.out.println();

//        String s = "";
//        s += n;
        // use can do also directly
        String s = "" + n;
        System.out.println(s);
        System.out.println("The length of a number is : "+s.length());
    }
}
