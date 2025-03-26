package Strings;

public class LowerUpperCase4 {
    public static void main(String[] args) {
        String str = "ShIvA iS 20 yEaR oLd GuY";

        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());

        System.out.println();
        String x = str.toLowerCase();
        String y = str.toUpperCase();

        System.out.println(x);
        System.out.println(y);

        System.out.println();

        // now change actual string itself
        str = str.toLowerCase();
        System.out.println(str);

        // now about concat function
        System.out.println();
        String a = "abc";
        String b = "def";

        System.out.println(a+b);
        System.out.println(a.concat(b));
        System.out.println(a);
        a = a.concat(b);
        System.out.println(a);

    }
}
