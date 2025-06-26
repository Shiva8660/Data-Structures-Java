package BinaryTree15.Basics;

// using queue can you give next line after printing first level
// yes we can using user defined class

import java.util.LinkedList;
import java.util.Queue;


public class LevelOrderTraversal13 {

    public static class Pair{
        Node node;
        int level;

        Pair(Node node, int level){
            this.node = node;
            this.level = level;
        }
    }

    public static void LevelOrderTraversal(Node root){
        int prevLevel = 0;
        if(root == null) return;
        Queue<Pair> q = new LinkedList<>();

        q.add(new Pair(root,0));

        while (!q.isEmpty()){
            Pair front = q.poll();
            Node temp = front.node;
            int lvl = front.level;

            // to give next line after level's
            if(lvl != prevLevel){
                System.out.println();
                prevLevel++;
            }

            System.out.print(temp.val + " ");

            if(temp.left != null) q.add(new Pair(temp.left,lvl+1));
            if(temp.right != null) q.add(new Pair(temp.right,lvl+1));
        }
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
        c.left = f;
        c.right = g;

        System.out.print("---Level Order Traversal---");
        System.out.println();
        LevelOrderTraversal(a);


    }
}

