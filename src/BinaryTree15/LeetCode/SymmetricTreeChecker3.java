package BinaryTree15.LeetCode;

public class SymmetricTreeChecker3 {

    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    public void mirror(TreeNode root) {
        if (root == null) return;
        if (root.left == null && root.right == null) return;

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        mirror(root.left);
        mirror(root.right);
    }

    public boolean checkSame(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;

        if (p.val != q.val) return false;
        if (!checkSame(p.left, q.left)) return false;
        if (!checkSame(p.right, q.right)) return false;

        return true;
    }

    public boolean isTreeSymmetric(TreeNode root) {
        if (root == null) return true;
        mirror(root.left);
        return checkSame(root.left, root.right);
    }

    public static void main(String[] args) {
        SymmetricTreeChecker3 checker = new SymmetricTreeChecker3();

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(3);

        System.out.println(checker.isTreeSymmetric(root));  // Output: true
    }
}


