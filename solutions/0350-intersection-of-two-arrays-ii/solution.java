class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
     
        List<Integer>list= new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        int m= nums1.length;
        int n= nums2.length;
        int j=0,i=0;
        while(i<m && j<n)
        {
            if(nums1[i]==nums2[j]) 
            {
                list.add(nums1[i]);
                i++;
                j++;
            }
            else if( nums1[i]>nums2[j]) j++;
            else i++;
        }
        
        int arr[]= new int[list.size()];
        for(i=0;i<arr.length;i++)
        {
            arr[i]= list.get(i);
        }
       // System.out.println(list);
        return arr;
    }
}
