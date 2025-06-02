class Solution {
    public void rotate(int[] arr, int k) {
        int n = arr.length,j=0;k %=n;
        int[] brr = new int[n];
        for(int i=n-k;i<n;i++) brr[j++] = arr[i];
        for(int i=0;i<n-k;i++) brr[j++] = arr[i];
        System.arraycopy(brr,0,arr,0,n);
    }
}
