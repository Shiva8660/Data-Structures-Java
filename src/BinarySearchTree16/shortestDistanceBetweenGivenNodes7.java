package BinarySearchTree16;

public class shortestDistanceBetweenGivenNodes7 {

    public static int findDistance(Node root, int target){
        int dist = 0;
        if(root == null) return 0;
        while (root != null && root.val != target){
            dist++;
            if(root.val < target) root = root.right;
            else root = root.left;
        }
        return dist;
    }

    public static Node helper(Node root, int a, int b){
        if(root == null) return null;
        if(root.val < a && root.val < b) return helper(root.right, a, b);
        else if(root.val > a && root.val > b) return helper(root.left, a, b);
        else return root;
    }

    public static int distanceBetweenTwoKeys(Node root, int a, int b){
        Node lca = helper(root, a, b);

        int d1 = findDistance(lca, a);
        int d2 = findDistance(lca, b);
        return d1+d2;
    }

    public static void main(String[] args) {

            // creating the binary search tree
            //          5
            //        /   \
            //       2     12
            //      / \    /  \
            //     1   3  9    21
            //                /  \
            //              19    25

            Node root = new Node(5);
            root.left = new Node(2);
            root.left.left = new Node(1);
            root.left.right = new Node(3);
            root.right = new Node(12);
            root.right.left = new Node(9);
            root.right.right = new Node(21);
            root.right.right.left = new Node(19);
            root.right.right.right = new Node(25);

            int a = 9, b = 19;
            System.out.println("The distance is : " + distanceBetweenTwoKeys(root, a, b));
        }
    }

