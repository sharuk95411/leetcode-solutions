class Solution {
    int ans=0;
    Integer b[][];
    public int uniquePaths(int m, int n) {
        int arr[][]= new int[m][n];
        
        b=new Integer[m][n];
        int row= m;
        int col=n;
        
        
        
        return A(0,0,m,n,arr);
        
    }
    
    private int A(int i,int j,int row,int col,int arr[][])
    {
        if(i==row-1 && j==col-1)
        {
            return 1;
            
        }
        
        if(i>=row ||j>=col) return 0;
        if(b[i][j]!=null) return b[i][j];
    int way1=0;
        way1= A(i,j+1,row,col,arr);
        b[i][j]=way1;
        int way2=0;
        way2=A(i+1,j,row,col,arr);
        b[i][j]= way2;
        return b[i][j]= way1+way2;
            
    }
}
