package Recursion;

public class permutations12 {

    public static void printPermutations(String ans, String str) {
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String left = str.substring(0,i);
            String right = str.substring(i+1);
            printPermutations(ans+ch,left+right);
        }
    }

    public static void main(String[] args) {
        String s = "abc";
        printPermutations("",s);
    }
}
