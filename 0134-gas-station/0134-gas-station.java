class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length, totalTank = 0, currTank = 0,start=0;
        for(int i=0;i<n;i++){
            int diff = gas[i]-cost[i];
            totalTank += diff; currTank += diff;
            if(currTank < 0){
                start = i+1;
                currTank = 0;
            }
        }
        return (totalTank < 0)? -1:start;
    }
}