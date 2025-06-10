package Stack13.LeetCodeProblems;

import java.util.Stack;

public class ValidParentheses1 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(char ch : s.toCharArray()) {
            if(ch == '(') stack.push(')');
            else if(ch == '{') stack.push('}');
            else if(ch == '[') stack.push(']');
            else {
                if(stack.isEmpty() || stack.pop() != ch) return false;
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        ValidParentheses1 vp = new ValidParentheses1();

        // Test Cases
        String test1 = "()[]{}";
        String test2 = "([{}])";
        String test3 = "(]";
        String test4 = "(((";
        String test5 = "([)]";

        System.out.println(test1 + " -> " + vp.isValid(test1)); // true
        System.out.println(test2 + " -> " + vp.isValid(test2)); // true
        System.out.println(test3 + " -> " + vp.isValid(test3)); // false
        System.out.println(test4 + " -> " + vp.isValid(test4)); // false
        System.out.println(test5 + " -> " + vp.isValid(test5)); // false
    }
}
