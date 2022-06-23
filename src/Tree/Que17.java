package Tree;

import java.util.ArrayList;

// Root to Node path => Given a node, find the path from root to that node.
// Time Complexity => O(N)
// Space Complexity => O(Height of Tree)

public class Que17 {
    public static void main(String[] args) {

    }

    public static ArrayList<Integer> returnPath(TreeNode root, int x) {
        ArrayList<Integer> list = new ArrayList<>();
        if (root == null)
            return list;

        getPath(root, list, x);

        return list;
    }

    public static boolean getPath(TreeNode root, ArrayList<Integer> list, int x) {
        if (root == null) {
            return false;
        }

        list.add(root.data);
        if (root.data == x) {
            return true;
        }

        if (getPath(root.left, list, x) || getPath(root.right, list, x)) {
            return true;
        }
        list.remove(list.size() - 1);

        return false;
    }
    
}
