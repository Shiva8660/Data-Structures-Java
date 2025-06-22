package Queue14;

import java.util.LinkedList;
import java.util.Queue;

public class basicQueue1 {

    public static void main(String[] args) {

        // queue is abstract class
        Queue<Integer> que = new LinkedList<>();

        System.out.println(que.size());
        System.out.println(que.isEmpty());

        // add or push operation in a queue
        que.add(1);
        que.add(2);
        que.add(3);
        que.add(4);
        que.add(5);

        System.out.println(que);

        que.remove();
        System.out.println(que);

        que.poll();
        System.out.println(que);

        // System.out.println(que.peek());

        System.out.println(que.size());
        System.out.println(que.isEmpty());
    }
}
