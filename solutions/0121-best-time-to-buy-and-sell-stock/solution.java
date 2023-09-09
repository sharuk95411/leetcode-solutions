class Solution {

   int pick;
   int buy=Integer.MIN_VALUE;
    int profit=-1;
    public int maxProfit(int[] arr) {
         pick=arr[0];
        A(1,arr);
        if(profit<0)return 0;
        return profit;

    }
    public void A(int index,int arr[])
    {
        if(index>=arr.length)return ;
        if(arr[index]>pick)
        {
            profit=Math.max(profit,arr[index]-pick);
        }
        if(pick>arr[index]) pick=arr[index];
        A(index+1,arr);
    }
}
