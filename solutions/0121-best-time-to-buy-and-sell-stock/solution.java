class Solution {
    public int maxProfit(int[] arr) {
        
        int profit=Integer.MIN_VALUE;
        int buy= arr[0];
        boolean check=false;

        for(int i=1;i<arr.length;i++)
        {
            if(buy>arr[i])
            {
                buy=arr[i];
            }
            else
            {
                 profit= Math.max(profit,arr[i]-buy);
                 check=true;
            }
           

        }
        
           if(check) return profit;
           return 0;
    }
}
