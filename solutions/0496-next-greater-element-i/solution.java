class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        int ans[]= new int[nums1.length];
        HashMap<Integer,Integer>h = new HashMap<>();
         Stack<Integer>stack= new Stack<>();
        for(int i=0;i<nums2.length;i++)
        {
            h.put(nums2[i],i);
        }
       
        int n= nums2.length;
        stack.push(nums2[n-1]);
        nums2[n-1]=-1;
        int i=n-2;
        while(i>=0)
        {
            int temp= nums2[i];
            while(stack.size()>0 && nums2[i]>stack.peek())
            {
                stack.pop();
            }
            if(stack.isEmpty()) nums2[i]=-1;
            else nums2[i]=stack.peek();
            stack.push(temp);
            i--;
        }
        System.out.println("NEW ARRAY IS "+Arrays.toString(nums2));
        for(i=0;i<ans.length;i++)
        {
            ans[i]=nums2[h.get(nums1[i])];
        }
        return ans;
    }
}
