package StringsAndStringBuilders;
// consist of only lower case
// interview question don't use hash map solve using different method

import java.util.Scanner;

public class PrintMostTimesOccurringCharacter14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StringBuilder str = new StringBuilder(sc.nextLine());

        int[] freq = new int[26];
        //0-a,1-b,2-c.....z-25

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            int idx = (int)ch - 97;
            freq[idx]++;
            // freq[(int)str.charAt(i) - 97]++;
        }

        int maxFreq = -1;
        for(int i=0;i<freq.length;i++){
            maxFreq = Math.max(maxFreq,freq[i]);
        }
        System.out.println(maxFreq);

//        for(int i=0;i<freq.length;i++){
//            if(freq[i] == maxFreq){
//                char ch = (char)(i+97);
//                System.out.println(ch + " ");
//            }
//        }
    }
}
// leetcode 205

