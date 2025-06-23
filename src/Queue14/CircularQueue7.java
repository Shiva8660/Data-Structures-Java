package Queue14;


class cirQueue{
    private int rear = -1, front = -1, size = 0;
    private int[] arr;

    cirQueue(){
        arr = new int[5];
    }
    public boolean isEmpty(){
        return size == 0;
    }
    public boolean isFull(){
        return size == arr.length;
    }
    public void add(int val){
        if(isFull()){
            System.out.println("OverFolw...");
            return;
        }
        // Inplace these 3 statement's I can place only one
//        else if(size == 0){
//            front = rear = 0;
//            arr[0] = val;
//        }

//        else if (rear < arr.length-1 ) {
//            arr[++rear] = val;
//        }
//        else if (rear == arr.length-1) {
//            rear = 0;
//            arr[rear] = val;
//        }
        // these below two are sufficient

        if (isEmpty()) {
            front = rear = 0;
            arr[rear] = val;
        } else {
            rear = (rear + 1) % arr.length;
            arr[rear] = val;
        }

        size++;

    }
    public int remove() {
        if (isEmpty()) {
            System.out.println("Queue is empty..");
            return -1;
        }

        int val = arr[front++];
        if(front == arr.length-1) front = 0;
        size--;
        if(size == 0) front = rear = -1;
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

    public void printQueueMethod1(){
        if(isEmpty()){
            System.out.println("Queue is empty..");
            return;
        }
        else if(front <= rear){
            for (int i = front; i <= rear; i++) {
                System.out.print(arr[i] + ",");
            }
        }
        else{ // rear < front
            for (int i = front; i < arr.length; i++) {
                System.out.print(arr[i] + ",");
            }
            for (int i = 0; i <= rear; i++) {
                System.out.print(arr[i] + ",");
            }

        }
        System.out.println();
    }

    public void printQueueMethod2() {
        if (isEmpty()) {
            System.out.println("Queue is empty..");
            return;
        }

        System.out.print("Queue: ");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % arr.length;
            System.out.print(arr[index] + " ");
        }
        System.out.println();
    }

}

public class CircularQueue7 {
    public static void main(String[] args) {
        cirQueue ob = new cirQueue();

        ob.add(10);
        ob.add(20);
        ob.add(30);
        ob.add(40);

        ob.printQueueMethod1();
        ob.printQueueMethod2();



    }
}

