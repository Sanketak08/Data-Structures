package Tree;

// Check if two trees are equal
// Time, Space complexity => O(N)

public class Que9 {
    public static void main(String[] args) {

    }
    
    public static boolean isEqual(TreeNode root1, TreeNode root2) {
        if (root1 == null || root2 == null) {
            return (root1 == root2);
        }

        return (root1.data == root2.data && isEqual(root1.left, root2.left) && isEqual(root1.right, root2.right));
    }
}
