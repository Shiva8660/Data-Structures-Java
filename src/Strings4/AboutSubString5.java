package Strings;

// substring - continuous part from the string

public class AboutSubString5 {
    public static void main(String[] args) {

        // Empty string
        String x = "";
        System.out.println(x.length());

        String str = "abcde";

        // this will print from given number to end
        System.out.println(str.substring(3));

        // this will print from where to where you want provide indexces
        // i to j-1
        System.out.println(str.substring(1,4));

        // nothing will print => 2 to 1 wrong
        System.out.println(str.substring(2,2));

        System.out.println(str.substring(2,3));
        System.out.println(str.substring(0,5));
        System.out.println(str.substring(0));


    }
}
