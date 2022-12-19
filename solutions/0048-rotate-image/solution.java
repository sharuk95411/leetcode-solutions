class Solution {
    public void rotate(int[][] matrix) {
    int start=0;
    int end = matrix.length-1;
    while(start<=end)
    {
        int temp[]= new int[matrix.length];
        temp=matrix[start];
        matrix[start]= matrix[end];
        matrix[end]= temp;
        start++;
        end--;
    }

      for(int i=0;i<matrix[0].length;i++)
      {
          for(int j=0;j<matrix[0].length;j++)
          {
              if(i!=j && j>i)
              {
                  int temp= matrix[i][j];
                  matrix[i][j]= matrix[j][i];
                  matrix[j][i]= temp;
              }
          }
      }

    }
}
