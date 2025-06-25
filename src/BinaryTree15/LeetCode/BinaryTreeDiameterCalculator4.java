package BinaryTree15.LeetCode;


public class BinaryTreeDiameterCalculator4 {

    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public int calculateHeight(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(calculateHeight(root.left), calculateHeight(root.right));
    }

    public int computeDiameter(TreeNode root) {
        if (root == null) return 0;

        int rootDiameter = calculateHeight(root.left) + calculateHeight(root.right);
        int leftDiameter = computeDiameter(root.left);
        int rightDiameter = computeDiameter(root.right);

        return Math.max(rootDiameter, Math.max(leftDiameter, rightDiameter));
    }

    public static void main(String[] args) {
        BinaryTreeDiameterCalculator4 calculator = new BinaryTreeDiameterCalculator4();

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        System.out.println(calculator.computeDiameter(root));  // Output: 3
    }
}
