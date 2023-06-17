class Solution {
    public int minSubArrayLen(int target, int[] arr) {
        
        int left=0;
        int ans=Integer.MAX_VALUE;;
        int right=0;
        int sum=0;
        boolean check=true;
        for(right=0;right<arr.length;right++)
        {
            sum=sum+arr[right];
            while(sum>=target)
            {
                ans= Math.min(ans,right-left+1);
                sum=sum-arr[left];
                left++;
                check=false;
            }
            if(ans==1)return 1;
        }
        if(check)return 0;
        return Math.min(ans,right-left+1);
    }
}
