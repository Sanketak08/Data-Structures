package Tree;

// Insert a given node in BST

// Time Complexity => O(logN)

public class Que32 {
    public static void main(String[] args) {

    }

    public static TreeNode insertNode(TreeNode root, int val) {
        if (root == null)
            return new TreeNode(val);

        TreeNode curr = root;

        while (true) {
            if (curr.data <= val) {
                if (curr.right != null)
                    curr = curr.right;
                else {
                    curr.right = new TreeNode(val);
                    break;
                }
            } else {
                if (curr.left != null)
                    curr = curr.left;
                else {
                    curr.left = new TreeNode(val);
                    break;
                }
            }
        }
        return root;
    }
}
