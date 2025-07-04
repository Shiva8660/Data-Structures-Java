package HeapsAndPriorityQueue18;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public interface basicAboutMaxHeap2 {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        // same TC as min heap

        pq.add(2);
        System.out.println(pq+" "+pq.peek());

        // this will become top element
        pq.add(10);
        System.out.println(pq+" "+pq.peek());

        // now this become top element
        pq.add(55);
        System.out.println(pq+" "+pq.peek());

        // top will be removed
        pq.remove();

        // now this will become top
        pq.add(88);
        System.out.println(pq+" "+pq.peek());

        pq.add(4);
        System.out.println(pq+" "+pq.peek());
    }
}
