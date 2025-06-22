package Stack13.LeetCodeProblems;
import java.util.Stack;

public class preFixEvaluation10 {

    public static boolean isOperator(char ch){
        return ch == '+' || ch == '-' || ch == '*' || ch == '/';
    }
    public static int precedence(char ch){
        if(ch == '+' || ch == '-') return 1;
        else if(ch == '*' || ch == '/') return 2;
        else return 0;
    }

    public static void main(String[] args) {
        String str = "-8/*+5376";

        Stack<Integer> val = new Stack();

        for (int i = str.length()-1; i >= 0; i--) {
            char ch = str.charAt(i);

            if(ch == ' ') continue;

            if(Character.isDigit(ch)) val.push((int)ch - 48);

            else if(isOperator(ch)) {
                int v1 = val.pop(); // in this here only change and here we start loop from end
                int v2 = val.pop();

                int result = 0;
                switch (ch) {
                    case '+': result = v1 + v2; break;
                    case '-': result = v1 - v2; break;
                    case '*': result = v1 * v2; break;
                    case '/': result = v1 / v2; break;
                }

                val.push(result);

            }
        }

        System.out.print("Prefix Evaluation result : " + val.peek());

    }
}

