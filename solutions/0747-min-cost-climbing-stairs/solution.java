class Solution {
    int ans=Integer.MAX_VALUE;
    int arr[];
    public int minCostClimbingStairs(int[] cost) {
        arr=new int[cost.length+1];
        Arrays.fill(arr,-1);
       
        return Math.min(A(cost,0),A(cost,1));
    }
    public int A(int cost[],int index)
    {
        if(index>=cost.length)
        {
            return 0;
        }
        if(arr[index]!=-1) return arr[index];
         int a= cost[index]+A(cost,index+1);
         int b= cost[index] + A(cost,index+2);
         return arr[index]= Math.min(ans,Math.min(a,b));
    }
}
