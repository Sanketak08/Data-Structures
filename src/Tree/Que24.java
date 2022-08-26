package Tree;

import java.util.*;

// Construct Binary Tree from inorder & preorder traversal

// Explaination => Hash all the elements in inorder array. Take 1st element from preorder as root and find that elemnt in inorder. Consider all the elements to the left of that 'root' elemnt as left subtree & right as right subtree. Continue this process recursively. Maintain the 'start' & 'end' pointers for boh arrays.

// Time, Space Complexity => O(N)

public class Que24 {
    public static void main(String[] args) {

    }

    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }

        TreeNode root = buildTree(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1, map);

        return root;
    }

    public static TreeNode buildTree(int[] preorder, int preStart, int preEnd, int[] inorder, int inStart, int inEnd,
            HashMap<Integer, Integer> map) {
        if (preStart > preEnd || inStart > inEnd)
            return null;

        TreeNode root = new TreeNode(preorder[preStart]);

        int inRoot = map.get(root.data);
        int numsLeft = inRoot - inStart;

        // Left subtree
        root.left = buildTree(preorder, preStart + 1, preEnd + numsLeft, inorder, inStart, inRoot - 1, map);

        // Right subtree
        root.right = buildTree(preorder, preStart + numsLeft + 1, preEnd, inorder, inRoot + 1, inEnd, map);

        return root;
    }
}
