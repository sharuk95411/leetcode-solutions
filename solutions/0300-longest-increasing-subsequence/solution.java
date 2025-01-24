class Solution {
    public int lengthOfLIS(int[] arr) {
        int[][] memo = new int[arr.length][arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <= arr.length; j++) {
                memo[i][j] = -1;
            }
        }


        return A(arr, 0, -1, memo);
    }

    public int A(int[] arr, int i, int prevIndex, int[][] memo) {
       
        if (i == arr.length) return 0;

        if (memo[i][prevIndex + 1] != -1) return memo[i][prevIndex + 1];

         int pick=0,skip=0;

        if (prevIndex == -1 || arr[i] > arr[prevIndex]) {
            pick = 1 + A(arr, i + 1, i, memo);
        }
        skip = A(arr, i + 1, prevIndex, memo);

        return memo[i][prevIndex + 1] = Math.max(skip, pick);

    }
}

