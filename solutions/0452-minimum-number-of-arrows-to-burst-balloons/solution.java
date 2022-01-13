class Solution {
    public int findMinArrowShots(int[][] arr) {
        
        // 13== Sort the 2D-Array on the based on any specic column
// Arrays.sort(arr, (a, b) -> a[1] - b[1]);
      //  if(arr.length==0) return 0;
        Arrays.sort(arr,(a,b) -> Integer.compare(a[1],b[1]));
        // Arrays.sort(points, (a,b)->Integer.compare(a[1],b[1]));
        
        int arrow= 1;
        int end= arr[0][1];
        
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i][0]>end)
            {
                end= arr[i][1];
                arrow++;
            }
        }
        return arrow;
    }
}
