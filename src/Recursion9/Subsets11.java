package Recursion;

public class Subsets11 {

    public static void printAllSubSets(int i, String str,String ans){
        if(i == str.length()) {
            System.out.println(ans);
            return;
        }
        char ch = str.charAt(i);

        // If you want to change the order then simply replace this call's
        printAllSubSets(i+1,str,ans);        // don't include
        printAllSubSets(i+1,str,ans+ch); // take

    }

    public static void main(String[] args) {
        String str = new String("abc");
        printAllSubSets(0,str,"");

    }
}

// leetcode 78  