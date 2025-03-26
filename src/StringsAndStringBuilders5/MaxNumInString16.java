package StringsAndStringBuilders;

import java.util.Scanner;

public class MaxNumInString16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // converting string to integer
//        String n = "1015";
//        int a = Integer.parseInt(n);

        // consider if you have some number which can't  fit in integer as well as in long data type
        // how will you compare these numbers
        // now see how we are approaching these problem -> sequence number 17

//        String[] arr = {"999","1018","2089","4822885999528563966","57506664762520","889244263558524"};

        String[] arr = {"999","1018","2089"};

        int maxValue = Integer.parseInt(arr[0]);
        for(int i=1;i< arr.length;i++){
            int n = Integer.parseInt(arr[i]);
            maxValue = Math.max(maxValue,n);
        }
        System.out.println("The max value is : " + maxValue);
    }
}

