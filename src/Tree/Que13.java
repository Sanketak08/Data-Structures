package Tree;

import java.util.*;

// Top view of Binary Tree => Level order traversal, Recursive traversal is not appropriate for this problem
// Time, Space Complexity => O(N)

public class Que13 {
    public static void main(String[] args) {

    }
    
    public static List<Integer> topView(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new TreeMap<>();
        Queue<Pair> queue = new LinkedList<>();

        if (root == null)
            return list;
        
        queue.offer(new Pair(root, 0));

        while (!queue.isEmpty()) {
            Pair tuple = queue.poll();
            int col = tuple.val;
            TreeNode node = tuple.node;

            if (!map.containsKey(col)) {
                map.put(col, node.data);
            }

            if (node.left != null) {
                queue.offer(new Pair(node.left, col - 1));
            }

            if (node.right != null) {
                queue.offer(new Pair(node.right, col + 1));
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            list.add(entry.getValue());
        }

        return list;
    }
}
