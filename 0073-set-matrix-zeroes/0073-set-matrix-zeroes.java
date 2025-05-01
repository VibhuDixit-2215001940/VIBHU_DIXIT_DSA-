class Solution {
    public void setZeroes(int[][] arr) {
        int n = arr.length, m = arr[0].length;
        boolean f1=false,f2=false;
        for(int i=0;i<n;i++) if(arr[i][0]==0) f1=true;
        for(int i=0;i<m;i++) if(arr[0][i]==0) f2=true;
        for(int i=1;i<n;i++) for(int j=1;j<m;j++) if(arr[i][j]==0) arr[i][0] = arr[0][j] = 0;
        for(int i=1;i<n;i++) for(int j=1;j<m;j++) if(arr[i][0]==0||arr[0][j]==0) arr[i][j]=0;
        if(f1) for(int i=0;i<n;i++) arr[i][0] = 0;
        if(f2) for(int i=0;i<m;i++) arr[0][i] = 0;
    }
}