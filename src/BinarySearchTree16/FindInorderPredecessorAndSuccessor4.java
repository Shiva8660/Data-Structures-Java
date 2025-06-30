package BinarySearchTree16;

import java.util.Scanner;

class x{
    Node p;
    Node s;
}

public class FindInorderPredecessorAndSuccessor4 {
    static Node prev;

    public static void find(Node root, int key, x ob){
        if(root == null) return;

        find(root.left, key, ob);

        if(root.val == key){
            ob.p = prev;
        }
        if(prev != null && prev.val == key){
            ob.s = root;
        }
        prev = root;
        find(root.right, key, ob);
    }

    public static void main(String[] args) {
        prev = null;
        x ob = new x();
        Scanner sc = new Scanner(System.in);

        Node a = new Node(50);
        Node b = new Node(30);
        Node c = new Node(70);
        Node d = new Node(20);
        Node e = new Node(40);
        Node f = new Node(60);
        Node g = new Node(80);

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.left = f;
        c.right = g;

        System.out.println("Enter a key to search : ");
        int key = sc.nextInt();


        find(a, key, ob);
        
        if (ob.p != null) System.out.println("Predecessor: " + ob.p.val);
        else System.out.println("Predecessor: None");

        if (ob.s != null) System.out.println("Successor: " + ob.s.val);
        else System.out.println("Successor: None");
    }
}
