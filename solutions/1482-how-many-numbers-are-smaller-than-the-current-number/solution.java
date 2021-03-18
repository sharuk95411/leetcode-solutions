class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
         int n = nums.length;
        int[] copy = Arrays.copyOf(nums, n);
        Arrays.sort(copy);

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = n - 1; i >= 0; i--) {
            map.put(copy[i], i);
        }

        for (int i = 0; i < n; i++) {
            nums[i] = map.get(nums[i]);
        }
        return nums;
    }
}
