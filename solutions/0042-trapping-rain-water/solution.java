class Solution {
    public int trap(int[] arr) {

      int ans=0;
      for(int i=1;i<arr.length-1;i++)
      {
          int m1= Integer.MIN_VALUE;
          int left=i-1;
          while(left>=0)
          {
              m1=Math.max(m1,arr[left]);
              left--;
          }
          int m2= Integer.MIN_VALUE;
          int right=i+1;
          while(right<arr.length)
          {
              m2= Math.max(m2,arr[right]);
              right++;
          }
         int get= Math.min(m1,m2)-arr[i];
         if(get>0) ans= ans+get;
      }  

      return ans;
    }
}
