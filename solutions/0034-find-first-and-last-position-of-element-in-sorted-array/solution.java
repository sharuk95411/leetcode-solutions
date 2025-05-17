class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = findFirst(nums, 0, nums.length - 1, target);
        int last = findLast(nums, 0, nums.length - 1, target);
        return new int[] { first, last };
    }

    private int findFirst(int[] nums, int left, int right, int target) {
        if (left > right) return -1;

        int mid = left + (right - left) / 2;

        if (nums[mid] == target) {
            int earlier = findFirst(nums, left, mid - 1, target);
            if (earlier != -1) {
                return earlier;
            } else {
                return mid;
            }
        } else if (nums[mid] < target) {
            return findFirst(nums, mid + 1, right, target);
        } else {
            return findFirst(nums, left, mid - 1, target);
        }
    }

    private int findLast(int[] nums, int left, int right, int target) {
        if (left > right) return -1;

        int mid = left + (right - left) / 2;

        if (nums[mid] == target) {
            int later = findLast(nums, mid + 1, right, target);
            if (later != -1) {
                return later;
            } else {
                return mid;
            }
        } else if (nums[mid] < target) {
            return findLast(nums, mid + 1, right, target);
        } else {
            return findLast(nums, left, mid - 1, target);
        }
    }
}

