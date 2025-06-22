package Stack13;
import java.util.Stack;

public class InfixExp6 {
    public static void main(String[] args) {
        String str = "9 - (5 + 3) * 4 / 6";

        Stack<Integer> numStack = new Stack<>();
        Stack<Character> opStack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ' ') continue;

            if (Character.isDigit(ch)) {
                numStack.push(ch - '0');  // convert char digit to int
            } else if (ch == '(') {
                opStack.push(ch);
            } else if (ch == ')') {
                while (!opStack.isEmpty() && opStack.peek() != '(') {
                    evaluate(numStack, opStack);
                }
                if (!opStack.isEmpty()) opStack.pop();  // pop '('
            } else if (isOperator(ch)) {
                while (!opStack.isEmpty() && precedence(opStack.peek()) >= precedence(ch)) {
                    if (opStack.peek() == '(') break;
                    evaluate(numStack, opStack);
                }
                opStack.push(ch);
            }
        }

        while (!opStack.isEmpty()) {
            evaluate(numStack, opStack);
        }

        System.out.println("The final value : " + numStack.pop());
    }

    static boolean isOperator(char ch) {
        return ch == '+' || ch == '-' || ch == '*' || ch == '/';
    }

    static int precedence(char op) {
        if (op == '+' || op == '-') return 1;
        if (op == '*' || op == '/') return 2;
        return 0;
    }

    static void evaluate(Stack<Integer> numStack, Stack<Character> opStack) {
        int b = numStack.pop();
        int a = numStack.pop();
        char op = opStack.pop();

        int result = 0;
        if (op == '+') result = a + b;
        else if (op == '-') result = a - b;
        else if (op == '*') result = a * b;
        else if (op == '/') result = a / b;

        numStack.push(result);
    }
}
