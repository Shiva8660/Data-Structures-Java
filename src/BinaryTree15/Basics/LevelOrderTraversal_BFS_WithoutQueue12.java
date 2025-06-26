package BinaryTree15.Basics;
import java.util.Scanner;

public class LevelOrderTraversal_BFS_WithoutQueue12 {
    static int lev;

    public static void NthLevel(Node root,int x){
        if(root == null) return;
        if(x == lev) System.out.print(root.val + " ");
        NthLevel(root.left,x+1);
        NthLevel(root.right,x+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node a = new Node(1); // a is the root node
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);


        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.left = f;
        c.right = g;


        System.out.println();
        System.out.print("Level Order Traversal Without queue : ");
        for (int i = 0; i <= 3 ; i++) {
            lev = i;
            NthLevel(a,0);
        }




    }
}

