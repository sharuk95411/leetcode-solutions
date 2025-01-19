class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        HashMap<String, Integer> memo = new HashMap<>();
        return solve(nums, target, 0, 0, memo);
    }

    private int solve(int[] nums, int target, int i, int sum, HashMap<String, Integer> memo) {
        if (i == nums.length) {
            return sum == target ? 1 : 0;
        }

        // Create a unique key for the current state
        String key = i + "," + sum;  // you can put comma or anyother character

        if (memo.containsKey(key)) {
            return memo.get(key);
        }
        int plus = solve(nums, target, i + 1, sum + nums[i], memo);
        int minus = solve(nums, target, i + 1, sum - nums[i], memo);

        memo.put(key, plus + minus);

        return memo.get(key);
    }
}


