package Queue14.LeetCode;
import java.util.Stack;

class TwoStackQueue {
    Stack<Integer> input = new Stack<>();
    Stack<Integer> output = new Stack<>();

    public void enqueue(int x) {
        input.push(x);
    }

    public int dequeue() {
        if (output.isEmpty()) {
            while (!input.isEmpty()) {
                output.push(input.pop());
            }
        }
        return output.pop();
    }

    public int front() {
        if (output.isEmpty()) {
            while (!input.isEmpty()) {
                output.push(input.pop());
            }
        }
        return output.peek();
    }

    public boolean isEmpty() {
        return input.isEmpty() && output.isEmpty();
    }
}

public class TwoStackQueueDemo3 {
    public static void main(String[] args) {
        TwoStackQueue queue = new TwoStackQueue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.println("Front: " + queue.front());
        System.out.println("Dequeue: " + queue.dequeue());
        System.out.println("Front after dequeue: " + queue.front());
        System.out.println("Is queue empty? " + queue.isEmpty());
    }
}

