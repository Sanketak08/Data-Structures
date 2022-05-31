package Tree;

// Maximum depth in binary tree
// Time, Space Complexity => O(N)

public class Que5 {
    public static void main(String[] args) {

    }
    
    public static int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int lHeight = maxDepth(root.left);
        int rHeight = maxDepth(root.right);

        return 1 + Math.max(lHeight, rHeight);
    }
}
