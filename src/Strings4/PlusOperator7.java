package Strings;

// using + operator is better

public class PlusOperator7 {
    public static void main(String[] args) {
        String str = "abc";
        str = str.concat("xyz");
        System.out.println(str);

//        String str1 = "abc";
//        // error
//        str1 = str1.concat(10);
//        System.out.println(str1);

        System.out.println();
        String str2 = "abc";
        str2 = str2.concat("10");
        System.out.println(str2);

        System.out.println();

        // now with + operator

        String str4 = "abc";
        str4 = str4 + "xyz";
        System.out.println(str4);

        System.out.println();

        String str5 = "abc";
        // but you with qualans
        str5 += 10;
        System.out.println(str5);

        String str6 = "abc";
        str6 = 10 + str6;
        System.out.println(str6);

        System.out.println();

        System.out.println("abc" +10+20);
        System.out.println(10+20+"abc");


    }
}
