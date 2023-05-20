class Solution {
    boolean ans= false;
    public boolean exist(char[][] board, String word) {
        
           boolean b[][]= new boolean[board.length][board[0].length];
      
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[0].length;j++)
            {
                if(board[i][j]==word.charAt(0))
                {
                    System.out.println("OK");
                    A(board,word,b,i,j,0);
                }
                  
            }
        }
     
        return ans;
    }

public void A(char arr[][],String word,boolean b[][],int row,int col,int index)
{
if(index==word.length())
{
    ans=true;
    return;
}
if(row<0 || row>=arr.length) return ;
if(col<0 || col>=arr[0].length) return;
if(arr[row][col]!=word.charAt(index)) return;
if(arr[row][col]==word.charAt(index) && b[row][col]==false)
{
        b[row][col]=true;
        A(arr,word,b,row,col+1,index+1);
        A(arr,word,b,row+1,col,index+1);
        A(arr,word,b,row,col-1,index+1);
        A(arr,word,b,row-1,col,index+1);
        b[row][col]=false;
}

}
}
