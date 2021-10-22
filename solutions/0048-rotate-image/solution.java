class Solution {
    public void rotate(int[][] matrix) {
 if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return;
        }

        int n = matrix.length;

        // Rotate the original matrix on horizontal axis. (swap rows)
        for (int i = 0; i < n / 2; i++) {
            int[] tempRow = matrix[i]; // Only reference will be saved
            matrix[i] = matrix[n - i - 1];
            matrix[n - i - 1] = tempRow;
        }

    /*        for (int i = 0; i < n ; i++) { // Selecting a row
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j]+" ");
            }
                System.out.println();
        }*/
        
        
        // Transpose the rotated matrix
        for (int i = 0; i < n - 1; i++) { // Selecting a row
            for (int j = i + 1; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        
        
    }
}

