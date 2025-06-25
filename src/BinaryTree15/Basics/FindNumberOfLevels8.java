package BinaryTree15.Basics;

public class FindNumberOfLevels8 {

    public static int CountNumberOfLevels(Node root){
        if(root == null) return 0;

        return 1 + Math.max(CountNumberOfLevels(root.left) , CountNumberOfLevels(root.right));
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);


        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.right = f;
        c.left = g;

        // to find height => (Total Number of Levels - 1)
        System.out.println("The total number of level's is : " + CountNumberOfLevels(a));
    }
}




