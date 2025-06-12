package Stack13.LeetCodeProblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        int n = arr.length;

        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() <= arr[i]) {
                st.pop();
            }

            if (st.isEmpty()) list.add(-1);
            else list.add(st.peek());

            st.push(arr[i]);
        }

        Collections.reverse(list);
        return list;
    }
}

public class NextGreaterElement3 {
    public static void main(String[] args) {
        int[] arr = {6, 8, 0, 1, 3};

        Solution solution = new Solution();
        ArrayList<Integer> result = solution.nextLargerElement(arr);

        System.out.println("Next Greater Elements: " + result);
    }
}

