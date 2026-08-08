class Solution {
    public int findDuplicate(int[] arr) {

     int ans=0;

     int i=0;
     while(i<arr.length)
     {
        int index = Math.abs(arr[i]);
        if(arr[index]<0) return Math.abs(arr[i]);
        else
        {
               arr[index]= -arr[index];
        }
        i++;
     }
     return ans;

    }
}
