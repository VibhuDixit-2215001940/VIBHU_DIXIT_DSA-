class Solution {
    public int[] productExceptSelf(int[] arr) {
        int n = arr.length;int[] brr = new int[n];int x=1,count=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0) count++;
            else x*=arr[i];
        }
        if(count>1) return brr;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                if(count>0) brr[i] = 0;
                else brr[i] = x/arr[i];
            }
            else brr[i] = x;
        }
        return brr;
    }
}