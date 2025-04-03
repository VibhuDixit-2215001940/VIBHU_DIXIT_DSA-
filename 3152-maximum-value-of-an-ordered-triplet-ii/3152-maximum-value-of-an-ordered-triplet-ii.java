class Solution {
    public long maximumTripletValue(int[] arr) {
        int n = arr.length;
        long maxVal = 0;
        int maxLeft = arr[0]; 
        int maxDiff = Integer.MIN_VALUE; 
        for (int j = 1; j < n - 1; j++) {
            maxDiff = Math.max(maxDiff, maxLeft - arr[j]); 
            maxLeft = Math.max(maxLeft, arr[j]); 
            maxVal = Math.max(maxVal, (long) maxDiff * arr[j + 1]); 
        }
        return maxVal;
    }
}
