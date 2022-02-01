class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        // if(m==0)
        // {
        // for(int i=0;i<n;i++)
        // {
        //     nums1[i]= nums2[i];
        // }
        //     return ;
        // }
        // if(n==0) return;
        int j=m-1;
        int i=n-1;
        
        int length= m+n-1;
        while(i>=0 && j>=0)
        {
            if(nums2[i]>=nums1[j])
            {
                nums1[length]= nums2[i];
                length--;
                i--;
            }
            else
            {
                nums1[length]=nums1[j];
                    length--;
                j--;
            
            }
        }
        while(i>=0)
        {
            nums1[length]= nums2[i];
            i--;
            length--;
        }
        
    }
}
