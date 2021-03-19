class Solution {
    public int countNegatives(int[][] arr) {
        int count=0;
        
        for(int i=0;i<arr.length;i++)
        {
            int j= arr[i].length-1;
            if(arr[i][0]<0)
            {
                count= count+arr[i].length;
            }
            else if(arr[i][0]>=0 && arr[i][j]<0)
            {
                while(arr[i][j]<0)
                {
                    count++;
                    j--;
                }
            }
            
        }
return count;
        
    }
}
