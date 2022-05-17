package Tree;

import java.util.*;

// All travaersals in one function

class Pair {
    TreeNode node;
    int val;

    Pair(TreeNode node, int val) {
        this.node = node;
        this.val = val;
    }
}

public class Que4 {
    public static void main(String[] args) {

    }
    
    public static void allTraversals(TreeNode root) {
        if (root == null) {
            return;
        }

        Stack<Pair> stack = new Stack<Pair>();
        List<Integer> preorder = new ArrayList<>();
        List<Integer> inorder = new ArrayList<>();
        List<Integer> postorder = new ArrayList<>();

        stack.push(new Pair(root, 1));

        while (!stack.isEmpty()) {
            Pair temp = stack.pop();

            if (temp.val == 1) {
                preorder.add(temp.node.data);
                temp.val++;
                stack.push(temp);

                if (temp.node.left != null) {
                    stack.push(new Pair(temp.node.left, 1));
                }
            } else if (temp.val == 2) {
                inorder.add(temp.node.data);
                temp.val++;
                stack.push(temp);

                if (temp.node.right != null) {
                    stack.push(new Pair(temp.node.right, 1));
                }
            } else {
                postorder.add(temp.node.data);
            }
        }
    }
}
