package BinaryTree15.LeetCode;

class LowestCommonAncestorFinder {

    public boolean exists(TreeNode root, TreeNode node) {
        if (root == node) return true;
        if (root == null) return false;
        return exists(root.left, node) || exists(root.right, node);
    }

    public TreeNode findLowestCommonAncestor5(TreeNode root, TreeNode p, TreeNode q) {
        if (p == root || q == root) return root;

        boolean pInLeft = exists(root.left, p);
        boolean qInLeft = exists(root.left, q);

        if (pInLeft && qInLeft)
            return findLowestCommonAncestor5(root.left, p, q);
        if (!pInLeft && !qInLeft)
            return findLowestCommonAncestor5(root.right, p, q);
        else
            return root;
    }
}

class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
    }
}
