package Tree;

// Floor in BST => Given a key,find the node with greatest value which is just less than or equal to the key.

// Time Complexity => O(logN)

public class Que31 {
    public static void main(String[] args) {

    }

    public static int findFloor(TreeNode root, int key) {
        if (root == null)
            return -1;

        int floor = -1;

        while (root != null) {
            if (root.data == key) {
                floor = root.data;
                return floor;
            }

            if (key > root.data) {
                floor = root.data;
                root = root.right;
            } else
                root = root.left;
        }

        return floor;
    }
}
