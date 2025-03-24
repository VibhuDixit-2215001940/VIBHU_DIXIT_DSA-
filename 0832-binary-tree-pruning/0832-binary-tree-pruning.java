class Solution {
    public boolean checkOne(TreeNode root) {
        if (root == null) return false;
        if (root.val == 1) return true;
        return checkOne(root.left) || checkOne(root.right);
    }
    public TreeNode pruneTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        // Recursively prune left and right subtrees
        pruneTree(root.left);
        pruneTree(root.right);

        // If left subtree does not contain 1, prune it
        if (!checkOne(root.left)) {
            root.left = null;
        }

        // If right subtree does not contain 1, prune it
        if (!checkOne(root.right)) {
            root.right = null;
        }

        // If current node is 0 and both subtrees are null, prune the node
        if (root.val == 0 && root.left == null && root.right == null) {
            return null;
        }

        return root;
    }
}