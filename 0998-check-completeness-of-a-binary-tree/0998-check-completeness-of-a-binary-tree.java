class Solution {
    public boolean isCompleteTree(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        TreeNode rv = null;
        boolean past = false;
        while(!q.isEmpty()){
            rv = q.poll();
            if(rv == null) past = true;
            else{
                if(past==true) return false;
                q.add(rv.left);
                q.add(rv.right);
            }
        }
        return true;
    }
}