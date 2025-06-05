package LinkedList12.PART_3;


class Node{
    int val;
    Dnode next;
    Dnode prev;

    Node(int val){
        this.val = val;
    }
}

class Dll{
    Dnode head;
    Dnode tail;
    int size;

    void display(){
        Dnode temp = head;
        while(temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    void insertAtHead(int val){
        Dnode temp = new Dnode(val);
        if(size == 0) head = tail = temp;
        else {
            temp.next = head;
            head.prev = temp;
            head = temp;
        }
        size++;
    }

    void insertAtAnyIndex(int idx,int val){
        Dnode temp = new Dnode(val);


        if(idx < 0 || idx > size-1){
            System.out.println("Invaliding indexing..");
            return;
        }
        else if(idx == 0) insertAtHead(val);
        else if(idx == size-1) insertAtTail(val);

        Dnode x = head;
        for(int i=0;i<idx-1;i++){
            x = x.next;
        }
        Dnode y = x.next;

        x.next = temp;  temp.prev = x;
        y.prev = temp;  temp.next = y;
        size++;
    }

    void insertAtTail(int val){
        Dnode temp = new Dnode(val);
        if(size == 0) head = tail = temp;
        else {
            tail.next = temp;
            temp.prev = tail;
            tail = temp;
        }
        size++;
    }

    void deleteAtHead(){
        if(size == 0){
            System.out.println("Empty list..");
            return;
        }
        head = head.next;
        head.prev = null;

        size--;
    }

    void deleteAtAnyIndex(int idx){

        if(idx < 0 || idx > size-1){
            System.out.println("Invaliding indexing..");
            return;
        }
        else if(idx == 0) deleteAtHead();
        else if(idx == size-1) deleteAtTail();

        Dnode temp = head;
        for(int i=0;i<idx-1;i++){
            temp = temp.next;
        }

        if(temp.next != null) temp.next = temp.next.next;
        else temp.next = null;
        temp = temp.next;
        temp.prev = temp.prev.prev;
        size--;
    }


    void deleteAtTail(){
        if(size == 0){
            System.out.println("Empty list..");
            return;
        }
        tail = tail.prev;
        tail.next = null;

        size--;
    }

}

public class implementationOfDLL {
    public static void print(Dnode head){
        Dnode temp = head;
        while(temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void printReverse(Dnode tail){
        Dnode temp = tail;
        while(temp != null){
            System.out.print(temp.val + " ");
            temp = temp.prev;
        }
        System.out.println();
    }
    public static void printFromAnyNode(Dnode randomNode){
        Dnode temp = randomNode;
        while (temp.prev != null){
            temp = temp.prev;
        }
        print(temp);
    }

    public static void main(String[] args) {
//        Node a = new Node(10);
//        Node b = new Node(20);
//        Node c = new Node(30);
//        Node d = new Node(40);
//
//        a.next = b;  b.prev = a;
//        b.next = c;  c.prev = b;
//        c.next = d;  d.prev = c;
//
//        print(a);
//        printReverse(d);
//        printFromAnyNode(c);

        Dll list = new Dll();
        list.display();

        list.insertAtTail(10);
        list.insertAtTail(20);
        list.insertAtTail(30);

        list.display();

        list.insertAtHead(40);
        list.insertAtHead(50);
        list.insertAtHead(60);

        list.display();

        list.insertAtAnyIndex(2,33);
        list.display();



        list.deleteAtHead();
        list.display();

        list.deleteAtAnyIndex(2);
        list.display();

        list.deleteAtAnyIndex(4); // error 
        list.display();


    }
}
