class Solution {
    public int majorityElement(int[] arr) {
        
        int ans=arr[0];
        int count=1;
        
        for(int i=1;i<arr.length;i++)
        {
            if(ans==arr[i]) 
            {
                count++;
            }
            else
            {
                count--;
                if(count==0)
                {
                    count++;
                    ans= arr[i];
                }
            }

        }
        return ans;
    }
}
