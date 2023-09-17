class Solution {
    public int findTargetSumWays(int[] arr, int target) {
        
        return A(0,arr,target,0);
    }
    
    public int A(int i,int arr[],int target,int sum)
    {
        if(i>=arr.length)
        {
            if(sum==target) return 1;
            else return 0;
        }
        
        int take_plus= A(i+1,arr,target,sum+arr[i]);
        int take_minus= A(i+1,arr,target,sum-arr[i]);
        
        return take_plus+take_minus;
    }
}
