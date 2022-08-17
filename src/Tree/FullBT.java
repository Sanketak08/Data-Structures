package Tree;

// FUll Binary Tree => Tree in which all nodes have either 0 or 2 child nodes.

public class FullBT {
    public static void main(String[] args) {

    }
    
    public static boolean isFullBT(TreeNode root) {
        if (root == null) {
            return true;
        }

        if (root.left == null && root.right == null) {
            return true;
        }

        if (root.left != null && root.right != null) {
            return (isFullBT(root.left) && isFullBT(root.right));
        }

        return false;
    }
}
