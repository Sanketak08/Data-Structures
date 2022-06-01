package Tree;

import java.util.*;

// Zig-zag traversal

public class Que10 {
    public static void main(String[] args) {

    }
    
    public static Vector<Vector<Integer>> zigzag(TreeNode root) {
        Vector<Vector<Integer>> list = new Vector<>();
        Queue<TreeNode> queue = new LinkedList<>();

        // true => Left -> Right
        // false => Right -> Left
        boolean flag = true;

        if (root == null) {
            return list;
        }

        queue.offer(root);

        while (!queue.isEmpty()) {
            int n = queue.size();
            Vector<Integer> subList = new Vector<>();

            for (int i = 0; i < n; i++) {
                int index = flag ? i : 0;
                subList.add(index, queue.peek().data);

                if (queue.peek().left != null) {
                    queue.offer(queue.peek().left);
                }
                if (queue.peek().right != null) {
                    queue.offer(queue.peek().right);
                }
                queue.remove();
            }
            flag = !flag;
            list.add(subList);
        }

        return list;
    }
}
