class Solution {
       List<List<String>>f= new ArrayList<>();
       boolean checkAns=false;
    public List<List<String>> solveNQueens(int N) {
         
     int[][] sol = new int[N][N];
    
    
    queenProblemUtil(0, sol,N); 
     if(checkAns==false)
     {
    
       return f;
     }
    return f;
        
    }
  public boolean queenProblemUtil(int col, int[][] sol,int N) {
    
    if(col >= N) {
        checkAns=true;
        printQueenPlacement(sol,N);
        
      return true;
    }
    
    for(int row = 0; row < N; row++) {
      
     if(isSafeToPlaceQueen(row, col, sol,N)) {
        sol[row][col] =1;
        
        if(queenProblemUtil(col + 1, sol,N)) {
          
        }
        
      }
        sol[row][col] = 0;
       
    }
    return true;

  }
     public boolean isSafeToPlaceQueen(int row, int col, int[][] sol,int N) {
    int i, j;
    
    for(i = 0; i < col; i++) {
      if(sol[row][i] == 1) {
        return false;
      }
    }
    
    for(i = row, j = col; i >= 0 && j >= 0 ; i--, j--) {
      if(sol[i][j] == 1) {
        return false;
      }
    }
    
    for(i = row, j = col; i < N && j >= 0 ; i++, j--) {
      if(sol[i][j] == 1) {
        return false;
      }
    }
    
    return true;
  }
   public void printQueenPlacement(int[][] mat,int N) {
      List<String>l= new ArrayList<>();

    for(int i = 0; i < N; i++) {
     String s="";
      for(int j = 0; j< N; j++) {
        if(mat[i][j]==1)
        {
            s=s+"Q";
        }
          else
              s=s+".";
      }
         l.add(s);
    }
      
    f.add(l);
      }
}
