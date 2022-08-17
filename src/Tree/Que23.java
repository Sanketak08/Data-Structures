package Tree;

// Count total nodes in COMPLETE BT

// Explaination => Calculate the height of subtrees i.e. left & right. If height is equal then return (2^n - 1) else return (1 + leftHeight(root.left) + rightHeight(root.right))

// Time Complexity => (O(logN))^2
// Space Complexity => O(logN)

public class Que23 {
    public static void main(String[] args) {

    }

    public static int countNodes(TreeNode root) {
        if (root == null)
            return 0;

        int left = leftHeight(root);
        int right = rightHeight(root);

        // This means that the subtree with this root is complete
        if (left == right)
            return (((int) Math.pow(2, left)) - 1);
        else
            return (1 + leftHeight(root.left) + rightHeight(root.right));
    }

    public static int leftHeight(TreeNode root) {
        int count = 0;
        while (root != null) {
            count++;
            root = root.left;
        }
        return count;
    }

    public static int rightHeight(TreeNode root) {
        int count = 0;
        while (root != null) {
            count++;
            root = root.right;
        }
        return count;
    }
}
