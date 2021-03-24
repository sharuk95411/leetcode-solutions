class Solution {
    public int maxProfit(int[] prices) {
                int minpirce = prices[0];
              int maxpro = 0;
         for(int i=1;i<prices.length;i++)
        {
            if(minpirce>prices[i])
                minpirce = prices[i];
            else
            {
                maxpro = Math.max(maxpro, prices[i]-minpirce);
            }       
        }
        return maxpro;
        
    }
}
