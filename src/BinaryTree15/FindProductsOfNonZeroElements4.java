package BinaryTree15;

public class FindProductsOfNonZeroElements4 {

    public static int findProductOfNodes(Node root){
        if(root == null || root.val == 0) return 1;
        return  root.val * findProductOfNodes(root.left) * findProductOfNodes(root.right);
    }

    public static void main(String[] args) {
        Node a = new Node(2); // a is the root node
        Node b = new Node(2);
        Node c = new Node(0);
        Node d = new Node(2);
        Node e = new Node(2);
        Node f = new Node(0);

        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.right = f;

        System.out.println("The product of nodes is : " + findProductOfNodes(a));
    }
}


