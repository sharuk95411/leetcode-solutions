class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int arr[]= new int[2];
        
        int a=0;
        int b=0;
        for(int i=0;i<=nums.length-2;i++)
        { 
            a=nums[i];
            for(int j=i+1;j<=nums.length-1;j++)
            {
                b=nums[j];
                if(a+b==target)
                {
                    arr[0]=i;
                    arr[1]=j;
                    return arr;
                }
            }
        }
        return arr;
    }
}
