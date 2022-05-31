package Tree;

// Diameter of binary tree
// Diameter => 1. longest path between two nodes
//             2. Path does not need to pass via root

//* Naive approach
// Traverse through the whole tree. Calculate left and right height of each node and sum them up. And store the maximum sum in another variable. Return maxSum. Time Complexity => O(N^2)

public class Que7 {
    public static void main(String[] args) {

    }
    
    public static int diameterOfBT(TreeNode root) {
        int[] diameter = new int[1];
        heightOfBT(root, diameter);
        return diameter[0];
    }

    public static int heightOfBT(TreeNode root,int[]diameter) {
        if (root == null) {
            return 0;
        }

        int lHeight = heightOfBT(root.left, diameter);
        int rHeight = heightOfBT(root.right, diameter);

        diameter[0] = Math.max(diameter[0], (lHeight + rHeight));

        return 1 + Math.max(lHeight, rHeight);
    }
}
