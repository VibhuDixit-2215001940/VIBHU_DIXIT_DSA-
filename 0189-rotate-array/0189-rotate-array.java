class Solution {
    public void rotate(int[] arr, int k) {
        int n=arr.length;int[] brr = new int[n];int c=0;k%=n;
        for(int i=n-k;i<n;i++) brr[c++]=arr[i];
        for(int i=0;i<n-k;i++) brr[c++]=arr[i];
        for(int i=0;i<n;i++) arr[i]=brr[i];
    }
}