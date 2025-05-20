class Solution {
    public boolean isThree(int n) {
        int count = 2;int temp=n;
        for(int i=2;i<n;i++){
            if(temp%i==0) count++;
            if(count>3) return false;
        }
        return (count==3)?true:false;
    }
}