class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int gassum = 0;
        int costsum = 0;
        for(int i=0 ; i<gas.length ; i++){
            gassum += gas[i];
            costsum += cost[i];
        }
        if(gassum<costsum){
            return -1;
        }
        int sum = 0;
        int idx = 0;
        for(int i=0 ; i<gas.length ; i++){
            sum += gas[i];
            sum -= cost[i];
            if(sum<0){
                sum = 0;
                idx = i+1;
            }
        }
        return idx;
    }
}