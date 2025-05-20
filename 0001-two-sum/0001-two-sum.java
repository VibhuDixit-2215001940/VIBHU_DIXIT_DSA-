class Solution {
    public int[] twoSum(int[] arr, int target) {
        Map<Integer, Integer> mp = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int x = target-arr[i];
            if(mp.containsKey(x)) return new int[]{mp.get(x),i};
            mp.put(arr[i],i);
        }
        return new int[]{};
    }
}