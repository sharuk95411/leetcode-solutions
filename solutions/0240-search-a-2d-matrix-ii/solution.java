class Solution {
    public boolean searchMatrix(int[][] arr, int target) {
        int row= 0;
        int col= arr[0].length-1;

        while(col>=0 && row<arr.length)
        {
           if(target<arr[row][col])
           {
               col--;
           }
           else if(target>arr[row][col])
           {
               row++;
           }
           else if(arr[row][col]==target)
           return true;
        }
        return false;
    }
}
