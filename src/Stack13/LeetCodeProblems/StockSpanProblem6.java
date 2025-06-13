package Stack13.LeetCodeProblems;

import java.util.Stack;
import java.util.ArrayList;

public class StockSpanProblem6 {

    public static ArrayList<Integer> calculateSpan(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            // Pop elements while the current price is greater or equal
            while (!st.isEmpty() && arr[i] >= arr[st.peek()]) {
                st.pop();
            }

            // If stack is empty, span is i+1 (all elements before are smaller)
            if (st.isEmpty()) {
                list.add(i + 1);
            } else {
                list.add(i - st.peek());
            }

            // Push current index to stack
            st.push(i);
        }

        return list;
    }

    public static void main(String[] args) {
        int[] arr = {100, 80, 60, 70, 60, 75, 85};

        ArrayList<Integer> span = calculateSpan(arr);

        System.out.println("Stock Span:");
        for (int s : span) {
            System.out.print(s + " ");
        }
    }
}

