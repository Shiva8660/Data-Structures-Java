package Stack13;
import java.util.Stack;

public class PostFixEvaluation9 {

    public static boolean isOperator(char ch){
        return ch == '+' || ch == '-' || ch == '*' || ch == '/';
    }
    public static int precedence(char ch){
        if(ch == '+' || ch == '-') return 1;
        else if(ch == '*' || ch == '/') return 2;
        else return 0;
    }

    public static void main(String[] args) {
        String str = "953+4*6/-";

        Stack<Integer> val = new Stack();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if(ch == ' ') continue;

            if(Character.isDigit(ch)) val.push((int)ch - 48);

            else if(isOperator(ch)) {
                int v2 = val.pop();
                int v1 = val.pop();

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

        System.out.print("Postfix Evaluation result : " + val.peek());

    }
}
