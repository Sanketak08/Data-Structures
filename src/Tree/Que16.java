package Tree;

// To check if given tree is symmetric => if divided from center, there should be mirror image on another side
// Time, Space complexity => O(N)

public class Que16 {
    public static void main(String[] args) {

    }
    
    public static boolean isSymmetric(TreeNode root) {
        return root == null || isSymmetricHelp(root.left, root.right);
    }

    public static boolean isSymmetricHelp(TreeNode left, TreeNode right) {
        if (left == null || right == null)
            return (left == right);
        
        if (left.data != right.data)
            return false;

        return isSymmetricHelp(left.left, right.right) && isSymmetricHelp(left.right, right.left);
    }

}
