class Solution {
    public int[] productExceptSelf(int[] nums) {
        int arr[]= new int[nums.length];
        
        int count=0; 
        int a=1;
        int index_of_zero=-1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0) 
            {count++;
             index_of_zero=i;
            }
            else
            {
                a= nums[i]*a;
            }
            
        }
        if(count>1)
        {
            Arrays.fill(arr, 0);
            return arr;
        }
        else if(count==1)
        {
            Arrays.fill(arr,0);
            arr[index_of_zero]=a;
            return arr;
        }
        else
        {
            for(int i=0;i<nums.length;i++)
            {
                arr[i]= a/nums[i];
            }
            return  arr;
        }
    }
}
