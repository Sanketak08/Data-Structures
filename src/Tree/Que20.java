package Tree;

// Children Sum Property - Sum of chld nodes of a particular root node must be equal to value of root node. eg => 35(child) + 10(child) = 45(root). If it's not equal, make it equal by adding '1' any no. of times. eg => Initially, root = 2, child nodes = 35, 10. So make '2' as '45' by adding '1' 43 times.

public class Que20 {
    public static void main(String[] args) {

    }
    
    public static void childSum(TreeNode root) {
        if (root == null)
            return;
        
        int child = 0;
        if (root.left != null)
            child += root.left.data;
        
        if (root.right != null)
            child += root.right.data;

        if (child >= root.data)
            root.data = child;
        else {
            if (root.left != null)
                root.left.data = root.data;
            else if (root.right != null)
                root.right.data = root.data;
        }

        childSum(root.left);
        childSum(root.right);

        int tot = 0;
        if (root.left != null)
            tot += root.left.data;
        
        if (root.right != null)
            tot += root.right.data;
        
        if (root.left != null || root.right != null)
            root.data = tot;
    }
}
