class Solution {
    public boolean searchMatrix(int[][] arr, int target) {
        
        int row =0;
        int col= arr[0].length-1;

        while(row>=0 && col>=0 && row<arr.length && col<arr[0].length)
        {
            int element = arr[row][col];
            if(element==target) return true;
            else if (element>target) col--;
            else row++;
        }
        return false;
    }
}
