class Solution {
    public int longestConsecutive(int[] arr) {
        
        Arrays.sort(arr);
        int n= arr.length;
        if(n==0) return 0;
        int ans=1;
        int count=1;
        int prev= arr[0]+1;
        
        for(int i=1;i<n;i++)
        {
             if(arr[i]==arr[i-1]+1)
             {
                 count++;
                 
             }
            else if(arr[i]==arr[i-1])
            {
                System.out.println("Else if");
                 continue;
            }
            
            else
            {
                ans= Math.max(count,ans);
                System.out.println("OK");
                count=1;
            }
            
        }
        return Math.max(ans,count);
    }
}
