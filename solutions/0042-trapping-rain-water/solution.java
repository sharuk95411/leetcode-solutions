class Solution {
    public int trap(int[] arr) {
        int ans=0;
        int leftMax[]=new int[arr.length];
        int rightMax[]= new int[arr.length];
        int i=1;
        int max= arr[0];
        while(i<leftMax.length)
        {
            
          if(arr[i]>=max)
          {
               max=arr[i];
          }
          else
          {
            leftMax[i]=max;

          }
          i++;

        }
        max=arr[arr.length-1];
        i=arr.length-2;
        while(i>=0)
        {
             if(arr[i]>=max)
          {
               max=arr[i];
          }
          else
          {
            rightMax[i]=max;

          }
          i--;
        }

        for(i=1;i<=arr.length-2;i++)
        {
            int min =Math.min(leftMax[i],rightMax[i]);
            if(min!=0)
            {
                ans = ans+ Math.abs(arr[i]-min);
            }
        }
        return ans;
    }
}
