package Tree;

//? Height of BST => O(logN) (log base 2)

// Search in BST

// Time Complexity => O(logN)

public class Que29 {
    public static void main(String[] args) {

    }

    public static TreeNode searchNode(TreeNode root, int target) {
        if (root == null)
            return null;

        while (root != null && root.data != target)
            root = root.data > target ? root.right : root.left;

        return root;
    }
}
