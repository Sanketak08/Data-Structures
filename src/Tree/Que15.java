package Tree;

import java.util.ArrayList;
import java.util.List;

// Right & Left View of Binary Tree
// Time Complexity => O(N)
// Space Complexity => O(height of tree)

public class Que15 {
    static List<Integer> list1 = new ArrayList<>();
    static List<Integer> list2 = new ArrayList<>();
    public static void main(String[] args) {

    }

    // Reverse preorder traversal is used => Root, Right, Left
    public static void rightView(TreeNode root, int level) {
        if (root == null)
            return;

        if (level == list1.size())
            list1.add(root.data);

        if (root.right != null)
            rightView(root.right, level + 1);

        if (root.left != null)
            rightView(root.left, level + 1);
    }

    // Preorder traversal is used
    public static void leftView(TreeNode root, int level) {
        if (root == null)
            return;

        if (level == list2.size())
            list2.add(root.data);

        if (root.left != null)
            leftView(root.left, level + 1);

        if (root.right != null)
            leftView(root.right, level + 1);
    }
}
