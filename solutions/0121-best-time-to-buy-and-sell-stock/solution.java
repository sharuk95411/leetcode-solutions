class Solution {
    public int maxProfit(int[] arr) {
        
        int maxProfit=0;
        int sell= arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]<sell)
            {
                sell= arr[i];
            }
            else
                maxProfit= Math.max(maxProfit,arr[i]-sell);
        }
        return maxProfit;
    }
}
