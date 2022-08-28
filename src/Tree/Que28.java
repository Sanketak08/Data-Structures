package Tree;

import java.util.Stack;

// Flatten a BT => Represent preorder traversal of tree as Linked list. Don't create new linked list, rearrange tree nodes in this fashion.

// Explaination => Go to the right most node of the tree. Keep the track of 'prev' node. Attach current node's right to 'prev' node, make left of current node as null & update the 'prev' node.

// Time, Space Complexity => O(N)

public class Que28 {
    static TreeNode prev = null;

    public static void main(String[] args) {

    }

    public static void flattenTreeRecursive(TreeNode root) {
        if (root == null)
            return;

        flattenTreeRecursive(root.right);
        flattenTreeRecursive(root.left);

        root.right = prev;
        root.left = null;

        prev = root;
    }

    public static void flattenTreeIterative(TreeNode root) {
        if (root == null)
            return;

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode curr = stack.pop();

            if (curr.right != null)
                stack.push(curr.right);
            if (curr.left != null)
                stack.push(curr.left);

            if (!stack.isEmpty())
                curr.right = stack.peek();

            curr.left = null;
        }
    }
}
