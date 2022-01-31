class Solution {
    public int maximumWealth(int[][] arr) {
        
        int ans= Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            int money=0;
            for(int j=0;j<arr[0].length;j++)
            {
              money= money+arr[i][j];
            }
            ans= Math.max(ans,money);
        }
        
        return ans;
    }
}
