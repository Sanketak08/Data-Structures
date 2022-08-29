package Tree;

// Delete a Node from BST

// Time Complexity => O(Height of Tree)

public class Que33 {
    public static void main(String[] args) {

    }

    public static TreeNode deleteNode(TreeNode root, int val) {
        if (root == null)
            return null;
        if (root.data == val)
            return helper(root);

        TreeNode curr = root;
        while (curr != null) {
            if (curr.data > val) {
                if (curr.left != null && curr.left.data == val) {
                    curr.left = helper(curr.left);
                    break;
                } else
                    curr = curr.left;
            } else {
                if (curr.right != null && curr.right.data == val) {
                    curr.right = helper(curr.right);
                    break;
                } else
                    curr = curr.right;
            }
        }
        return root;
    }

    public static TreeNode helper(TreeNode root) {
        if (root.left == null)
            return root.right;
        else if (root.right == null)
            return root.left;
        else {
            TreeNode rightChild = root.right;
            TreeNode lastRightOfLeftChild = findLastRight(root.left);
            lastRightOfLeftChild.right = rightChild;
            return root.left;
        }
    }

    public static TreeNode findLastRight(TreeNode root) {
        if (root.right == null)
            return root;
        return findLastRight(root.right);
    }
}
