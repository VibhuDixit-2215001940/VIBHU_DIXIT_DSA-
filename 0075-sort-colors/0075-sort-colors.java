class Solution {
    public void sortColors(int[] arr) {
        int n = arr.length,one=0,zero=0;
        for(int i=0;i<n;i++){
            if(arr[i]==1) one++;
            else if(arr[i]==0) zero++;
        }
        for(int i=0;i<n;i++){
            if(zero>0){
                arr[i]=0;
                zero--;
            }
            else if(one>0){
                arr[i]=1;
                one--;
            }
            else arr[i]=2;
        }
    }
}