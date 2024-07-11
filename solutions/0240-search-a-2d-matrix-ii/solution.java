class Solution {
    public boolean searchMatrix(int[][] arr, int target) {
        
        
        int i = 0;
        int j=arr[0].length-1;
       

        while(i<arr.length && j>=0)
        {
            int data = arr[i][j];
            if(data==target) return true;

            else if(data>target)
            {
                j--;
            }
            else
            i++;
        }
        return false;
    }
}
