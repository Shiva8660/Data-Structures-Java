package Queue14.LeetCode;

import java.util.*;

class ReverseFirstKProcessor {
    public Queue<Integer> process(Queue<Integer> inputQueue, int k) {

        if (inputQueue == null || k <= 0 || k > inputQueue.size()) return inputQueue;
        Stack<Integer> tempStack = new Stack<>();
        int remaining = inputQueue.size() - k;
        while (k-- > 0) tempStack.push(inputQueue.poll());
        while (!tempStack.isEmpty()) inputQueue.add(tempStack.pop());
        for (int i = 0; i < remaining; i++) inputQueue.add(inputQueue.poll());
        return inputQueue;
    }
}

public class ReverseKExecutor1 {
    public static void main(String[] args) {
        System.out.println("Problem: Reverse the first k elements of a queue.");
        Queue<Integer> taskQueue = new LinkedList<>(Arrays.asList(7, 7, 5, 6, 5, 10));
        int k = 3;
        System.out.println("Original queue: " + taskQueue);
        ReverseFirstKProcessor processor = new ReverseFirstKProcessor();
        Queue<Integer> updatedQueue = processor.process(taskQueue, k);
        System.out.println("After reversing first " + k + " elements: " + updatedQueue);
    }
}

