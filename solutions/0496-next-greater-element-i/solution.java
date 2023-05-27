class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int ans[]= new int[nums1.length];
        HashMap<Integer,Integer>h= new HashMap<>();
        Stack<Integer>stack= new Stack<>();
        stack.push(nums2[0]);
        for(int i=1;i<nums2.length;i++)
        {
                        while(!stack.isEmpty()&& nums2[i]>stack.peek())
                          {
                              h.put(stack.pop(),nums2[i]);
                          }
                          stack.push(nums2[i]);                     
        }

        for(int i=0;i<nums1.length;i++)
        {
            if(h.get(nums1[i])==null) ans[i]= -1;
            else
            {
                ans[i]= h.get(nums1[i]);
            }
        }

        return ans;
    }
}
