package BinaryTree15.LeetCode;


public class SameBinaryTreeChecker1 {

    public boolean isSameTree(Node p, Node q) {
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;

        if (p.val != q.val) return false;
        if (!isSameTree(p.left, q.left)) return false;
        if (!isSameTree(p.right, q.right)) return false;

        return true;
    }

    public static void main(String[] args) {
        SameBinaryTreeChecker1 checker = new SameBinaryTreeChecker1();

        Node a1 = new Node(1);
        a1.left = new Node(2);
        a1.right = new Node(3);

        // Second tree
        Node b1 = new Node(1);
        b1.left = new Node(2);
        b1.right = new Node(3);

        boolean result = checker.isSameTree(a1, b1);
        System.out.println("Are the two trees the same? " + result);
    }
}

