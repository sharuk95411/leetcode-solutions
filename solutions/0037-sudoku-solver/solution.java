class Solution {
    public void solveSudoku(char[][] board) {
        solve(board);
    }
     public boolean solve(char[][] board){
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if(board[i][j] == '.'){
                    for(char c = '1'; c <= '9'; c++){//trial. Try 1 through 9
                        if(isValid(board, i, j, c)){
                            board[i][j] = c; //Put c for this cell
                            
                            if(solve(board))
                                return true; //If it's the solution return true
                            else
                                board[i][j] = '.'; //Otherwise go back
                        }
                    }
                    
                    return false;
                }
            }
        }
        return true;
    }
    
    private boolean isValid(char[][] arr, int row, int col, char c){
        for(int i=0;i<arr.length;i++)
    {
       if(arr[i][col]==c) return false; 
    }
    for(int j=0;j<arr.length;j++)
    {
        if(arr[row][j]==c ) return false;
    }
    int x3= row/3*3;
    int y3= col/3*3;
    for(int i=0;i<3;i++)
    {
        for(int j=0;j<3;j++)
        {
            if(arr[x3+i][y3+j]==c ) return false;
        }
    }
    return true;
    }
         
}
