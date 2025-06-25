package BinaryTree15.Basics;

class Node{
    int val;
    Node left;
    Node right;

    Node(int val){
        this.val = val;
    }
}

public class ImplementationOfBinaryTree1 {

    public static void displayTree(Node root){

        if(root == null) return;

        System.out.print(root.val + " ");
        displayTree(root.left);           // Left Sub Tree
        displayTree(root.right);          // Right Sub Tree
    }

    public static void main(String[] args) {
        Node a = new Node(1); // a is the root node
        Node b = new Node(4);
        Node c = new Node(3);
        Node d = new Node(2);
        Node e = new Node(6);
        Node f = new Node(5);

        // through a connecting all nodes
//        a.left = b;
//        a.right = c;
//        a.left.left = d;
//        a.left.right = e;
//        a.right.right = f;

        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.right = f;

        System.out.println(a.left.val);
        System.out.println(b.val);

        System.out.println();

        // both same
        e.val = 88;
        a.left.right.val = 6;

        System.out.println(e.val);
        System.out.println(a.left.right.val);

        displayTree(a);

    }
}
