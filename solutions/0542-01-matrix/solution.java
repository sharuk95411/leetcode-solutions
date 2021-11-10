class Solution {
    
    // Logic- pepcoding and code self 
    // Isko O(1) space me krna h jo ki Brute Force h wo kia tha pr hua ni
    public int[][] updateMatrix(int[][] arr) {
        if(arr.length==0) return arr;
        
        
        Queue<int[]>q= new ArrayDeque<>();
        
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                if(arr[i][j]==0)
                {
                    q.offer(new int[]{i,j});
                }
                else
                    arr[i][j]=-1;
            }
        }
        
        
        while(q.size()>0)
        {
            int temp[]= q.remove();
            int row=temp[0];
            int col=temp[1];
            if(col<arr[0].length-1)  // go right
            {
                if(arr[row][col+1]==-1)
                {
                    arr[row][col+1]= arr[row][col]+1; 
                     q.offer(new int[]{row,col+1});
                    
                }
            }
             if(col>=1) //Go left
            {
                if(arr[row][col-1]==-1)
                {
                    arr[row][col-1]= arr[row][col]+1; 
                q.offer(new int[]{row,col-1});
                    
                }
            }
             if(row<arr.length-1) // go Bottom
            {
                if(arr[row+1][col]==-1)
                {
                    arr[row+1][col]= arr[row][col]+1; 
                     q.offer(new int[]{row+1,col});
                    
                }
            }
             if(row>=1) // Go Up
            {
                if(arr[row-1][col]==-1)
                {
                    arr[row-1][col]= arr[row][col]+1; 
                     q.offer(new int[]{row-1,col});
                    
                }
            }
            
            
        }
        return  arr;
        
        
    }
}
