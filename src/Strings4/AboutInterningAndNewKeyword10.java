package Strings;

public class AboutInterningAndNewKeyword10 {
    public static void main(String[] args) {
        // Interning

        String str = "Shiva";

        //In java strings are immutable
        // we can't change individual characters in java
        // error
//        str.charAt(0) = "s";
//        str.charAt(4) = "r";

        // but I can change whole string at once
        str = "Reddy";
        System.out.println(str);

        // these all same only In memory Reddy is stored at once only
        String x = "Reddy";
        String y = "Reddy";
        String z = x;

        System.out.println(x==y);
        System.out.println(x==z);

        // this is another string
        String a = new String("Reddy");
        System.out.println(x==a);
    }
}
