class Solution {
    public boolean searchMatrix(int[][] arr, int target) {
     
        int j= arr[0].length;
        int row=-1;
  //  System.out.println(arr.length);
     //   System.out.println(arr[0].length);
        
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i][0]<=target && arr[i][j-1]>=target)
            {
                row= i;
                break;
            }
        }
        
      //  System.out.println(row);
        if(row==-1) return false;
        
        
        int left=0,right= arr[0].length;
        
        while(left<=right)
        {
            int mid= left+(right-left)/2;
            
            if(arr[row][mid]==target) return true;
            else if(arr[row][mid]>=target) right= mid-1;
            else left= mid+1;
        }
        
        return false;
    }
}
