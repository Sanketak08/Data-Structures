package Tree;

import java.util.Stack;

// Two Sum IV => Find couple of integers who sum up to the given value.

// Explanation => 1. Store the inorder traversal of BST. And use two pointers one from start of the array & another from last. If sum of two elemnts is greater than given sum, decrease the right pointer & if it is smaller then increas the left pointer. TC => O(N), SC => O(N) (ACCEPTED).     2. Using BST Iterator, maintain 'next' as well as 'before' iterators. 'next' will give numbers in asceding order & 'before' will give in descending order. And then use above mentioned logic.

// Time Complexity => O(N)
// Space Complexity => 2*O(H) (next & before)

public class Que39 {
    public static void main(String[] args) {

    }

    public boolean findTarget(TreeNode root, int k) {
        if (root == null)
            return false;

        BSTIterator l = new BSTIterator(root, false);
        BSTIterator r = new BSTIterator(root, true);

        int i = l.next();
        int j = r.next();

        while (i < j) {
            if ((i + j) == k)
                return true;
            else if ((i + j) < k)
                i = l.next();
            else
                j = r.next();
        }
        return false;
    }
}

class BSTIterator {
    private Stack<TreeNode> stack = new Stack<>();
    boolean reverse = true;

    public BSTIterator(TreeNode root, boolean isReverse) {
        reverse = isReverse;
        pushAll(root);
    }

    public boolean hasNext() {
        return !stack.isEmpty();
    }

    public int next() {
        TreeNode temp = stack.pop();
        if (reverse)
            pushAll(temp.right);
        else
            pushAll(temp.left);
        return temp.data;
    }

    public void pushAll(TreeNode root) {
        while (root != null) {
            stack.push(root);
            if (reverse)
                root = root.right;
            else
                root = root.left;
        }
    }
}
