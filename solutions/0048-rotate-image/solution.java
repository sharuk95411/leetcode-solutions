class Solution {
    public void rotate(int[][] arr) {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i;j<arr.length;j++)
            {
                if(i!=j)
                {
                    int temp= arr[i][j];
                    arr[i][j]=arr[j][i];
                    arr[j][i]=temp;
                }
            }
        }
        
        int left=0;
        int right=arr.length-1;
        while(left<right)
        {
            int i=0;
            while(i<arr.length)
            {
                int temp=arr[i][left];
                arr[i][left]=arr[i][right];
                arr[i][right]=temp;
                i++;
                }
            left++;
            right--;
        }
        
    }
}
