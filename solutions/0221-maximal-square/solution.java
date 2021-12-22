class Solution {
    Integer b[][];
    public int maximalSquare(char[][] matrix) {
        
        if(matrix.length==0) return 0;
        int ans=0;
        
        b= new Integer[matrix.length][matrix[0].length];
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(matrix[i][j]=='1')
                {
                    int temp= call_the_neg(matrix,i,j);
                    ans= Math.max(temp,ans);
                }
            }
        }
        return ans*ans;
        
    }
    
    private int call_the_neg(char arr[][],int i,int j)
    {
        if(i>=arr.length || j>=arr[0].length || arr[i][j]=='0')
        {
            return 0;
        }
        if(b[i][j]!=null) return b[i][j];

        return b[i][j]= 1+Math.min(call_the_neg(arr,i+1,j+1),Math.min(call_the_neg(arr,i+1,j),call_the_neg(arr,i,j+1)));
    }
}
