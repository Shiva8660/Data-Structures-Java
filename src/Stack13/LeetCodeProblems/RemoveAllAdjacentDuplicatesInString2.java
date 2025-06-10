package Stack13.LeetCodeProblems;

import java.util.Stack;

public class RemoveAllAdjacentDuplicatesInString2 {
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (stack.isEmpty()) {
                stack.push(ch);
            } else if (ch != stack.peek()) {
                stack.push(ch);
            } else {
                stack.pop();
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < stack.size(); i++) {
            sb.append(stack.get(i));
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        RemoveAllAdjacentDuplicatesInString2 solution = new RemoveAllAdjacentDuplicatesInString2();

        // Test cases
        String input1 = "abbaca";
        String input2 = "azxxzy";
        String input3 = "aabbccddeeff";

        System.out.println("Input: " + input1 + " → Output: " + solution.removeDuplicates(input1)); // "ca"
        System.out.println("Input: " + input2 + " → Output: " + solution.removeDuplicates(input2)); // "ay"
        System.out.println("Input: " + input3 + " → Output: " + solution.removeDuplicates(input3)); // ""
    }
}

