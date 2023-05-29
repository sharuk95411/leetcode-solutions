class Solution {
    public int trap(int[] arr) {
        int n= arr.length;
        if(n<3) return 0;
        int ans=0;
        int leftMax[]= new int[n];
        int rightMax[]= new int[n];
          int maxL=arr[0];
          int maxR= arr[n-1];
    //    rightMax[]= arr[n-1];
        for(int i=1;i<n;i++)
        {
            leftMax[i]=maxL;
            maxL= Math.max(maxL,arr[i]);
            rightMax[n-i-1]= maxR;
            maxR= Math.max(maxR,arr[n-i-1]);
        }

        for(int i=0;i<n;i++)
        {
             int temp= Math.min(leftMax[i],rightMax[i])-arr[i];
             if(temp>0)
             {
                  ans=ans+temp;
             }
        }
        return ans;
        
    }
}
