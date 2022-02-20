class Solution {
    public int removeCoveredIntervals(int[][] arr) {
     
         // Arrays.sort(intervals, (i, j) -> (i[0] == j[0] ? j[1] - i[1] : i[0] - j[0]));
      // //  System.out.println(intervals[2][0]);
      //   int count = 0, cur = 0;
      //   for (int[] a : intervals) {
      //       if (cur < a[1]) {
      //          // System.out.println(a[0]);
      //           cur = a[1];
      //       count++;
      //       }
      //   }
      //   return count;     
        Arrays.sort(arr, (i, j) -> (i[0] == j[0] ? j[1] - i[1] : i[0] - j[0]));
        
        int count=1,cur=arr[0][1];
        
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i][1]<=cur) continue;
            cur= arr[i][1];
            count++;
        }
        return count;
    }
}
