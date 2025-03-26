class Solution {
    public double findMedianSortedArrays(int[] arr, int[] brr) {
        int n = arr.length,m = brr.length;
        ArrayList<Integer> ll = new ArrayList<>();
        for(int i=0;i<n;i++) ll.add(arr[i]);
        for(int i=0;i<m;i++) ll.add(brr[i]);
        Collections.sort(ll);
        if(ll.size()%2 != 0) return (double)ll.get(ll.size()/2);
        else{
            double temp = ll.get(ll.size()/2) + ll.get((ll.size()/2)-1);
            return temp/2;
        }
    }
}