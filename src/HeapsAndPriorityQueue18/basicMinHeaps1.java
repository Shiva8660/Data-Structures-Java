package HeapsAndPriorityQueue18;

import java.util.PriorityQueue;

public class basicMinHeaps1 {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(2); // TC = O(logn) -> for rearrange when I add new element in a heap
        System.out.println(pq+" "+pq.peek());

        pq.add(10);
        System.out.println(pq+" "+pq.peek());

        // minimum element will come top element
        pq.add(1);
        System.out.println(pq+" "+pq.peek());
        // top element will be removed -> means minimum element will be removed
        pq.remove();  // // TC = O(logn) -> for rearrange when I delete element from heap

        // Now 0 will come because I have removed 1
        pq.add(0);
        System.out.println(pq+" "+pq.peek());

        // Now -34 will become top element -> this is only became minimum among all
        pq.add(-34);
        System.out.println(pq+" "+pq.peek());

        // pq.peek() -> returns the top element -> that is minimum element only ==> O(1)
        // pq.size() -> return the size of the heap => O(1)

    }
}
