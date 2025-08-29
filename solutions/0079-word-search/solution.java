 class Solution {
    boolean b= false;
    boolean check[][];
    public boolean exist(char[][] arr, String word) {
        
        int row=arr.length;
        int col= arr[0].length;
           check=new boolean[row][col];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(arr[i][j]==word.charAt(0))
                {
                     A(arr,i,j,word,0);
                     if(b) return true;
                }
            }
        }
       
        return false;
    }

    public void A(char arr[][],int i,int j, String word,int count)
    {
        
         if(count==word.length())
        {
            b=true;
            return ;
        }
      
       else if(i>=arr.length || j>=arr[0].length ||i<0 || j<0) return;
        else if(arr[i][j]!=word.charAt(count)|| check[i][j]==true) return;
        check[i][j]=true;
        A(arr,i,j+1,word,count+1);
        A(arr,i,j-1,word,count+1);
        A(arr,i+1,j,word,count+1);
        A(arr,i-1,j,word,count+1);
         check[i][j]=false;
    }
}
