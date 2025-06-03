class Solution {
    public int[] productExceptSelf(int[] arr) {
        int n = arr.length;
        int[] l = new int[n];
        l[0] = 1;
        for(int i=1;i<n;i++) l[i] = l[i-1]*arr[i-1];
        int[] r = new int[n];
        r[n-1] = 1;
        for(int i=n-2;i>=0;i--) r[i] = r[i+1]*arr[i+1];
        int ans = 1;
        for(int i=0;i<n;i++) arr[i]=l[i]*r[i];
        return arr;
    }
}