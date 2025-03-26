package Strings;

public class PrintAllPossibleSubStings6 {
    public static void main(String[] args) {
        String str = "abcde";

        // print all substring starting with a
        for (int i = 1; i <= str.length(); i++) {
            System.out.print(str.substring(0, i) + " ");
        }
        System.out.println();

        // print all substrings
        for (int i = 0; i <=str.length() ; i++) {
            for (int j = i+1; j <= str.length(); j++) {
                System.out.print(str.substring(i,j) + " ");
            }
            System.out.println();
        }
    }
}
