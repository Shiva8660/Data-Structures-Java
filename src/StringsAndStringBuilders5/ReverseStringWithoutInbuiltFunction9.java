package StringsAndStringBuilders;


import java.util.Scanner;

public class ReverseStringWithoutInbuiltFunction9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string : ");
        StringBuilder str = new StringBuilder(sc.nextLine());

        int i = 0, j = str.length()-1;

        while(i<j){
            char temp = str.charAt(i);
            str.setCharAt(i,str.charAt(j));
            str.setCharAt(j,temp);
            i++;
            j--;
        }
        System.out.println("After reversing --> " + str);

        System.out.println("Using Inbuilt Method --> " + str.reverse());

    }
}
