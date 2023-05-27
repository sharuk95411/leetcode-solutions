class Solution {
    public int buyChoco(int[] prices, int money) {
        
        int ans= money;
        Arrays.sort(prices);
        for(int i=0;i<2;i++)
        {
            money= money-prices[i];
            
        }
        if(money<0) return ans;
        else return money;
    }
}
