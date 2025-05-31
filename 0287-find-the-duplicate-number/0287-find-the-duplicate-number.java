class Solution {
    public int findDuplicate(int[] arr) {
        int n = arr.length;
        for(int i=0;i<n;i++){
            int ind = Math.abs(arr[i]);
            if(arr[ind]<0) return ind;
            arr[ind] = -arr[ind];
        }
        return -1;
    }
}