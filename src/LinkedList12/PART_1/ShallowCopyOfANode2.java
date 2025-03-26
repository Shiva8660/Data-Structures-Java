package LinkedList12.PART_1;


public class ShallowCopyOfANode2 {
    public static void main(String[] args) {

        Node a = new Node(100);
        Node temp = a; // No new node -> ShallowCopy of a (temp and a nodes are reference variables)

        System.out.println(a.value);
        System.out.println(temp.value);

        System.out.println();

        System.out.println(a);
        System.out.println(temp);

        System.out.println();

        // Now see new node  - value is same but new address because of new keyword
        // when I use new It will create new object -> known as deepCopy
        Node temp1 = new Node(a.value);

        System.out.println(a.value);
        System.out.println(temp1.value);

        System.out.println();

        System.out.println(a);
        System.out.println(temp1);

    }
}
