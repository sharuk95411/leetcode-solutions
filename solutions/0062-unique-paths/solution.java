class Solution {
    
    public int uniquePaths(int m, int n) {
        
        int [][]memo= new int[m][n];
        for (int i = 0; i < m; i++) {
              Arrays.fill(memo[i], -1);
          }
        return A(m,n,0,0,memo);

    }
    public int A(int m,int n,int row,int col,int memo[][])
    {
        if(row==m-1 && col==n-1) return 1;
        if(row>=m || col>=n) return 0;
         if(memo[row][col]!=-1) return memo[row][col];
        int way1= A(m,n,row+1,col,memo);
        int way2 = A(m,n,row,col+1,memo);

        return memo[row][col]=way1+way2;
    }
}
