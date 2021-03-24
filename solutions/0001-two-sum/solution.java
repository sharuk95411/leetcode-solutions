class Solution {
    public int[] twoSum(int[] nums, int target) {
        int arr1[]= new int [2];
         Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0 ; i < nums.length; i++){
            if(map.containsKey(target - nums[i]))
            {
                arr1[0]=map.get(target - nums[i]);
                arr1[1]= i;
               // System.out.println(Arrays.toString(arr1));
                return arr1;
            }
            map.put(nums[i], i);
        }
       return arr1; 
    }
}
