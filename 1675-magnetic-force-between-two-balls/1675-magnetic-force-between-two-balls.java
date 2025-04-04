class Solution {
    public static boolean isPossible(int[] arr,int k,int mid){
        int cow=1,pos = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]-pos >= mid){
                cow++;
                pos = arr[i];
            }
            if(cow == k) return true;
        }
        return false;
    }
    public int maxDistance(int[] arr, int k) {
        Arrays.sort(arr);int n = arr.length;
        int l=0,h=arr[n-1]-arr[0];
        int ans = 0;
        while(l<=h){
            int mid = l+(h-l)/2;
            if(isPossible(arr,k,mid)){
                ans = mid;
                l = mid+1;
            }
            else h = mid-1;
        }
        return ans;
    }
}