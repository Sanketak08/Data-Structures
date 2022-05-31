package Tree;

// Maximum Path sum in binary tree

public class Que8 {
    public static void main(String[] args) {

    }
    
    public static int maxPathSum(TreeNode root) {
        int[] maxPathSum = new int[1];
        maxPathForNode(root, maxPathSum);
        return maxPathSum[0];
    }

    public static int maxPathForNode(TreeNode root, int[]maxPathSum) {
        if (root == null) {
            return 0;
        }

        int leftSum = Math.max(0, maxPathForNode(root.left, maxPathSum));
        int rightSum = Math.max(0, maxPathForNode(root.right, maxPathSum));

        maxPathSum[0] = Math.max(maxPathSum[0], (root.data + leftSum + rightSum));

        return (root.data + Math.max(leftSum, rightSum));
    }

}
