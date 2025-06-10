package Stack13;

import java.util.Stack;


public class reverseStackRecursively4 {

    public static void displayReverseUsingRecursioin(Stack<Integer> st){
        if(st.isEmpty()) return;
        int data = st.pop();
        // System.out.print(data + " ");  // to print reverse
        displayReverseUsingRecursioin(st);
        System.out.print(data + " ");      // to print as it is
        st.push(data);
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
