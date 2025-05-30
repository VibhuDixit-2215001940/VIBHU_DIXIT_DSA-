class Solution {
    public int majorityElement(int[] arr) {
        int n = arr.length, majority = arr[0], count = 1;
        for(int i=1;i<n;i++){
            int ele = arr[i];
            if(ele == majority) count++;
            else{
                count--;
                if(count == 0){
                    count = 1;
                    majority = ele;
                }
            }
        }
        return majority;
    }
}