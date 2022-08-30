package Tree;

// Construct a BST from preorder traversal

// Method 1 => Check for each node in array, and insert it in correct position by trial & error method. It'll take too much time if BST is skewed.

// Method 2 => Inorder of BST is sorted. So sort the preorder array & we'll get inorder array as well. From these two arrays we can construct the unique BST. But in this case sorting will increase the time complexity.

// Method 3 => Maintain the upper bound and keep checking in left & right direction whether that node can be fitted or not.

// Time Complexity => O(N) (Method 3)
// Space Complexity => O(1) (Method 3)

public class Que36 {
    public static void main(String[] args) {

    }

    public static TreeNode buildBSTFromPreorder(int[] preorder, int[] i, int maxVal) {
        if (preorder.length == i[0] || preorder[i[0]] > maxVal)
            return null;

        TreeNode root = new TreeNode(preorder[i[0]++]);
        // For left subtree upper bound will always change, but for right subtree it
        // will remain same.
        root.left = buildBSTFromPreorder(preorder, i, root.data);
        root.right = buildBSTFromPreorder(preorder, i, maxVal);

        return root;
    }
}
