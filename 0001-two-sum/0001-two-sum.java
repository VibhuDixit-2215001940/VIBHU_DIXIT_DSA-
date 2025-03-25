class Solution {
    public int[] twoSum(int[] arr, int target) {
        Map<Integer, Integer> mp = new HashMap<>();
        int n = arr.length;
        for(int i=0;i<n;i++){
            int complement = target-arr[i];
            if(mp.containsKey(complement)) return new int[]{mp.get(complement),i};
            mp.put(arr[i],i);
        }
        return new int[]{};
    }
}