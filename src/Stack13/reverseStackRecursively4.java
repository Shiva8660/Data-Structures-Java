package Stack13;

import java.util.Stack;


public class reverseStackRecursively4 {

    public static void displayReverseUsingRecursioin(Stack<Integer> st){
        if(st.isEmpty()) return;
        int top = st.pop();
        System.out.println(top);
        displayReverseUsingRecursioin(st);
        st.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> orgStack = new Stack<>();
        orgStack.push(10);
        orgStack.push(20);
        orgStack.push(30);
        orgStack.push(40);

        displayReverseUsingRecursioin(orgStack);

    }
}
