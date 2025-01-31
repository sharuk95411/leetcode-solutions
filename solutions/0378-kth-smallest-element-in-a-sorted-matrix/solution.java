     class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        int left = matrix[0][0];
        int right = matrix[n-1][n-1];
        while(left < right){
            int mid = left + (right - left)/2;
    int count = seachMatrix(matrix,mid);  
    //find how many numbers are smaller than or equal to  mid element
            if(count < k){
                left = mid+1;
            }
            else{
                right = mid;
            }
        }
        return left;
    }  
  
  public int seachMatrix(int[][] matrix, int target) {
        int count = 0;
        int row = 0;
        int col = matrix[0].length-1;
    
        while(row < matrix.length && col >= 0){
    if(target>=matrix[row][col])  // thats mean ab wo niche jyega because is row ka last element target se chota or equal h 
            {
              count = count + col + 1;
              row++;
            }
            else {
               col--;
            }
        }
        return count;
    }
}
