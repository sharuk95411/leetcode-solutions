class Solution {
    public int majorityElement(int[] arr) {
        
        int ans=arr[0];
        int count=1;
        
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]==ans)count++;
            else
            {
                count--;
                if(count==0)
                {
                    ans=arr[i];
                    count++;
                }
            }
        }
        return ans;
    }
}
