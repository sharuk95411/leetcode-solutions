class Solution {
    int dp[][] = null;
    public int maximalSquare(char[][] matrix) {
		if (matrix.length == 0) {
			return 0;
		}
		dp = new int[matrix.length][matrix[0].length];
		for (int i = 0; i < dp.length; i++) {
			Arrays.fill(dp[i], -1);
		}
		int h = matrix.length;
		int l = matrix[0].length;
		int max = 0;

		int curMax = 0;
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < l; j++) {
				curMax = findSquare(matrix, i, j);
				if (max < curMax) {
					max = curMax;
				}
			}
		}
		return max * max;
	}

	private int findSquare(char[][] matrix, int i, int j) {
		if (i >= matrix.length || j >= matrix[0].length) {
			return 0;
		}
		if (matrix[i][j] == '0') {
			return dp[i][j] = 0;
		}
		if (dp[i][j] != -1) {
			return dp[i][j];
		}
		int sum = 1 + Math.min(findSquare(matrix, i + 1, j + 1), Math.min(findSquare(matrix, i + 1, j), findSquare(matrix, i, j + 1)));
		return dp[i][j] = sum;
	}
}
