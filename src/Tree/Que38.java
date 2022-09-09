package Tree;

import java.util.Stack;

// BST Iterator => (next) -> Next value in inorder traversal, (hasNext) -> Return true/false depending on the presence of next member in inorder traversal

// Explanation => 1. By storing Inorder traversal (Brute force approach) 2. Use stack to store the elements. Store all the left elements of the current node. Pop one by one from stack, check if it has right, if YES then add all the left of that right to stack. Continue this process till stack is empty. If stack is empty, then hasNext will return FALSE, else TRUE.

// Time Complexity => O(1) (average)
// Space Complexity => O(H)

public class Que38 {
    private static Stack<TreeNode> stack = new Stack<>();

    public static void main(String[] args) {

    }

    public static void BSTIterator(TreeNode root) {
        pushAll(root);
    }

    public static boolean hasNext() {
        return !stack.isEmpty();
    }

    public static int next() {
        TreeNode temp = stack.pop();
        pushAll(temp.right);
        return temp.data;
    }

    public static void pushAll(TreeNode root) {
        for (; root != null; stack.push(root), root = root.left)
            ;
    }
}
