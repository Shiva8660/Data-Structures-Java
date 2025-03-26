package StringsAndStringBuilders;
import java.util.Arrays;
import java.util.Scanner;

// there is no direct method to sort string directly
// for that 1st convert string to character array why becoz we have direct to sort a character array

public class Sort_A_String11 {
    public static void main(String[] args) {

        // this is for String
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = sc.nextLine();

        char[] ch = str.toCharArray();
        Arrays.sort(ch);

//        System.out.println("-- After sorting -- ");
//        for(char ele : ch){
//            System.out.print(ele);
//        }

        //convert to string
        String sortedString = new String(ch);
        System.out.println("Sorted string is: " + sortedString);
        System.out.println();

        // Now this is for StringBuilder -> for string builder also there is no direct method
        // 1st convert to strings then convert to character array
        StringBuilder s = new StringBuilder("shiva");
        char[] cha = s.toString().toCharArray();

        Arrays.sort(cha);
        for(char ele : cha){
            System.out.print(ele);
        }




    }
}
