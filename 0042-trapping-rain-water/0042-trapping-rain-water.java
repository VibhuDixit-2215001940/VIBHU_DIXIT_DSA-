class Solution {
    public int trap(int[] arr) {
        int n = arr.length;
        int[] l = new int[n];l[0]=arr[0];
        for(int i=1;i<n;i++) l[i]= Math.max(l[i-1],arr[i]);
        int r = arr[n-1];int ans = 0;
        for(int i=n-1;i>=0;i--){
            r = Math.max(r,arr[i]);
            ans += Math.min(l[i],r)-arr[i];
        }
        return ans;
    }
}