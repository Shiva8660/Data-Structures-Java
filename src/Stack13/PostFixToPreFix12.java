package Stack13;
import java.util.Stack;

public class PostFixToPreFix12 {

    public static boolean isOperator(char ch){
        return ch == '+' || ch == '-' || ch == '*' || ch == '/';
    }

    public static void main(String[] args) {
        String str = "953+4*6/-";

        Stack<String> val = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if(ch == ' ') continue;

            if(Character.isDigit(ch)) val.push(ch + "");

            else if(isOperator(ch)) {
                String v2 = val.pop();
                String v1 = val.pop();

                String res = ch + v1 + v2;

                val.push(res);

            }
        }

        System.out.print("Prefix Evaluation result : " + val.peek());

    }
}



