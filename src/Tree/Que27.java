package Tree;

import java.util.ArrayList;

// Morris traversal to find Inorder & preorder

// Explaination => Other recursive traversals use O(N) auxillary space but this traversal make use of O(1) space beacause it uses Threaded Binary Tree. Various edge cases are handled. Connect the rightmost node (because it is last node in inorder traversal of left subtree) of left subtree to the root of that subtree. In this way, it becomes easy to traverse back to the root.

// Time Complexity => O(N)
// Space Complexity => O(1)

public class Que27 {
    public static void main(String[] args) {

    }

    // Inorder
    public static ArrayList<Integer> morrisInorder(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        TreeNode curr = root;

        while (curr != null) {
            // Inorder=> Left - Root - Right; if left is null, then we'll print root & move
            // to the right.
            if (curr.left == null) {
                list.add(curr.data);
                curr = curr.right;
            } else {
                // Find the rightmost node in the left subtree & connect it to the curr(root of
                // left subtree)
                TreeNode prev = curr.left;
                while (prev.right != null && prev.right != curr)
                    prev = prev.right;

                // Last node is found, connect it with curr(root) & move curr to the left.
                if (prev.right == null) {
                    prev.right = curr;
                    curr = curr.left;
                } else {
                    // Thread was already present connecting last node to the curr(root), left
                    // subtree is already visited, so disconnect that thread and start traversing to
                    // the right subtree.
                    prev.right = null;
                    list.add(curr.data);
                    curr = curr.right;
                }
            }
        }

        return list;
    }

    // Preoder
    public static ArrayList<Integer> morrisPreorder(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        TreeNode curr = root;

        while (curr != null) {
            // Preorder=> Root - Left - Right; if left is null, then we'll print root & move
            // to the right.
            if (curr.left == null) {
                list.add(curr.data);
                curr = curr.right;
            } else {
                // Find the rightmost node in the left subtree & connect it to the curr(root of
                // left subtree)
                TreeNode prev = curr.left;
                while (prev.right != null && prev.right != curr)
                    prev = prev.right;

                // Last node is found, connect it with curr(root), add root in the list & move
                // curr to the left.
                if (prev.right == null) {
                    prev.right = curr;
                    list.add(curr.data);
                    curr = curr.left;
                } else {
                    // Thread was already present connecting last node to the curr(root), left
                    // subtree is already visited, so disconnect that thread and start traversing to
                    // the right subtree.
                    prev.right = null;
                    curr = curr.right;
                }
            }
        }

        return list;
    }

}
