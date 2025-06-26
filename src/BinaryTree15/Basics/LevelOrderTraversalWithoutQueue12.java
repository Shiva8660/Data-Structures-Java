package BinaryTree15.Basics;
import java.util.Scanner;

// lever order traversal using DFS instead of BFS like generally using queue
// DFS - > for every call we are traversing whole tree and when lev matches we are printing we can generally call it DFS
// for every call in loop we are calling the function -> TC = (Height of the tree * n)

public class LevelOrderTraversalWithoutQueue12 {
    static int lev;

    // you can see the code we have used is of preorder and you can make it preOrder or in order or post order => at the end output is same till left call is in top
    // and if you replace first right call and next to that left then you will get answer in reverse order
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

        System.out.print("___Level Order Traversal Without queue___ ");
        System.out.println();
        for (int i = 0; i <= 3 ; i++) {
            lev = i;
            NthLevel(a,0);
            System.out.println();
        }
    }
}

