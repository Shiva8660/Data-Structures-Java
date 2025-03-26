package StringsAndStringBuilders;

public class AboutStringBuildersMethods7 {
    public static void main(String[] args) {

        // see you can append all these things easily using append method
        StringBuilder s = new StringBuilder("abc");
        System.out.println(s);

        s.append(8);
        System.out.println(s);

        s.append('*');
        System.out.println(s);

        s.append("xyz");
        System.out.println(s);

        char[] ch = {'s','h','i','v','a'};
        s.append(ch);
        System.out.println(s);

//        int[] arr = {1,2,3,4,5};
//        s.append(arr); // does not work , address is appended
//        System.out.println(s);

        StringBuilder t = new StringBuilder("pqr");
        s.append(t);
        System.out.println(s);

//        s += "reddy"; // -> error this is not possible here you do this in strings and you use append method in strings
    }
}
