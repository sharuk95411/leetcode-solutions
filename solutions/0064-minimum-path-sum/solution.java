class Solution {
    public int minPathSum(int[][] grid) {
        int[][] dp = new int[grid.length][grid[0].length];
        // Fill dp array with -1 to indicate uncalculated cells
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j] = -1;
            }
        }
        return helper(0, 0, grid, dp);
    }

    public int helper(int row, int col, int[][] grid, int[][] dp) {
        if (row >= grid.length || col >= grid[0].length) {
            return Integer.MAX_VALUE;
        }

        if (row == grid.length - 1 && col == grid[0].length - 1) {
            return grid[row][col];
        }

        if (dp[row][col] != -1) {
            return dp[row][col]; // Already calculated
        }

        int down = helper(row + 1, col, grid, dp);
        int right = helper(row, col + 1, grid, dp);

        dp[row][col] = grid[row][col] + Math.min(down, right);
        return dp[row][col];
    }
}

