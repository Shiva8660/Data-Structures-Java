package LinkedList12.PART_1;

class SLL{
    private Node head;
    private Node tail;
    private int size;

    void insertAtTail(int val){
        Node temp = new Node(val);
        if(head == null) head = tail = temp;
        else{
            tail.next = temp;
            tail = temp;
        }
        size++; // dynamically counting size -> if you want to create method you can
    }

    void displayNodes(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    void insertAtHead(int val){
        Node temp = new Node(val);
        if(head == null) head = tail = temp;
        else{
            temp.next = head;
            head = temp;
        }
        size++;
    }

    void insertAnywhere(int idx,int value){
        Node temp = new Node(value);

        if(idx == 0){
            insertAtHead(value);
            return;
        }
        if(idx == size){
            insertAtHead(value);
            return;
        }
        if(idx > size){
            System.out.println("Invalid Position !!");
            return;
        }
        Node x = head;

        for (int i = 0; i < idx-1; i++) {
            x = x.next;
        }
        temp.next = x.next;
        x.next = temp;
        size++;
    }


    void deleteAtHead() throws Error {
        if(head == null) throw new Error("List is Empty !!");

        head = head.next;
        size--;

    }

    void deleteAnyValue(int idx) throws Error{
        
        if(idx < 0 || idx >= size) throw new Error("Invalid Position!!");
        if(idx == 0){
            deleteAtHead();
            return;
        }

        Node temp = head;
        for (int i = 0; i < idx-1; i++) {
            temp = temp.next;
        }
        if(temp.next == tail) tail = temp;
        temp.next = temp.next.next;
        size--;
    }

    int getElement(int idx) throws Error{

        if(idx == 0) return head.value;
        if(idx == size-1) return tail.value;
        // These above both statement are not required but in special case to reduce t.c -> O(1) => but overall average case is o(n)

        if(idx < 0 || idx >= size){
            throw new Error("Invalid Position !!");
        }

        Node temp = head;
        for (int i = 0; i < idx; i++) {
            temp = temp.next;
        }
        return temp.value;
    }

    void setElement(int idx,int value) throws Error{

        if(idx == size-1) tail.value = value; // this is not required but in special case to reduce t.c  O(1) => but overall average case is o(n)
        if(idx < 0 || idx >= size){
            throw new Error("Invalid Position !!");
        }

        Node temp = head;
        for (int i = 0; i < idx; i++) {
            temp = temp.next;
        }
        temp.value = value;
    }

    int getSize(){
        return size;
    }
}

public class ImplementationLL5 {
    public static void main(String[] args) {

        SLL list = new SLL();
        list.insertAtTail(10);
        list.insertAtTail(20);
        list.insertAtTail(30);

        list.insertAtTail(40);
        list.insertAtHead(50);

        list.displayNodes();

        list.deleteAnyValue(0);
        list.displayNodes();


    }
}

