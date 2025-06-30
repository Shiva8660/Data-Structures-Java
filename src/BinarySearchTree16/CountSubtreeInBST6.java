package BinarySearchTree16;

public class CountSubtreeInBST6 {

    public static void helper(Node root, int low, int high, int[] ans){
        if(root == null) return;
        helper(root.left, low, high, ans);
        helper(root.right, low, high, ans);
        if(root.val >= low && root.val <= high) ans[0]++;

    }

    public static int subtreeCnt(Node root, int low, int high){

        int[] ans = {0};
        helper(root, low, high, ans);
        return ans[0];

    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(50);
        root.left.left = new Node(1);
        root.right.left = new Node(40);
        root.right.right = new Node(100);
        int low = 1, high = 45;

        System.out.println("The number of Sub- BST is :"  + subtreeCnt(root, low, high));
    }
}
