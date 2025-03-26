package StringsAndStringBuilders;

import java.util.Scanner;

public class TakingInputInStringBuilder5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        StringBuilder str = new StringBuilder(sc.nextLine());
//        System.out.println(str);

        // or
        String m = sc.nextLine();
        StringBuilder x = new StringBuilder(m);

        System.out.println(x);

//        x.charAt(1) = 'r'; // error
        
        x.setCharAt(1, 'r');
        System.out.println(x);

    }
}
