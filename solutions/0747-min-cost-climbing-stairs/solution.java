class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int arr[]= new int[cost.length+1];
        Arrays.fill(arr,-1);
        return Math.min(rec(cost, 0,arr), rec(cost, 1,arr));
    }
    
    int rec(int[] cost, int index,int arr[]) {
       if(index >= cost.length)
           return 0;
        if(arr[index]!=-1)return arr[index];
        arr[index]=Math.min(cost[index]+rec(cost, index + 1,arr), (cost[index]+rec(cost, index + 2,arr)));
return arr[index];
    }
}
