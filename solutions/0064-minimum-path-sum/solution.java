class Solution {

Long memo[][];
    public int minPathSum(int[][] arr) {
        
        memo= new Long[arr.length][arr[0].length];
             int ans =(int)A(arr,0,0);
             return ans;
    }
    public long A(int arr[][],int i,int j)
    {


       if(i==arr.length && j==arr[0].length-1) return 0;
       else if(i==arr.length-1 && j==arr[0].length) return 0;

        if(i>=arr.length || j>=arr[0].length) return Integer.MAX_VALUE;
      if(memo[i][j]!=null) return memo[i][j];
        
        long a= (long)arr[i][j]+A(arr,i+1,j);
        long b = (long)arr[i][j]+A(arr,i,j+1);
        return  memo[i][j]=Math.min(a,b);
    }
}
