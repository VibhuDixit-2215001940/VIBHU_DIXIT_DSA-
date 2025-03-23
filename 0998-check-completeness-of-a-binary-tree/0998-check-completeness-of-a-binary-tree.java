class Solution {
    public int countNodes(TreeNode root){
        if(root == null) return 0;
        return 1+countNodes(root.left)+countNodes(root.right);
    }
    public boolean dfs(TreeNode root,int total,int i){
        if(root == null) return true;
        if(i>total) return false;
        return dfs(root.left,total,2*i) && dfs(root.right,total,2*i+1);
    }
    public boolean isCompleteTree(TreeNode root) {
        int totalNodes = countNodes(root);
        return dfs(root,totalNodes,1);
    }
}