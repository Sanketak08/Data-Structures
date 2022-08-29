package Tree;

// Ceil in BST => Given a key, find a node which is just greater than or equal to the key.

// Time COmplexity => O(logN)

public class Que30 {
    public static void main(String[] args) {

    }

    public static int findCeil(TreeNode root, int key) {
        if (root == null)
            return -1;

        int ceil = -1;

        while (root != null) {
            if (root.data == key) {
                ceil = root.data;
                return ceil;
            }

            if (key > root.data)
                root = root.right;
            else {
                ceil = root.data;
                root = root.left;
            }
        }
        return ceil;
    }
}
