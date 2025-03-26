package StringsAndStringBuilders;

import java.util.Scanner;

// toggle - > change a char from lower to upper if it  is lower else to upper
public class Input_a_StringAndToggle6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string : ");
        StringBuilder str = new StringBuilder(sc.nextLine());

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            int ascii = (int)ch;

            // I get to know now this is in lower case
//            if(ascii >=65 && ascii <= 90){
//                ascii += 32;
//                ch = (char)ascii;
//                str.setCharAt(i,ch);
//            }
//
//            // if it is lower case
//            else if(ascii >=97 && ascii <= 122){
//                ascii -= 32;
//                ch = (char)ascii;
//                str.setCharAt(i,ch);
//            }
            // you can wirte common things below

            if(ascii >=65 && ascii <= 90){
                ascii += 32;
            }
            else if(ascii >=97 && ascii <= 122){
                ascii -= 32;
            }
            ch = (char)ascii;
            str.setCharAt(i,ch);
        }
        System.out.println("After toggle the string is : " + str);
    }
}
