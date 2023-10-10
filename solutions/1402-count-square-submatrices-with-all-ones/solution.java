class Solution {
    public int countSquares(int[][] matrix) {
        int h = matrix.length;
		int l = matrix[0].length;
        int ans=0;
        int dp[][] = new int[matrix.length][matrix[0].length];
		for (int i = 0; i < dp.length; i++) {
			Arrays.fill(dp[i], -1);
		}
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < l; j++) {
                if(matrix[i][j]==1)
                {
                    ans=ans+findSquare(matrix, i, j,dp);      
                }
  
				
			}
		}
		return ans;
    }
    private int findSquare(int[][] matrix, int i, int j,int dp[][]) {
		if (i >= matrix.length || j >= matrix[0].length) {
			return 0;
		}
		if (matrix[i][j] == 0) {
			return 0;
		}
		if(dp[i][j]!=-1)return dp[i][j];
		int sum = 1 + Math.min(findSquare(matrix, i + 1, j + 1,dp), Math.min(findSquare(matrix, i + 1, j,dp), findSquare(matrix, i, j + 1,dp)));
        return dp[i][j]=sum;
	}
}
