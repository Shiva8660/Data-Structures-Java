package StringsAndStringBuilders;

import java.util.Scanner;

public class updateAllEvenPosition1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string : ");
        String str = sc.nextLine();

        String newStr = "";

        for (int i = 0; i < str.length(); i++) {
            if(i%2 == 0){
//                newStr += "a"; // string literal
                newStr += 'a'; // char literal - single qualon

            }
            else newStr += str.charAt(i);
        }
        System.out.println(newStr);
    }
}
// this is very costly method
