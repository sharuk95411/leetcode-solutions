class Solution {
    public int maxArea(int[] arr) {
        
        int i=0;
        int j= arr.length-1;
        int ans= 0;
        
        while(i<j)
        {
            int area= Math.min(arr[i],arr[j])*(j-i);
            ans= Math.max(area,ans);
            if(arr[i]>arr[j]) j--;
            else if(arr[i]==arr[j])
            {
                i++;
                j--;
            }
            else
                i++;
        }
        return ans;
    }
}
