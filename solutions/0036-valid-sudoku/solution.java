class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                if(board[i][j]!='.')
                {
                if(check(board,board[i][j],i,j))
                { 
                    continue;
                }
                else return false;
                }
            }
        }
        return true;
    
    }
    
    
    private boolean check(char board[][],char c,int row,int col)
    {
        for(int j=0;j<9;j++) // Check the current entire row
        {
            if(board[row][j]==c && j!=col) return false;
        }
        for(int i=0;i<9;i++) // check the current entire column
        {
            if(board[i][col]==c && i!=row) return false;
        }
        int x3= 3*(row/3);
        int y3= 3*(col/3);
        
        for(int i=x3;i<x3+3;i++)
        {
            for(int j=y3;j<y3+3;j++)
            {
                if((i!=row && j!=col ) && board[i][j]==c)
                    return false;
            }
        }
        return true;
        
    }
}
