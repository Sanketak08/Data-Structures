package Tree;

import java.util.*;

// Minimum time taken to BURN the BT from any node => Goes in radial direction and burns nodes at equal distance in equal time.

// Same explaination as that of previous problem. Only break the loop when queue is empty.

// Time, Space Complexity => O(N)

public class Que22 {
    public static void main(String[] args) {

    }

    public static void markParents(TreeNode root, Map<TreeNode, TreeNode> parent_track) {
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

    public static int minTimeForBurn(TreeNode root, TreeNode target) {
        Map<TreeNode, TreeNode> parent_track = new HashMap<>();
        markParents(root, parent_track);

        Map<TreeNode, Boolean> visited = new HashMap<>();
        Queue<TreeNode> queue = new LinkedList<>();

        queue.offer(target);
        visited.put(target, true);

        int curr_time = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            TreeNode curr = queue.poll();
            int flag = 0;
            for (int i = 0; i < size; i++) {
                if (curr.left != null && visited.get(curr.left) == null) {
                    flag = 1;
                    queue.offer(curr.left);
                    visited.put(curr.left, true);
                }
                if (curr.right != null && visited.get(curr.right) == null) {
                    flag = 1;
                    queue.offer(curr.right);
                    visited.put(curr.right, true);
                }
                if (parent_track.get(curr) != null && visited.get(parent_track.get(curr)) == null) {
                    flag = 1;
                    queue.offer(parent_track.get(curr));
                    visited.put(parent_track.get(curr), true);
                }
            }
            // If size of queue is zero this should not be incremented
            if (flag == 1)
                curr_time++;
        }
        return curr_time;
    }
}
