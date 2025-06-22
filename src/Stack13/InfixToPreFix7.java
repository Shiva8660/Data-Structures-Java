package Stack13;

import java.util.Stack;

public class InfixToPreFix7 {

    public static boolean isOperator(char ch){
        return ch == '+' || ch == '-' || ch == '*' || ch == '/';
    }

    public static int precedence(char ch){
        if(ch == '+' || ch == '-') return 1;
        else if (ch == '*' || ch == '/') return 2;
        return 0;
    }

    public static void evaluate(Stack<String> numStack, Stack<Character> opStack){
        String v2 = numStack.pop();
        String v1 = numStack.pop();
        char op = opStack.pop();

        // Prefix format: operator followed by two operands
        String expr = op + v1 + v2;
        numStack.push(expr);
    }

    public static void main(String[] args) {
        String str = "9 - (5 + 3) * (4 / 6)";

        Stack<String> numStack = new Stack<>();
        Stack<Character> opStack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == ' ') continue;

            if(Character.isDigit(ch)){
                numStack.push(String.valueOf(ch));
            }
            else if(ch == '('){
                opStack.push(ch);
            }
            else if(ch == ')'){
                while (!opStack.isEmpty() && opStack.peek() != '(') {
                    evaluate(numStack, opStack);
                }
                // Pop the '('
                if (!opStack.isEmpty()) opStack.pop();
            }
            else if(isOperator(ch)){
                while (!opStack.isEmpty() && opStack.peek() != '('
                        && precedence(opStack.peek()) >= precedence(ch)){
                    evaluate(numStack, opStack);
                }
                opStack.push(ch);
            }
        }

        while (!opStack.isEmpty()) {
            evaluate(numStack, opStack);
        }

        System.out.println("Prefix Expression: " + numStack.peek());
    }
}
