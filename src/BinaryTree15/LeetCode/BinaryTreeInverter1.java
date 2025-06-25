package BinaryTree15.LeetCode;

class Node {
    int val;
    Node left;
    Node right;

    Node(int val) {
        this.val = val;
    }
}

class TreeInverter {
    public Node invert(Node root) {
        if (root == null) return null;
        if (root.left == null && root.right == null) return root;

        Node temp = root.left;
        root.left = root.right;
        root.right = temp;

        invert(root.left);
        invert(root.right);

        return root;
    }
}

public class BinaryTreeInverter1 {
    public static void main(String[] args) {
        Node root = new Node(4);
        root.left = new Node(2);
        root.right = new Node(7);
        root.left.left = new Node(1);
        root.left.right = new Node(3);
        root.right.left = new Node(6);
        root.right.right = new Node(9);

        TreeInverter inverter = new TreeInverter();
        Node invertedRoot = inverter.invert(root);

        printInorder(invertedRoot);
    }

    static void printInorder(Node root) {
        if (root == null) return;
        printInorder(root.left);
        System.out.print(root.val + " ");
        printInorder(root.right);
    }
}

