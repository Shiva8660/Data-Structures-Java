package BinaryTree15.Basics;

import BinaryTree15.Node;

public class FindNumberOfNodes7 {

    public static int CountNodes(Node root){
        if(root == null) return 0;

        return 1 + CountNodes(root.left) + CountNodes(root.right);
    }

    public static void main(String[] args) {
        Node a = new Node(1); // a is the root node
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);


        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.right = f;
        c.left = g;

        System.out.println("The total number of nodes is : " + CountNodes(a));
    }
}



