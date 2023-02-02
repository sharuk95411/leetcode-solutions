class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        
        int rem=0;
        int store=0;
        int ans=0;

        for(int i=0;i<gas.length;i++)
        {
             rem= rem+gas[i]-cost[i];
             if(rem<0)
             {
                 store= store+rem;
                 rem=0;
                 ans=i+1;
             }
        }
        System.out.println("rem "+rem);
         System.out.println("store "+store);
        if(rem>=Math.abs(store)) return ans;
        else return -1;
    }
}
