class Solution {
    public boolean canPlaceFlowers(int[] arr, int n) {
     
        int count=0;
        for(int i=0;i<arr.length && count<n ;i++)
        {
            if(arr[i]==0)
            {
                int next= i==arr.length-1 ?0 :arr[i+1];
                int prev= i==0 ? 0 :arr[i-1];
                if(prev==0 && next==0)
                {
                    count++;
                    arr[i]=1;
                }
            }
        }
        
        return count==n ? true :false;
    }
}
