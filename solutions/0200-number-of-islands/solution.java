class Solution {
    public int numIslands(char[][] arr) {
        
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                if(arr[i][j]=='1')
                {
                       count++;
                    A(i,j,arr);
                }
            }
        }
        return count;
    }
    public void A(int i ,int j, char arr[][])
    {
        if(i>=arr.length || i<0) return ;
        if(j<0 || j>=arr[0].length)return ;
        if(arr[i][j]=='0') return ;
        
        if(arr[i][j]=='1')
        {
            arr[i][j]='0';
            A(i,j+1,arr);
            A(i+1,j,arr);
            A(i,j-1,arr);
            A(i-1,j,arr);
        }
    }
}

