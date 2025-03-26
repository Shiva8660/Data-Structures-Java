
// nothing but character array only or collection of characters or  piece of texts

package Strings;

import java.util.Scanner;

public class basicString1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // reads only 1st word
//        System.out.print("Enter a name (don't write with spaces it will get delete) : ");
//        String str1 = sc.next();

        // reads full sentence
        System.out.println("Enter what you want reads everything : ");
        String str2 = sc.nextLine();
//
//        System.out.println(str1);
        System.out.println(str2);

    }

}
