class Solution {
    public boolean searchMatrix(int[][] arr, int target) {
        
        int x= 0;
        int y= arr[0].length-1;
        while((x>=0 &&x<arr.length ) && (y>=0 && y<arr[0].length))
        {
            if(arr[x][y]==target)return true;
            else
            {
                if(arr[x][y]>target) y--;
                else x++;
            }
                
        }
        return false;
    }
}
