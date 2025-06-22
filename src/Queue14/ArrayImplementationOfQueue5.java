package Queue14;

class Queue{
    private int rear = -1, front = -1, size = 0;
    private int[] arr;

    Queue(){
        arr = new int[5];
    }
    public boolean isEmpty(){
        return size == 0;
    }
    public boolean isFull(){
        return rear == arr.length;
    }
    public void add(int val){
        if(isFull()){
            System.out.println("Queue is full..");
            return;
        }
        if(front == -1 && rear == -1){
            rear = front = 0;
        }
        arr[rear] = val;
        rear++;
        size++;

    }
    public int remove(){
        if(isEmpty()){
            System.out.println("Queue is empty..");
            return -1;
        }
        int val = arr[front++];
        size--;

        if(front == rear) {
            rear = front = -1;
        }
        return val;
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Queue is empty..");
            return -1;
        }
        return arr[front];
    }

    public int getSize(){
        return size;
    }

    public void printQueue(){
        if(isEmpty()){
            System.out.println("Queue is empty..");
            return;
        }
        for (int i = front; i < rear; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}

public class ArrayImplementationOfQueue5 {
    public static void main(String[] args) {
        Queue ob = new Queue();
        System.out.println(ob.isFull());
        ob.add(10);
        ob.add(20);
        ob.add(30);
        ob.add(40);
        ob.add(50);

        System.out.println(ob.getSize());
        ob.printQueue();



    }
}
