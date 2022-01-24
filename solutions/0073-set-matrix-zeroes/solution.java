class Solution {
    public void setZeroes(int[][] matrix) {
     
        boolean first_row_zero= false;
        boolean first_col_zero=false;
        
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(matrix[i][j]==0)
                {
                    if(i==0)first_row_zero= true;
                    if(j==0) first_col_zero= true;
                    
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
            }
        }
        
        for(int i=1;i<matrix.length;i++)
        {
            for(int j=1;j<matrix[0].length;j++)
            {
                if(matrix[i][0]==0 || matrix[0][j]==0)
                {
                    matrix[i][j]=0;
                }
            }
        }
        if(first_row_zero==true)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                matrix[0][j]=0;
            }
        }
         if(first_col_zero==true)
        {
            for(int i=0;i<matrix.length;i++)
            {
                matrix[i][0]=0;
            }
        }
    }
}
