package StringsAndStringBuilders;

import java.util.Scanner;

public class SortWithoutAnyInBuiltMethod12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        StringBuilder str = new StringBuilder(sc.nextLine());

        for(int i=0;i<str.length();i++){
            for (int j = i+1; j < str.length(); j++) {
                if(str.charAt(i) > str.charAt(j)){
                    char temp = str.charAt(i);
                    str.setCharAt(i,str.charAt(j));
                    str.setCharAt(j,temp);
                }
            }
        }

        System.out.println("Sorted string is : " + str);
    }
}

// leetcode 242 -> valid anagram
