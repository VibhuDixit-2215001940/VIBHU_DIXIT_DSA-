class Solution {
    public int[] twoSum(int[] arr, int target) {
        int l = 0, r = arr.length-1;
        while(l<r){
            int total = arr[r]+arr[l];
            if(total==target) return new int[]{l+1,r+1};
            else if(total>target) r--;
            else l++;
        }
        return new int[]{-1,-1};
    }
}