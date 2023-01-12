class Solution {
    public boolean searchMatrix(int[][] arr, int target) {
        
        int col= arr[0].length-1;
        int r=0;

        for(int i=0;i<arr.length;i++)
        {
            if((arr[i][0]<=target) && (target<=arr[i][col]))
            {
                r=i;
                break;
            }
        }
        System.out.println("ROW "+r);
        int left=0;
        int right= col;
        int i=0;
        while(left<=right)
        {
            int mid= left+(right-left)/2;
            if(arr[r][mid]==target)return true;
            if(arr[r][mid]>target)
            {
                right=mid-1;
            }
            else
            {
                left=mid+1;;
            }
        }
        return false;
    }
}
