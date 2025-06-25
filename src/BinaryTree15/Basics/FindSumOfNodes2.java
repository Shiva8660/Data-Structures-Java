package BinaryTree15.Basics;

import BinaryTree15.Node;

public class FindSumOfNodes2 {

    public static int findSumOfNodes(Node root){
        if(root == null) return 0;
        int sum = root.val + findSumOfNodes(root.left) + findSumOfNodes(root.right);
        return sum;
    }

    public static void main(String[] args) {
        Node a = new Node(1); // a is the root node
        Node b = new Node(4);
        Node c = new Node(3);
        Node d = new Node(2);
        Node e = new Node(6);
        Node f = new Node(5);

        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.right = f;

        System.out.println("The sum of nodes is : " + findSumOfNodes(a));
    }
}
