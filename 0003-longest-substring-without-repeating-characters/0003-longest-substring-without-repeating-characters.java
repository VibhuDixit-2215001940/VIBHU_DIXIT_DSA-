class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length(),maxLength = 0,left = 0;int[] charIndex = new int[128];
        Arrays.fill(charIndex, -1);
        for (int right = 0; right < n; right++) {
            if (charIndex[s.charAt(right)] >= left) left = charIndex[s.charAt(right)] + 1;
            charIndex[s.charAt(right)] = right;
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}
