package BinaryTree15.Basics;


public class FindProductsOfNodes3 {

    public static int findProductOfNodes(Node root){
        if(root == null) return 1;
        int product = root.val * findProductOfNodes(root.left) * findProductOfNodes(root.right);
        return product;
    }

    public static void main(String[] args) {
        Node a = new Node(2); // a is the root node
        Node b = new Node(2);
        Node c = new Node(2);
        Node d = new Node(2);
        Node e = new Node(2);
        Node f = new Node(2);

        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.right = f;

        System.out.println("The product of nodes is : " + findProductOfNodes(a));
    }
}

