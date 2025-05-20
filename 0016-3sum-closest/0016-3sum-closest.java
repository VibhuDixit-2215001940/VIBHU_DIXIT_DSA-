class Solution {
    public int threeSumClosest(int[] arr, int target) {
        int closestSum = arr[0] + arr[1] + arr[2];
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            int j=i+1,k=arr.length-1;
            while(j<k){
                int sum = arr[i]+arr[j]+arr[k];
                if(Math.abs(target - sum) < Math.abs(target - closestSum)) closestSum = sum;
                if (sum < target) j++;
                else k--;
            }
        }
        return closestSum;
    }
}