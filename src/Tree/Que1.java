package Tree;

// Tree traversals
// Time complexity => O(n), n = no. of nodes

public class Que1 {
    public static void main(String[] args) {

    }
    
    public static void preorder(TreeNode root) {
        if (root == null) {
            return;
        }

        System.out.print(root.data);
        preorder(root.left);
        preorder(root.right);
    }

    public static void inorder(TreeNode root) {
        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.data);
        inorder(root.right);
    }

    public static void postorder(TreeNode root) {
        if (root == null) {
            return;
        }

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data);
    }
}
