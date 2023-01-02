class Solution {
    public int maxArea(int[] arr) {
        
        int area=0;
        int left=0;
        int right= arr.length-1;
        while(left<right)
        {
            int tempArea= (right-left)*Math.min(arr[left],arr[right]);
            area= Math.max(area,tempArea);
            if(arr[left]>arr[right])
            {
                right--;
            }
            else
            {
                left++;
            }
        }
        return area;
    }
}
