class Solution {
    public boolean searchMatrix(int[][] arr, int target) {
       
      
       int row = arr[0].length;
       int col= arr.length;
        int left=0;
        int right= row*col-1;

        while(left<=right)
        {
            int mid =left+(right-left)/2;

            int i= mid/row;
            int j = mid%row;
            if(arr[i][j]==target) return true;
            else if(target>arr[i][j]) left=mid+1;
            else right=mid-1;
        }
        return false;
    }
}
