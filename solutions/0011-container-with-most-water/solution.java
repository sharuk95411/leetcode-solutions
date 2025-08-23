class Solution {
    public int maxArea(int[] arr) {
        
        int i=0;
        int j= arr.length-1;
        int area=0;
        while(i<j)
        {
            int tempArea= (j-i)*Math.min(arr[i],arr[j]);
            area=Math.max(area,tempArea);
            if(arr[i]>arr[j]) j--;
            else i++;
        }
        return area;
        
    }
}
