class Solution {
    public void sortColors(int[] arr) {
        int st=0,mid=0,hi=arr.length-1;
        while(mid<=hi){
            if(arr[mid]==0){
                int temp = arr[mid];
                arr[mid] = arr[st];
                arr[st] = temp;
                st++;mid++;
            }
            else if(arr[mid]==1) mid++;
            else{
                int temp = arr[mid];
                arr[mid] = arr[hi];
                arr[hi] = temp;
                hi--;
            }
        }
    }
}