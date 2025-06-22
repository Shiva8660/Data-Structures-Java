package Queue14;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class reverseQueueUsingStack2 {
    public static void main(String[] args) {
        Queue<Integer> que = new LinkedList<>();
        Stack<Integer> st = new Stack<>();

        que.add(1); que.add(2); que.add(3); que.add(4); que.add(5);
        System.out.println("The original queue is : " + que);

        while(!que.isEmpty()){
            st.push(que.remove());
        }
        while (!st.isEmpty()){
            que.add(st.pop());
        }
        System.out.println("The reversed queue is : " + que);

    }
}
