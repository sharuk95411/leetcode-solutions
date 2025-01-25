class Solution {

int ans=0;
int memo[][];
    public int countSquares(int[][] arr) {
        
        memo=new int[arr.length+1][arr[0].length+1];
          for(int i=0;i<memo.length;i++)
        {
            for(int j=0;j<memo[0].length;j++)
            {
                memo[i][j]=-1;
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                if(arr[i][j]==1)
                {
                    ans=ans+ A(arr,i,j);
                }
            }
        }
        return ans;
    }
    public int A(int arr[][],int i,int j)
    {
        if(i>=arr.length || j>=arr[0].length) return 0;
        if(memo[i][j]!=-1) return memo[i][j];

        int right= A(arr,i,j+1);
        int diagonal=A(arr,i+1,j+1);
         int down= A(arr,i+1,j);
        
        if(arr[i][j]==1)
        {
                 System.out.println("WORKING");
                return memo[i][j]= 1+Math.min(right,Math.min(down,diagonal));
        }
       
        else return memo[i][j]= 0;
         



    }
}
