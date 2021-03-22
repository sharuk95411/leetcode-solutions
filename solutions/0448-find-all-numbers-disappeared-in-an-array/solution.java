class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
         int len = nums.length;
    List<Integer> res = new ArrayList<>();
    boolean[] present = new boolean[len + 1];
    
    for(int num:nums)
    
    {
        present[num] = true;
    }
    
    for(int i = 1 ; i <= len ; i++){
        if(!present[i])
            res.add(i);
    }
    
    return res;
    }
}
