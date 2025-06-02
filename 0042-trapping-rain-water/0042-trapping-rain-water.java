class Solution {
    public int[] leftMax(int[] arr,int n){
        int[] l = new int[n];
        l[0] = arr[0];
        for(int i=1;i<n;i++) l[i] = Math.max(l[i-1],arr[i]);
        return l;
    }
    public int[] rightMax(int[] arr,int n){
        int[] r = new int[n];
        r[n-1] = arr[n-1];
        for(int i=n-2;i>=0;i--) r[i] = Math.max(r[i+1],arr[i]);
        return r;
    }
    public int trap(int[] arr) {
        int n = arr.length, ans=0;
        int[] lmax = leftMax(arr,n);
        int[] rmax = rightMax(arr,n);
        for(int i=0;i<n;i++) ans += (lmax[i]<rmax[i])?lmax[i]-arr[i]:rmax[i]-arr[i];
        return ans;
    }
}