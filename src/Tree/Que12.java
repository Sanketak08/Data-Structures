package Tree;

import java.util.*;

// Vertical Order Traversing

class Tuple {
    TreeNode node;
    int row;
    int col;

    public Tuple(TreeNode node, int row, int col) {
        this.node = node;
        this.row = row;
        this.col = col;
    }
}

public class Que12 {
    public static void main(String[] args) {

    }
    
    public static List<List<Integer>> verticalTraversal(TreeNode root) {
        // Outer Map => key = vertical, value = Map
        // Inner Map => key = level, value = Priority Queue containing values
        TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> map = new TreeMap<>();

        // Queue to store particular node along with it's coordinates i.e vertical & level (row & col)
        Queue<Tuple> queue = new LinkedList<>();

        queue.offer(new Tuple(root, 0, 0));

        while (!queue.isEmpty()) {
            Tuple tuple = queue.poll();
            TreeNode node = tuple.node;
            int x = tuple.row;
            int y = tuple.col;

            // Initializing empty trees and priority queues
            if (!map.containsKey(x)) {
                map.put(x, new TreeMap<>());
            }
            if (!map.get(x).containsKey(y)) {
                map.get(x).put(y, new PriorityQueue<>());
            }

            // Putting value in priority queue according to the vertical & level
            map.get(x).get(y).offer(node.data);

            // This will traverse in left direction i.e. will reduce vertical no. by 1
            if (node.left != null) {
                queue.offer(new Tuple(node.left, x - 1, y + 1));
            }

            // This will traverse in right direction i.e. will increase vertical no. by 1
            if (node.right != null) {
                queue.offer(new Tuple(node.right, x + 1, y + 1));
            }

            // Looping in our custom data structure and appending values in 2D list
            List<List<Integer>> list = new ArrayList<>();

            for (TreeMap<Integer, PriorityQueue<Integer>> ys : map.values()) {
                list.add(new ArrayList<>());
                for (PriorityQueue<Integer> nodes : ys.values()) {
                    while (!nodes.isEmpty()) {
                        list.get(list.size() - 1).add(nodes.poll());
                    }
                }
            }

            return list;
        }
    }

}
