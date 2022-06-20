package Tree;

// Lowest Common Ancestor => find the lowest ancestor(common parent but lo height) between given two nodes 

// Brute force => Trace the path from root to the each node and then start comparing from start of two arrays and iterate till you don't get unequal nodes. This approach needs more space complexity.

// Time, Space Complexity => O(N)

public class Que18 {
    public static void main(String[] args) {

    }
    
    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode one, TreeNode two) {
        if (root == null || root == one || root == two) {
            return root;
        }

        TreeNode left = lowestCommonAncestor(root.left, one, two);
        TreeNode right = lowestCommonAncestor(root.right, one, two);

        if (left == null) {
            return right;
        } else if (right == null) {
            return left;
        } else { // if both are not null, then we found our LCA so return it.
            return root;
        }
    }
}
