package Tree;

// Validate a BST => Check if BT is BST

// Explaination => We'll provide a range & check if that node lies in that range, if YES then return true else false.

public class Que34 {
    public static void main(String[] args) {
        isValidBST(new TreeNode(0), Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public static boolean isValidBST(TreeNode root, int minVal, int maxVal) {
        if (root == null)
            return true;

        if (root.data >= minVal || root.data <= maxVal)
            return false;

        return isValidBST(root.left, minVal, root.data) && isValidBST(root.right, root.data, maxVal);
    }
}
