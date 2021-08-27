// Help from Nich White Video
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
	int closest = 0;
	int minDiff = Integer.MAX_VALUE;
	for (int i = 0; i < nums.length-2; i++) {
		int j = i + 1;
		int k = nums.length - 1;
		while (j < k) {
			int sum = nums[i] + nums[j] + nums[k];
			if (sum == target) // agr is line ko na likhe to TC double ho jygi so while coding write each possibility . bcz yha sum target k brabr hne pr hme exact ans mil jyga so phr loop q chalana.
				return sum;
			if (sum < target)
				j++;
			else
				k--;
			int diff = Math.abs(sum - target);
			if (diff < minDiff) {
				minDiff = diff;
				closest = sum;
			}
		}
	}
	return closest;
    }
}
