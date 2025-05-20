class Solution {
    public int[] twoSum(int[] arr, int target) {
        Map<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(mp.containsKey(target-arr[i])) return new int[]{mp.get(target-arr[i]),i};
            mp.put(arr[i],i);
        }
        return new int[]{};
    }
}