package Stack13.LeetCodeProblems;

/*
Problem Statement:
Given two integer arrays pushed and popped each with distinct values, return true if this could have been the result of a sequence of push and pop operations on an initially empty stack, or false otherwise.
*/

import java.util.Stack;

public class ValidateStackSequences8 {

    public static boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> st = new Stack<>();
        int idx = 0;
        for(int i = 0; i < pushed.length; i++) {
            st.push(pushed[i]);
            while(!st.isEmpty() && st.peek() == popped[idx]) {
                st.pop();
                idx++;
            }
        }
        return st.isEmpty();
    }

    public static void main(String[] args) {
        int[] pushed = {1, 2, 3, 4, 5};
        int[] popped = {4, 5, 3, 2, 1};

        boolean result = validateStackSequences(pushed, popped);
        System.out.println(result);
    }
}

