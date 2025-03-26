package Strings;

public class StringMethods3 {
    public static void main(String[] args) {

        // about indexOf

//        String name = "shiva Reddy MuDBi";
//
//        System.out.println(name.indexOf('u'));
//        System.out.println(name.indexOf('R'));
//        System.out.println(name.lastIndexOf('i'));
//        System.out.println(name.indexOf('k'));
//
//        System.out.println();

        // about compareTo
//        String str1 = "abc";
//        String str2 = "def ";

//        String str1 = "abc";
//        String str2 = "abcggg";

//        String str1 = "abcd";
//        String str2 = "abc";

//        String str1 = "abcf";
//        String str2 = "abc";

//        String str1 = "abcd";
//        String str2 = "bbc";
//
//        System.out.println(str1.compareTo(str2));

        // about Contains - gives true or false

        String str = "shiva Reddy Mudbi";
        System.out.println(str.contains("dyy"));

        System.out.println(str.startsWith("sh"));
        System.out.println(str.startsWith("shiva"));

        System.out.println(str.startsWith("siva"));
        System.out.println(str.startsWith("re"));

        System.out.println();
        System.out.println(str.endsWith("bi"));
        System.out.println(str.endsWith("shiva"));


    }
}
