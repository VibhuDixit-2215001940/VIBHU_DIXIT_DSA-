class Solution {
    public int kadanesMin(int[] arr,int n){
        int sum=arr[0],m=arr[0];
        for(int i=1;i<n;i++){
            sum = Math.min(sum+arr[i],arr[i]);
            m = Math.min(m,sum);
        }
        return m;
    }
    public int kadanesMax(int[] arr,int n){
        int sum=arr[0],m=arr[0];
        for(int i=1;i<n;i++){
            sum = Math.max(sum+arr[i],arr[i]);
            m = Math.max(m,sum);
        }
        return m;
    }
    public int maxSubarraySumCircular(int[] arr) {
        int n = arr.length;
        int total = Arrays.stream(arr).sum();
        int minn = kadanesMin(arr,n);
        int maxx = kadanesMax(arr,n);
        int circ = total-minn;
        if(maxx>0) return Math.max(maxx,circ);
        return maxx;
    }
}