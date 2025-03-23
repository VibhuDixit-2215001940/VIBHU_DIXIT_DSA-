class Solution {
    private int preorderIndex = 0;
    private Map<Integer, Integer> inorderMap;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        inorderMap = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) inorderMap.put(inorder[i], i);
        return build(preorder, 0, inorder.length - 1);
    }
    private TreeNode build(int[] preorder, int start, int end) {
        if (start > end) return null;
        int rootVal = preorder[preorderIndex++];
        TreeNode root = new TreeNode(rootVal);
        int inorderIndex = inorderMap.get(rootVal);
        root.left = build(preorder, start, inorderIndex - 1);
        root.right = build(preorder, inorderIndex + 1, end);
        return root;
    }
}