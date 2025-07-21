public class Solution {
    public boolean isValidBST(TreeNode root) {
        return ok(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    public boolean ok(TreeNode a, long minVal, long maxVal) {
        if (a == null) return true;
        if (a.val >= maxVal || a.val <= minVal) return false;
        return ok(a.left, minVal, a.val) && ok(a.right, a.val, maxVal);
    }
}