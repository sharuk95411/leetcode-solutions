class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
     
        
        int total_gas= 0;
        int total_cost=0;
        for(int i=0;i<gas.length;i++)
        {
            total_gas= total_gas+gas[i];
            total_cost= total_cost+cost[i];
        }
        if(total_gas-total_cost<0) return -1;
        // Now ab confirm ho gya h Circle to bnega ab each possible index check kr lge.
        
        int start=0;
        int total_fuel=0;
        for(int i=0;i<gas.length;i++)
        {
          total_fuel = total_fuel+gas[i]-cost[i];
            
            if(total_fuel<0)
            {
                start=i+1;
                total_fuel=0;
            }
        }
        
        return start;
    }
}
