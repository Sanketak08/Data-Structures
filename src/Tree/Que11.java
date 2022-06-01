package Tree;

import java.util.*;

// Boundary Traversal of Binary tree => anticlockwise and clockwise

public class Que11 {
    public static void main(String[] args) {

    }

    public static boolean isLeaf(TreeNode root) {
        if (root.left == null && root.right == null)
            return true;
        return false;
    }
    
    public static List<Integer> boundaryTraversalAC(TreeNode root) {
        List<Integer> list = new ArrayList<>();

        if (!isLeaf(root))
            list.add(root.data);

        addLeftBoundary(root, list);
        addLeaves(root, list);
        addRightBoundary(root, list);

        return list;
    }
    
    public static void addLeftBoundary(TreeNode root, List<Integer> res) {
        TreeNode temp = root.left;
        while (temp != null) {
            if (!isLeaf(temp))
                res.add(temp.data);
            
            if (temp.left != null)
                temp = temp.left;
            else
                temp = temp.right;
        }
    }
    
    public static void addRightBoundary(TreeNode root, List<Integer> res) {
        TreeNode temp = root.right;
        Stack<Integer> stack = new Stack<>();
        while (temp != null) {
            if (!isLeaf(temp))
                stack.push(temp.data);

            if (temp.right != null)
                temp = temp.right;
            else
                temp = temp.left;
        }
        
        while (!stack.isEmpty()) {
            res.add(stack.pop());
        }
    }
    
    public static void addLeaves(TreeNode root, List<Integer> res) {
        if (isLeaf(root)) {
            res.add(root.data);
            return;
        }

        if (root.left != null)
            addLeaves(root.left, res);

        if (root.right != null)
            addLeaves(root.right, res); 
    }

}
