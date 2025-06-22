package Stack13;
import java.util.Stack;

public class InfixToPostFix8 {

    public static boolean isOperator(char ch){
        return ch == '+' || ch == '-' || ch == '*' || ch == '/';
    }
    public static int precedence(char ch){
        if(ch == '+' || ch == '-') return 1;
        else if(ch == '*' || ch == '/') return 2;
        else return 0;
    }
    public static void evaluate(Stack<String> val, Stack<Character> op){
        String v2 = val.pop();
        String v1 = val.pop();
        char ch = op.pop();

        val.push(v1 + v2 + ch);

    }

    public static void main(String[] args) {
        String str = "9-(5+3)*4/6";

        Stack<String> val = new Stack();
        Stack<Character> op = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if(ch == ' ') continue;

            else if(Character.isDigit(ch)) val.push(ch + " ");

            else if(ch == '(') op.push(ch);

            else if(ch == ')'){
                while(!op.isEmpty() && op.peek() != '('){
                    evaluate(val,op);
                }
                if(!op.isEmpty()) op.pop();
            }

            else if(isOperator(ch)) {
                while (!op.isEmpty() && precedence(op.peek()) >= precedence(ch)) {
                    evaluate(val, op);
                }
                op.push(ch);
            }
        }
        while (!op.isEmpty()){
            evaluate(val,op);
        }
        System.out.print("Infix to postfix : " + val.peek());


    }
}
