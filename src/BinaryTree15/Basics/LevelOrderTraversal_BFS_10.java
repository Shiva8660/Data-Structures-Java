package BinaryTree15.Basics;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal_BFS_10 {

    public static void LevelOrderTraversalLeftToRight(Node a){
        if(a == null) return;
        Queue<Node> q = new LinkedList<>();

        q.add(a);

        while (!q.isEmpty()){
            Node temp = q.poll();
            System.out.print(temp.val + " ");
            if(temp.left != null) q.add(temp.left);
            if(temp.right != null) q.add(temp.right);
        }
        System.out.println();
    }

    public static void LevelOrderTraversalRightToLeft(Node a){
        if(a == null) return;
        Queue<Node> q = new LinkedList<>();

        q.add(a);

        while (!q.isEmpty()){
            Node temp = q.poll();
            System.out.print(temp.val + " ");
            if(temp.right != null) q.add(temp.right);
            if(temp.left != null) q.add(temp.left);
        }
        System.out.println();
    }

    public static void main(String[] args) {
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

        System.out.print("Level Order Traversal:(Left to Right) ");
        LevelOrderTraversalLeftToRight(a);

        System.out.print("Level Order Traversal:(Right to Left) ");
        LevelOrderTraversalRightToLeft(a);
    }
}
