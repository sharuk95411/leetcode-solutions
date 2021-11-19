class Solution {
    public boolean increasingTriplet(int[] nums) {
     
        int left= Integer.MAX_VALUE;
        int mid= Integer.MAX_VALUE;
        
        for(int a : nums)
        {
            if(a>mid) return true;
             else if(left>a) left=a;
        else if(a>left && a<=mid ) mid=a;
        }
       
        return false;
    }
}
