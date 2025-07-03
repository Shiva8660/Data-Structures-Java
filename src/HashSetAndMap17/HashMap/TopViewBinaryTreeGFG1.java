package HashSetAndMap17.HashMap;
import java.util.*;



class BinaryTreeNode {
    int data;
    BinaryTreeNode left;
    BinaryTreeNode right;

    BinaryTreeNode(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class LevelNodePair {
    BinaryTreeNode node;
    int level;

    LevelNodePair(BinaryTreeNode node, int level) {
        this.node = node;
        this.level = level;
    }
}

class TopViewBinaryTreeGFG1 {

    static ArrayList<Integer> getTopView(BinaryTreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        if (root == null) return result;

        HashMap<Integer, Integer> levelMap = new HashMap<>();
        Queue<LevelNodePair> queue = new LinkedList<>();
        queue.add(new LevelNodePair(root, 0));

        int minLevel = Integer.MAX_VALUE;
        int maxLevel = Integer.MIN_VALUE;

        while (!queue.isEmpty()) {
            LevelNodePair front = queue.poll();
            BinaryTreeNode node = front.node;
            int level = front.level;

            minLevel = Math.min(minLevel, level);
            maxLevel = Math.max(maxLevel, level);

            if (!levelMap.containsKey(level)) {
                levelMap.put(level, node.data);
            }

            if (node.left != null) {
                queue.add(new LevelNodePair(node.left, level - 1));
            }
            if (node.right != null) {
                queue.add(new LevelNodePair(node.right, level + 1));
            }
        }

        for (int i = minLevel; i <= maxLevel; i++) {
            result.add(levelMap.get(i));
        }

        return result;
    }
}
