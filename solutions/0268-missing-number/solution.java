class Solution {
    public int missingNumber(int[] nums) {
        int n= nums.length;
        int sum=0;
        for(int a:nums)
        {
            sum=sum+a;
        }
        int sum1=0;
        sum1=(n*(n+1))/2;
        return sum1-sum;
    }
}
