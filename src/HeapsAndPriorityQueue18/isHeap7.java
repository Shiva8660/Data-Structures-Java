package HeapsAndPriorityQueue18;

class Node {
    int data;
    Node left, right;

    Node(int d) {
        data = d;
        left = right = null;
    }
}

public class isHeap7 {

    public int findSize(Node root) {
        if (root == null) return 0;
        return 1 + findSize(root.left) + findSize(root.right);
    }

    public boolean isFollowingHP(Node root) {
        if (root == null) return true;

        if (root.left != null) {
            if (root.data < root.left.data) return false;
        }
        if (root.right != null) {
            if (root.data < root.right.data) return false;
        }

        return isFollowingHP(root.left) && isFollowingHP(root.right);
    }

    public boolean isCBT(Node root, int i, Integer n) {
        if (root == null) return true;
        if (i >= n) return false;

        return isCBT(root.left, 2 * i + 1, n) && isCBT(root.right, 2 * i + 2, n);
    }

    // HP = heap properties
    boolean isHeapCheck(Node root) {
        int size = findSize(root);
        return isFollowingHP(root) && isCBT(root, 0, size);
    }

    public static void main(String[] args) {
        Node a = new Node(1); // root node
        Node b = new Node(4);
        Node c = new Node(3);
        Node d = new Node(2);
        Node e = new Node(6);
        Node f = new Node(5);

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.right = f;

        isHeap7 obj = new isHeap7(); // Create object
        System.out.println(obj.isHeapCheck(a)); // Call the correct method
    }
}
