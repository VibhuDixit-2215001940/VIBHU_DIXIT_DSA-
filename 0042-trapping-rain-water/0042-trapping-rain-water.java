class Solution {
    public int trap(int[] arr) {
        int n = arr.length,l=0,hi=n-1,lmax=Integer.MIN_VALUE,rmax=Integer.MIN_VALUE,ans=0;
        while(l<hi){
            lmax = Math.max(lmax,arr[l]);
            rmax = Math.max(rmax,arr[hi]);
            ans += (lmax<rmax)?lmax-arr[l++]:rmax-arr[hi--];
        }
        return ans;
    }
}