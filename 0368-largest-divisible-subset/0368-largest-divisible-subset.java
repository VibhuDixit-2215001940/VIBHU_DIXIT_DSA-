class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        int n = nums.length, max = 0;
        Arrays.sort(nums);
        int[] dp = new int[n], prev = new int[n];
        Arrays.fill(dp, 1); Arrays.fill(prev, -1);

        for (int i = 0; i < n; i++)
            for (int j = 0; j < i; j++)
                if (nums[i] % nums[j] == 0 && dp[j] + 1 > dp[i]) {
                    dp[i] = dp[j] + 1; prev[i] = j;
                }
        for (int i = 1; i < n; i++) if (dp[i] > dp[max]) max = i;

        List<Integer> res = new ArrayList<>();
        while (max != -1) { res.add(nums[max]); max = prev[max]; }
        Collections.reverse(res);
        return res;
    }
}
