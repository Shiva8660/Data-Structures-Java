package StringsAndStringBuilders;
import java.util.Scanner;

//  this is for only single space if two spaces are there then do this => i = j + 2;

public class ReverseEachWordsInSentence10 {

    private static void reverseWord(StringBuilder str, int i, int j) {
        while(i<=j){
            char temp = str.charAt(i);
            str.setCharAt(i,str.charAt(j));
            str.setCharAt(j,temp);
            i++;
            j--;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        StringBuilder str = new StringBuilder(sc.nextLine());

        int n = str.length();
        int i = 0, j = 0;

        while(j<n){
            if(str.charAt(j) != ' ') j++;
            else {
                reverseWord(str,i,j-1);
                i = j+1;
                j = i;
            }
        }
        // after loop ends then reverse once for last word
        reverseWord(str,i,j-1);

        System.out.println(str);
    }




}
