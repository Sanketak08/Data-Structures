package Tree;

// Check for balanced Tree
// Balanced tree => For every node, [ height(left) - height(right) <= 1 ]

//* Naive Approach
// Check height of right and left nodes using different function and check the difference between both heights, if <= 1 return true else false. Time complexity => O(N^2)

public class Que6 {
    public static void main(String[] args) {

    }
    
    public static int checkBalanced(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int lHeight = checkBalanced(root.left);
        int rHeight = checkBalanced(root.right);

        // Add these two conditions
        if (lHeight == -1 || rHeight == -1)
            return -1;

        if (Math.abs(lHeight - rHeight) > 1)
            return -1;

        return 1 + Math.max(lHeight, rHeight);
    }

}
