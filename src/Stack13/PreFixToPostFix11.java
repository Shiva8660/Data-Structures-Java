package Stack13;

import java.util.Stack;

public class PreFixToPostFix11 {

    public static boolean isOperator(char ch){
        return ch == '+' || ch == '-' || ch == '*' || ch == '/';
    }

    public static void main(String[] args) {
        String str = "-9/*+5346";

        Stack<String> val = new Stack();

        for (int i = str.length()-1; i >= 0; i--) {
            char ch = str.charAt(i);

            if(ch == ' ') continue;

            if(Character.isDigit(ch)) val.push(ch + "");

            else if(isOperator(ch)) {
                String v1 = val.pop();
                String v2 = val.pop();

                val.push(v1 + v2 + ch);

            }
        }

        System.out.print("Prefix Evaluation result : " + val.peek());

    }
}


