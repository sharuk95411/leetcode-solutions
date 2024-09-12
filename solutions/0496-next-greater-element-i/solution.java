class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        HashMap<Integer,Integer>h= new HashMap<>();
        for(int i=0;i<nums2.length;i++)
        {
            h.put(nums2[i],i);
        }

          for(int i=0;i<nums1.length;i++)
          {
            int index= h.get(nums1[i])+1;
            while(index<nums2.length)
            {
                if(nums2[index]>nums1[i])
                {
                    nums1[i]=nums2[index];
                    break;
                }
                index++;
            }
            if(index>=nums2.length) nums1[i]=-1;

          }
          return nums1;
    }
}
