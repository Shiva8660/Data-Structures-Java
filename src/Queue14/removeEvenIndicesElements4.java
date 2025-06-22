package Queue14;

import java.util.LinkedList;
import java.util.Queue;

public class removeEvenIndicesElements4 {
    public static void main(String[] args) {
        Queue<Integer> que = new LinkedList<>();
        Queue<Integer> newQueue = new LinkedList<>();

        que.add(1); que.add(2); que.add(3); que.add(4); que.add(5);

        int idx = 0;
        while (!que.isEmpty()){
            int val = que.poll();
            if(idx%2 != 0) newQueue.add(val);
            idx++;
        }
        System.out.println("left Elements - " + newQueue);
    }
}
