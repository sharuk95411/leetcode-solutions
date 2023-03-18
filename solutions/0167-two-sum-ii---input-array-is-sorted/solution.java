class Solution {
    public int[] twoSum(int[] arr, int target) {
        int ans[]= new int[2];
       int i=0;
       int j= arr.length-1;
        while(i<j)
        {
            int sum= arr[i]+arr[j];
            if(sum==target)
            {
                ans[0]=i+1;
                ans[1]=j+1;
                return ans;
            }
          else if(sum>target)
            {
                sum=0;
                j--;
            }
            else 
            {
                sum=0;
                i++;
            }
        }
        return ans;
    }
}
