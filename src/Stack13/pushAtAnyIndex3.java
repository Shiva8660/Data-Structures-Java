package Stack13;
import java.util.Scanner;
import java.util.Stack;

public class pushAtAnyIndex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> orgStack = new Stack();

        orgStack.push(10);
        orgStack.push(20);
        orgStack.push(30);
        orgStack.push(40);
        orgStack.push(50);

        System.out.println(orgStack);

        System.out.println("Enter index where you want to push : " );
        int idx = sc.nextInt();

        Stack<Integer> tempStack = new Stack<>();
        while(orgStack.size() > idx){
            tempStack.push(orgStack.pop());
        }
        System.out.println("Enter the element which you want to push at " + idx +":" );
        int data = sc.nextInt();

        orgStack.push(data);
        while(tempStack.size() > 0){
            orgStack.push(tempStack.pop());
        }
        System.out.println("After pushing ..");
        System.out.println(orgStack);
    }
}
