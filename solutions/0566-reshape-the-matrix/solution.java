class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        
        int row= mat.length;
        int column= mat[0].length;
        
        if(r*c!= row*column) return mat;
        
    
        
         int[][] res = new int[r][c];
       for (int i=0;i<r*c;i++) 
        res[i/c][i%c] = mat[i/column][i%column];
    return res;
    }
}
