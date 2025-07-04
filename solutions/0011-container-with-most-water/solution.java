class Solution {
    public int maxArea(int[] arr) {
        int ans=0;

        int i=0;
        int j= arr.length-1;

        while(i<j)
        {
            int tempArea= Math.min(arr[i],arr[j])*(j-i);
            ans=Math.max(ans,tempArea);
            if(arr[i]>arr[j]) j--;
            else i++;
        }
        return ans;
    }
}
