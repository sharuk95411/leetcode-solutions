class Solution {

    public int maxProfit(int[] arr) {
        int ans=0;
        int buy=arr[0];
        
        for(int current :arr)
        {
            if(buy>current) buy=current;
            else
            {
                 ans=Math.max((current-buy),ans);
            }
        }
        return ans;
    }
}
