package Tree;

import java.util.*;

// Maximum width of a binary tree
// Time, Space Complexity => O(N)

public class Que19 {
    public static void main(String[] args) {

    }

    public static int maxWidth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int ans = 0;
        Queue<Pair> queue = new LinkedList<>();

        queue.offer(new Pair(root, 0));

        while (!queue.isEmpty()) {
            int size = queue.size();
            int mmin = queue.peek().val;
            int first = 0, last = 0;

            for (int i = 0; i < size; i++) {
                int cur_id = queue.peek().val - mmin;
                TreeNode node = queue.peek().node;
                queue.poll();
                if (i == 0)
                    first = cur_id;

                if (i == size - 1)
                    last = cur_id;

                if (node.left != null)
                    queue.offer(new Pair(node.left, cur_id * 2 + 1));

                if (node.right != null)
                    queue.offer(new Pair(node.right, cur_id * 2 + 2));
            }
            ans = Math.max(ans, last - first + 1);
        }

        return ans;
    }
}
