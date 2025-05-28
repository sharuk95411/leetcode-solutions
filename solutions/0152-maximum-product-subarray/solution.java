class Solution {
    public int maxProduct(int[] nums) {
        return helper(nums, 1, nums[0], nums[0], nums[0]);
    }

     private static int helper(int[] nums, int index, int currentMax, int currentMin, int result) {
        if (index == nums.length) {
            return result;
        }

        int num = nums[index];

        int tempMax = Math.max(num, Math.max(currentMax * num, currentMin * num));
        int tempMin = Math.min(num, Math.min(currentMax * num, currentMin * num));
        int tempResult = Math.max(result, tempMax);

        return helper(nums, index + 1, tempMax, tempMin, tempResult);
    }
}
