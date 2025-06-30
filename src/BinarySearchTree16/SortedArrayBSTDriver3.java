package BinarySearchTree16;

class SortedArrayToBSTConverter {

    public Node convertToBST(int[] nums, int left, int right) {
        if (left > right) return null;

        int mid = (left + right) / 2;
        Node root = new Node(nums[mid]);

        root.left = convertToBST(nums, left, mid - 1);
        root.right = convertToBST(nums, mid + 1, right);

        return root;
    }

    public Node generateBST(int[] nums) {
        return convertToBST(nums, 0, nums.length - 1);
    }
}
public class SortedArrayBSTDriver3 {
    public static void main(String[] args) {
        int[] sortedArray = {-10, -3, 0, 5, 9};
        SortedArrayToBSTConverter converter = new SortedArrayToBSTConverter();
        Node root = converter.generateBST(sortedArray);
        inorderTraversal(root);
    }

    public static void inorderTraversal(Node root) {
        if (root == null) return;
        inorderTraversal(root.left);
        System.out.print(root.val + " ");
        inorderTraversal(root.right);
    }
}
