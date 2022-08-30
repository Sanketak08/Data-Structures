package Tree;

// Inorder successor/predecessor in BST

public class Que37 {
    public static void main(String[] args) {

    }

    public static TreeNode inorderSuccessorofBST(TreeNode root, TreeNode target) {
        if (root == null)
            return null;

        TreeNode successor = null;

        while (root != null) {
            if (target.data >= root.data) {
                root = root.right;
            } else {
                successor = root;
                root = root.left;
            }
        }
        return successor;
    }

    public static TreeNode inorderPredecessorofBST(TreeNode root, TreeNode target) {
        if (root == null)
            return null;

        TreeNode predecessor = null;

        while (root != null) {
            if (target.data >= root.data) {
                predecessor = root;
                root = root.right;
            } else {
                root = root.left;
            }
        }
        return predecessor;
    }
}
