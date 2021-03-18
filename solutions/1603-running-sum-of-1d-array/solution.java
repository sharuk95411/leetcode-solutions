class Solution {
    public int[] runningSum(int[] nums) {
        int arr[]= new int [nums.length];
    int temp= 0;
        for(int i=0;i<nums.length;i++)
        {
            temp= temp+nums[i];
            arr[i]= temp;
        }
        return arr;
    }
}
