package Tree;

import java.util.*;

// Iterative traversals

public class Que3 {
    public static void main(String[] args) {

    }
    
    // Time, Space Complexity => O(n)
    public static void preorder(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        if (root == null) {
            return;
        }

        while (!stack.empty()) {
            TreeNode temp = stack.pop();
            System.out.print(temp.data + " ");

            // Right node is pushed first as Stack follows LIFO
            if (temp.right != null) {
                stack.push(temp.right);
            }

            if (temp.left != null) {
                stack.push(temp.left);
            }
        }
    }

    // Time, Space Complexity => O(n)
    public static void inorder(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode temp = root;

        if (root == null) {
            return;
        }

        while (true) {
            if (temp != null) {
                stack.push(temp);
                temp = temp.left;
            } else {
                if (stack.isEmpty()) {
                    break;
                }
                temp = stack.pop();
                System.out.print(temp.data + " ");
                temp = temp.right;
            }
        }
    }

    // Time => O(n)
    // Space Complexity => O(2n)
    public static void postorder2(TreeNode root) {
        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();

        if (root == null) {
            return;
        }

        stack1.push(root);
        while (!stack1.isEmpty()) {
            TreeNode temp = stack1.pop();
            stack2.push(temp);
            if (temp.left != null) {
                stack1.push(temp.left);
            }
            if (temp.right != null) {
                stack1.push(temp.right);
            }
        }

        while (stack2.empty()) {
            System.out.print(stack2.pop().data + " ");
        }
    }

    // Time, Space Complexity => O(n)
    public static void postorder1(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;

        while (curr != null && !stack.isEmpty()) {
            if (curr != null) {
                stack.push(curr);
                curr = curr.left;
            } else {
                TreeNode temp = stack.peek().right;
                if (temp == null) {
                    temp = stack.pop();
                    System.out.print(temp.data + " ");
                    while (!stack.isEmpty() && stack.peek().right == temp) {
                        temp = stack.pop();
                        System.out.print(temp.data + " ");
                    }
                } else {
                    curr = temp;
                }
            }
        }
    }
}
