class Solution {
    public long maximumTripletValue(int[] arr) {
        int n = arr.length;
        long maxVal = 0;
        int maxLeft = arr[0]; // Maximum value on the left
        int maxDiff = Integer.MIN_VALUE; // Maximum (arr[i] - arr[j]) with i < j
        for (int j = 1; j < n - 1; j++) {
            maxDiff = Math.max(maxDiff, maxLeft - arr[j]); // Update max diff up to index j
            maxLeft = Math.max(maxLeft, arr[j]); // Update max left for next iteration
            maxVal = Math.max(maxVal, (long) maxDiff * arr[j + 1]); // Calculate triplet value
        }
        return maxVal;
    }
}
