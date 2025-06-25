package BinaryTree15;

public class FindProductsOfNonZeroElements4 {

//    public static int findProductOfNodes(Node root){
//        if(root == null ) return 1;
//        int left = findProductOfNodes(root.left);
//        int right = findProductOfNodes(root.right);
//
//        // Multiply only if root.val is not zero
//        return (root.val == 0 ? 1 : root.val) * left * right;
//    }
public static int findProductOfNodes(Node root){
    if(root == null) return 1;

    int left = findProductOfNodes(root.left);
    int right = findProductOfNodes(root.right);

    int product;
    if (root.val == 0) {
        product = 1;
    } else {
        product = root.val;
    }

    return product * left * right;
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


