package Stack13;
import java.util.Stack;

public class copyStack {
    public static void main(String[] args) {
        Stack<Integer> orgStack = new Stack();
        orgStack.push(10);
        orgStack.push(20);
        orgStack.push(30);
        orgStack.push(40);
        orgStack.push(50);

        System.out.println("Original stack ..");
        System.out.println(orgStack);
        System.out.println();

        Stack<Integer> tempStack = new Stack();

        while(!orgStack.isEmpty()){
            tempStack.push(orgStack.pop());
        }
        System.out.println("Temperary stack..");
        System.out.println(tempStack);
        System.out.println();

        Stack<Integer> finalStack = new Stack<>();

        while(!tempStack.isEmpty()){
            finalStack.push(tempStack.pop());
        }
        System.out.println("Final copy stack..");
        System.out.println(finalStack);






    }

}
