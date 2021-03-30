class Solution {
    public void sortColors(int[] nums) {
            int tempNum[] = new int[3];
        for(int n: nums) {
            tempNum[n]=tempNum[n]+1;
        }
        int i = 0;
        while(i<nums.length) {
            for(int j = 0; j<3; j++) {
                while(tempNum[j] > 0) {
                    nums[i++]  = j;
                    tempNum[j]--;  
                }
            }
        }
    }
}
