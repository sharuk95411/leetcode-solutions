class Solution {
    public int kthSmallest(int[][] matrix, int k) {

      int n = matrix.length;
        
        int low = matrix[0][0]; // Minimum value
        int high = matrix[n - 1][n - 1]; // Maximum value
        
        while (low < high) {
            int mid = low + (high - low) / 2;
            int count = countLessEqual(matrix, mid);
            
            if (count < k) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        
        return low;   
    }
    private int countLessEqual(int[][] matrix, int mid) {
        int n = matrix.length;
        int count = 0;
        int row = 0;
        int col = n - 1; // Start from top-right corner
        
        while (row < n && col >= 0) {
            if (matrix[row][col] <= mid) {
                count += (col + 1); // All elements from 0 to col are <= mid
                row++;
            } else {
                col--;
            }
        }
        
        return count;
    }
}
