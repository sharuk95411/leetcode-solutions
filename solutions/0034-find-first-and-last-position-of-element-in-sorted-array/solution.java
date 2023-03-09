class Solution {
    public int[] searchRange(int[] nums, int target) {
        int ans[]= new int[2];
         ans[0]= leftPosition(nums,target);
         ans[1]= rightPosition(nums,target);
        return ans;
    }
    public int leftPosition(int arr[],int target)
    {
        int left=0;
        int right=arr.length-1;
        int ans=-1;
        while(left<=right)
        {
            int mid= (left+right)/2;
            if(target==arr[mid])
        {
             ans=mid;
             right=mid-1;
        }
        else if(target>arr[mid])
        {
            left=mid+1;
        }
        else
        {
            right= mid-1;
        }
        }
        return ans;
    }
    public int rightPosition(int arr[],int target)
    {
        int left=0;
        int right=arr.length-1;
        int ans=-1;
        while(left<=right)
        {
            int mid= (left+right)/2;
            if(target==arr[mid])
        {
             ans=mid;
             left=mid+1;
        }
        else if(target>arr[mid])
        {
            left=mid+1;
        }
        else
        {
            right= mid-1;
        }
        }
        return ans;
    }
}
