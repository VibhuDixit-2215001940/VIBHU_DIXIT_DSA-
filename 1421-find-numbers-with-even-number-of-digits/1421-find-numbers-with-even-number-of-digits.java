class Solution {
    public int findNumbers(int[] arr) {
        int n = arr.length,count=0;
        for(int i=0;i<n;i++){
            int x = String.valueOf(arr[i]).length();
            if(x%2==0) count++;
        }
        return count;
    }
}