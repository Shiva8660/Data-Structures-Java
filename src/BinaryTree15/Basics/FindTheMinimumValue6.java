package BinaryTree15.Basics;

public class FindTheMinimumValue6 {

    public static int findMinimum(Node root){
        if(root == null) return Integer.MAX_VALUE;

        return Math.min(root.val, Math.min(findMinimum(root.left), findMinimum(root.right)));
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

        System.out.println("The minimum element : " + findMinimum(a));
    }
}


