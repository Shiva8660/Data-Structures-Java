package StringsAndStringBuilders;

public class IntroductionToStringBuilder3 {
    public static void main(String[] args) {
//        String m = new String("abc");

//        not possible to initialize like this use have to use new keyword
//        StringBuilder t = "abc"; // Error
//        StringBuilder t = ""; // error
        // all methods same as  in Strings some ar not there like toLower(), toUpperCase()
//        StringBuilder a = new StringBuilder(""); //  you can create in both way
//        StringBuilder b = new StringBuilder();   // pura kali wala -> both are same

 //        same only
//        System.out.println(a);
//        System.out.println(a.length());
//
//        System.out.println();
//
//        System.out.println(b);
//        System.out.println(b.length());

        // the capacity of stringbuilder is 10
        // length is used memory
        // capacity is like we reserved 10 space of memory for our string
//        StringBuilder d = new StringBuilder(10);
//        System.out.println(d.length());
//        System.out.println(d.capacity());
//
//        StringBuilder e = new StringBuilder("10");
//        System.out.println(e.length());



//        String s = "abc";
//        StringBuilder str = new StringBuilder(s);
//        System.out.println(str.length());
//        System.out.println(str.capacity()); // 16 + 3
//
//        // by default capacity of StringBuilder is 16
//        StringBuilder n = new StringBuilder();
//        System.out.println(n.capacity()); // 16

        // If I mention capacity by mine it will be same as given capacity
        StringBuilder x = new StringBuilder(7);
        System.out.println(x.capacity()); // 7

    }
}
