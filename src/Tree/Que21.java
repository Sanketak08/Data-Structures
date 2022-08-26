package Tree;

import java.util.*;

// Print all the nodes at distance K in BT - Given a value'K' and 'TARGET' from which we need to print all the nodes.

// Explaination => Try to go in radial direction from the target node i.e. (upper, downward left, downward right) and increase the level. When level == k, print those nodes. To go in upper direction keep the track of parent node using hashmap.

// Time, Space Complexity => O(N)

public class Que21 {
    public static void main(String[] args) {

    }

    // Method to keep the track of parents
    // e.g. => child(key) -> parent(value)
    public static void markParents(TreeNode root, Map<TreeNode, TreeNode> parent_track, TreeNode target) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode curr = queue.poll();
            if (curr.left != null) {
                parent_track.put(curr.left, curr);
                queue.offer(curr.left);
            }
            if (curr.right != null) {
                parent_track.put(curr.right, curr);
                queue.offer(curr.right);
            }
        }
    }

    public static List<Integer> printKNodes(TreeNode root, TreeNode target, int k) {
        Map<TreeNode, TreeNode> parent_track = new HashMap<>();
        markParents(root, parent_track, root);
        Map<TreeNode, Boolean> visited = new HashMap<>();
        Queue<TreeNode> queue = new LinkedList<>();

        queue.offer(target);
        visited.put(target, true);

        int curr_level = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            if (curr_level == k)
                break;

            curr_level++;
            for (int i = 0; i < size; i++) {
                TreeNode curr = queue.poll();

                // Downward left
                if (curr.left != null && visited.get(curr.left) == null) {
                    queue.offer(curr.left);
                    visited.put(curr.left, true);
                }
                // Downward right
                if (curr.right != null && visited.get(curr.right) == null) {
                    queue.offer(curr.right);
                    visited.put(curr.right, true);
                }
                // Upper Node (Marked in 'parent_track')
                if (parent_track.get(curr) != null && visited.get(parent_track.get(curr)) == null) {
                    queue.offer(parent_track.get(curr));
                    visited.put(parent_track.get(curr), true);
                }
            }
        }

        List<Integer> result = new ArrayList<>();
        while (!queue.isEmpty()) {
            result.add(queue.poll().data);
        }
        return result;
    }
}
