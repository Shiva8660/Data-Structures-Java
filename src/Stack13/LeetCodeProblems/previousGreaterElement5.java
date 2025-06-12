package Stack13.LeetCodeProblems;

import java.util.Stack;

public class previousGreaterElement5 {

    public static void bruteForce(int[] arr){
        int[] newArr = new int[arr.length];
        int n = newArr.length;

        newArr[0] = -1;

        for (int i = 1; i < n; i++) {
            for (int j = i-1; j >= 0; j--) {
                if(arr[j] > arr[i]){
                    newArr[i] = arr[j];
                    break;
                }
                else newArr[i] = -1;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(newArr[i] + " ");
        }
        System.out.println();
    }

    public static int[] improvedTandS(int[] arr){
        int n = arr.length;
        int[] newArr = new int[n];
        Stack<Integer> st = new Stack<>();
        newArr[0] = 1;

        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && st.peek() <= arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                newArr[i] = -1;
            }
            else {
                newArr[i] = st.peek();
            }
            st.push(arr[i]);

        }
        return newArr;
    }

    public static void main(String[] args) {
        int[] arr = {10, 4, 5, 20, 40, 12, 30};
        bruteForce(arr);

        arr = improvedTandS(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }




    }
}
