package Recursion;

public class ArrayTraversal9 {

    public static void print(int i,int[] arr){
        if(i == arr.length) return;
        System.out.print(arr[i] + " ");
        print(i+1,arr);
    }

    public static void main(String[] args) {
        int[] arr = {4,9,3,8,5,6,7};
        print(0,arr);
    }
}
