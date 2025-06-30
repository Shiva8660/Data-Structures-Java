package BinarySearchTree16;

class BSTRangeCounter {

    public int countNodesInRange(Node root, int low, int high) {
        int[] count = {0};
        traverseAndCount(root, low, high, count);
        return count[0];
    }

    private void traverseAndCount(Node root, int low, int high, int[] count) {
        if (root == null) return;
        traverseAndCount(root.left, low, high, count);
        if (root.val >= low && root.val <= high) count[0]++;
        traverseAndCount(root.right, low, high, count);
    }
}


class BSTExample5 {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(50);
        root.left.left = new Node(1);
        root.right.left = new Node(40);
        root.right.right = new Node(100);

        BSTRangeCounter counter = new BSTRangeCounter();
        int low = 5, high = 45;
        int result = counter.countNodesInRange(root, low, high);
        System.out.println("Count of nodes in range [" + low + ", " + high + "] is: " + result);
    }
}
