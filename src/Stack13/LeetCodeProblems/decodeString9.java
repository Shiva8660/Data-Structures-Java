package Stack13.LeetCodeProblems;

import java.util.*;

public class decodeString9 {
    public static void main(String[] args) {
        Solution1 solution = new Solution1();
        String input = "3[a2[c]]";
        String output = solution.decodeString(input);
        System.out.println(output);
    }
}

class Solution1 {
    public String decodeString(String s) {
        Stack<Character> st = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch != ']') st.push(ch);
            else {
                StringBuilder sb = new StringBuilder();
                while (st.peek() != '[') {
                    sb.append(st.pop());
                }
                st.pop();
                int k = 0;
                int base = 1;
                while (!st.isEmpty() && Character.isDigit(st.peek())) {
                    k = (st.pop() - '0') * base + k;
                    base = base * 10;
                }
                while (k-- > 0) {
                    for (int i = sb.length() - 1; i >= 0; i--) {
                        st.push(sb.charAt(i));
                    }
                }
            }
        }
        char[] result = new char[st.size()];
        for (int i = st.size() - 1; i >= 0; i--) {
            result[i] = st.pop();
        }
        return new String(result);
    }
}
