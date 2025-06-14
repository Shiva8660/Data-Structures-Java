package Stack13.LeetCodeProblems;

import java.util.Stack;

public class NumberOfVisiblePeopleInAQueue7 {
    public int[] canSeePersonsCount(int[] heights) {
        int n = heights.length;
        int[] res = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && heights[i] >= heights[st.peek()]) {
                res[st.pop()]++;
            }

            if (!st.isEmpty()) {
                res[st.peek()]++;
            }

            st.push(i);
        }

        return res;
    }
}
class Main {
    public static void main(String[] args) {
        NumberOfVisiblePeopleInAQueue7 solution = new NumberOfVisiblePeopleInAQueue7();
        int[] heights = {10, 6, 8, 5, 11, 9};
        int[] result = solution.canSeePersonsCount(heights);

        for (int count : result) {
            System.out.print(count + " ");
        }
    }
}
