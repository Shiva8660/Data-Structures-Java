package StringsAndStringBuilders;

public class EqualsOperator2 {
    public static void main(String[] args) {
        String a = "shiva";
        String b = "shiva";

        String c = new String(a);
        String d = "shi";
        d = d + "va";

        System.out.println(a==b);
        System.out.println(b==c);
        System.out.println(c==d);


        // below two method works properly
        System.out.println();
        System.out.println(a.equals(b));
        System.out.println(b.equals(c));
        System.out.println(c.equals(d));;

        System.out.println();
        // if true it gives 0 else 1
        System.out.println(a.compareTo(b));
        System.out.println(b.compareTo(c));
        System.out.println(c.compareTo(d));
    }
}
