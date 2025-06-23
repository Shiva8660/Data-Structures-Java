package Queue14;

class DNode{
    int val;
    DNode next;
    DNode prev;

    DNode(int val){
        this.val = val;
    }
}

class DQ {
    private DNode front = null, rear = null;
    private int size;

    public boolean isEmpty() {
        return size == 0;
    }
    public void insertFront(int val){
        DNode temp = new DNode(val);

        if(isEmpty()){
            front = rear = temp;
        }
        else{
            temp.next = front;
            front.prev = temp;
            front = temp;
        }
        size++;
    }
    public void insertRear(int val){
        DNode temp = new DNode(val);

        if(isEmpty()){
            front = temp;
            rear = temp;
        }
        else{
            rear.next = temp;
            temp.prev = rear;
            rear = temp;
        }
        size++;
    }

    public int deleteFront(){
        if(isEmpty()){
            System.out.println("DQ IS EMPTY..");
            return -1;
        }
        int val = front.val;

        if(front == rear){ // when only element is there
            front = rear = null;
        }
        else{
            front = front.next;
            front.prev = null;
        }
        size--;
        return val;
    }
    public int deleteRear(){
        if(isEmpty()){
            System.out.println("DQ IS EMPTY..");
            return -1;
        }
        int val = rear.val;

        if(front == rear){
            front = rear = null;
        }
        else{
            rear = rear.prev;
            rear.next = null;
        }
        size--;
        return val;
    }

    public int getSize(){
        return size;
    }

    public int getFront(){
        if(isEmpty()){
            System.out.println("DQ IS EMPTY..");
            return -1;
        }
        return front.val;
    }
    public int getRear(){
        if(isEmpty()){
            System.out.println("DQ IS EMPTY..");
            return -1;
        }
        return rear.val;
    }


    public void printDQ(){
        if(isEmpty()){
            System.out.println("DQ IS EMPTY..");
            return;
        }
        DNode temp = front;
        while (temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

}

public class implementationOFDQ_Using_DLL6 {
    public static void main(String[] args) {
        DQ ob = new DQ();
        System.out.println(ob.isEmpty());

        ob.insertFront(10);
        ob.insertFront(20);
        ob.insertFront(30);
        ob.printDQ();

        ob.insertRear(60);
        ob.insertRear(70);
        ob.insertRear(80);
        ob.printDQ();

        System.out.println(ob.deleteFront());
        System.out.println(ob.deleteRear());

        System.out.println(ob.deleteFront());
        System.out.println(ob.deleteRear());

        System.out.println(ob.deleteFront());
        System.out.println(ob.deleteRear());

        ob.printDQ();

        System.out.println(ob.deleteFront());

        ob.insertFront(10);
        ob.insertFront(20);

        ob.insertRear(60);
        ob.insertRear(70);

        ob.printDQ();

        System.out.println(ob.getFront());
        System.out.println(ob.getRear());





    }
}
