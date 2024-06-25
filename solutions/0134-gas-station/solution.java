class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        
        int i,j,ans=0;
        int n= gas.length;
        for(i=0;i<n;i++)
        {
            if(gas[i]>=cost[i])
            {
               
                int count=0;
                int totalGas=0;
                ans=i;
                for(j=i;j<n;j=(j+1)%n)
                {
                    totalGas=totalGas+gas[j]-cost[j];
                     if(totalGas<0) break;
                    else
                    {
                        count++;
                        if(count==n)return ans;
                    }
                }
                if(j<i)return -1;
                else i=j;
            }
            
             
        }
        return -1;
    }
}
