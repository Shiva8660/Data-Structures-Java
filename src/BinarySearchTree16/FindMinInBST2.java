package BinarySearchTree16;

public class FindMinInBST2 {

    public static int findMin(Node root) {
        if (root.left == null) return root.val;
        return findMin(root.left);
    }

    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(5);
        Node c = new Node(15);
        Node d = new Node(2);
        Node e = new Node(8);
        Node f = new Node(12);
        Node g = new Node(19);


        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.left = f;
        c.right = g;

        System.out.println("The min value in BST is : " + findMin(a));
    }
}