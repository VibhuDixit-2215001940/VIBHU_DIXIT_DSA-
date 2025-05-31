class Solution {
    public int findDuplicate(int[] arr) {
        Set<Integer> st = new HashSet();
        for(int i=0;i<arr.length;i++){
            if(st.contains(arr[i])) return arr[i];
            st.add(arr[i]);
        }
        return -1;
    }
}