class Solution {
    public int maxDistToClosest(int[] arr) {
        
        int left=-1;
        int ans=0;
        
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==0) continue;
            
            if(left==-1)
            {
                ans= Math.max(ans,i);// Ye Case tb h jb left k satrting me 0 ho 
            }
            else
            {
                ans= Math.max(ans,(i-left)/2);
            }
            left=i;
            
           
            
        }
         if(arr[arr.length-1]==0)
            {
                ans= Math.max(ans,(arr.length-1-left));
            }
        return ans;
    }
}
