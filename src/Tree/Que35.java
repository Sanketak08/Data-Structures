package Tree;

// Find LCA in BST => Lowest common ancestor of two nodes is first intersection point from the bottom & last intersection point from the top

// Time Complexity => O(Height of Tree)
// Space Complexity => O(1), if Iterative method is used & it increases in recursive method due to auxillary stack space.

public class Que35 {
    public static void main(String[] args) {

    }

    public static TreeNode lcaInBST(TreeNode root, TreeNode first, TreeNode second) {
        if (root == null)
            return null;

        int curr = root.data;

        if (curr < first.data && curr < second.data)
            return lcaInBST(root.right, first, second);

        if (curr > first.data && curr > second.data)
            return lcaInBST(root.left, first, second);

        // This means that any one of the given node is root, so it will be the first
        // point of intersection from bottom, so return it.
        return root;
    }
}
