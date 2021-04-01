class Solution {
    public boolean exist(char[][] board, String word) {
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if(board[i][j] == word.charAt(0) && dfs(board, word, 0, i, j))
                    return true;
            }
        }
        return false;
        
    }
     public static boolean dfs(char[][] board, String word, int index,  int i, int j){
        if(index == word.length())
            return true;
        if(i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] != word.charAt(index))
            return false;
       
        char temp = board[i][j];
        board[i][j] = '*'; // yha boolean array ki jgh is trike ko use kia gya h jisse hmra extra space save ho rha h 
        
        boolean result = dfs(board, word, index + 1, i-1, j) || 
                         dfs(board, word, index + 1, i+1, j) || 
                         dfs(board, word, index + 1, i, j-1) || 
                         dfs(board, word, index + 1, i, j+1);
        
        board[i][j] = temp; // BackTraking
        return result;
    }
}
