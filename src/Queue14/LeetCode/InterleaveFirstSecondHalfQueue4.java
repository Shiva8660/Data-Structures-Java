package Queue14.LeetCode;

import java.util.*;

public class InterleaveFirstSecondHalfQueue4 {
    public static Queue<Integer> rearrangeQueue(Queue<Integer> q) {
        Stack<Integer> st = new Stack<>();
        int n = q.size();

        for (int i = 0; i < n / 2; i++) {
            st.push(q.poll());
        }
        while (!st.isEmpty()) {
            q.add(st.pop());
        }
        for (int i = 0; i < n / 2; i++) {
            st.push(q.poll());
        }
        while (!st.isEmpty()) {
            q.add(st.pop());
            q.add(q.poll());
        }
        while (!q.isEmpty()) {
            st.push(q.poll());
        }
        while (!st.isEmpty()) {
            q.add(st.pop());
        }

        return q;
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 101, 102, 103, 104));
        Queue<Integer> result = rearrangeQueue(q);
        System.out.println(result);
    }
}
