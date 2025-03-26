package Strings;

public class CountDigitsWithoutAnyLoop9 {
    public static void main(String[] args) {
        int n = 1234;

        String str = "" + n;

        System.out.println("Total digits of a number : " + str.length());

        //directly
        String str1 = Integer.toString(n);
        System.out.println("Total digits of a number : "+str1.length());

        long x = 155416244;
        String str2 = Long.toString(x);
        System.out.println("The length of a number : " + str2.length());



    }
}
