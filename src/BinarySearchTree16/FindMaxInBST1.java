package BinarySearchTree16;

class Node{
    int val;
    Node left;
    Node right;

    Node(int val){
        this.val = val;
    }
}

public class FindMaxInBST1 {
    
public static int findMax(Node root){
    if(root.right == null) return root.val;
    return findMax(root.right);
}

    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(5);
        Node c = new Node(15);
        Node d = new Node(2);
        Node e = new Node(8);
        Node f = new Node(12);
        Node g = new Node(19);


        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.left = f; c.right = g;

        System.out.println("The max value in BST is : " + findMax(a));
    }
}
