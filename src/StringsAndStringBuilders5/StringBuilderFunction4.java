package StringsAndStringBuilders;

public class StringBuilderFunction4 {
    public static void main(String[] args) {
        // TolowerCase and ToUpperCase and some methods are not missing in SB
        StringBuilder a = new StringBuilder("Shiva");
        StringBuilder b = new StringBuilder("Reddy");
        String c = a.toString();

        System.out.println(a.compareTo(b));
//        System.out.println(a.reverse());
        System.out.println(a.equals(c));

        // try yourself
    }
}
