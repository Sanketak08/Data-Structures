package Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.lang.StringBuilder;

// Serialize & Desrialize Binary Tree => ROOT -> STRING -> ROOT

// Explaination => Serialize will convert given root in string format. Level order traversal is used. Desrialize will convert that string again to the tree and return the root of that tree.

public class Que26 {
    public static void main(String[] args) {

    }

    public static String serializeTree(TreeNode root) {
        if (root == null)
            return "";

        Queue<TreeNode> queue = new LinkedList<>();
        StringBuilder res = new StringBuilder();

        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode curr = queue.poll();

            if (curr == null) {
                res.append("# ");
                continue;
            }
            res.append(curr.data + " ");
            queue.add(curr.left);
            queue.add(curr.right);
        }

        return res.toString();
    }

    public static TreeNode deserializeTree(String str) {
        if (str == "")
            return null;

        Queue<TreeNode> queue = new LinkedList<>();
        String[] values = str.split(" ");

        TreeNode root = new TreeNode(Integer.parseInt(values[0]));
        queue.add(root);

        for (int i = 1; i < values.length; i++) {
            TreeNode parent = queue.poll();

            if (!values[i].equals("#")) {
                TreeNode left = new TreeNode(Integer.parseInt(values[i]));
                parent.left = left;
                queue.add(left);
            }
            if (!values[++i].equals("#")) {
                TreeNode right = new TreeNode(Integer.parseInt(values[i]));
                parent.right = right;
                queue.add(right);
            }
        }
        return root;
    }
}
