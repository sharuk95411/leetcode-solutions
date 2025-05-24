class Solution {


    public int uniquePaths(int m, int n) {
        
       Integer[][] arr = new Integer[m+1][n+1];

          return A(m-1,n-1,arr);
          
    }

    public int A(int row, int col ,Integer arr[][])
    {
        if(row<0 || col<0) return 0  ;
        if(arr[row][col]!=null) return arr[row][col];

        if(row==0 && col ==0) 
        {
            return 1 ;
        }

       int a= A(row-1,col,arr);
        int b= A(row,col-1,arr);

        return arr[row][col]=a+b;
    }
}
