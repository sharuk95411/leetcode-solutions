class Solution {
    public int findDuplicate(int[] arr) {
        
        int ans=0;
   for(int i=0;i<arr.length;i++)
   {
       int step= Math.abs(arr[i]);
       if(arr[step]<0) return Math.abs(arr[i]);
       else
       arr[step]=-arr[step];
   }
return 0;
    }
}
