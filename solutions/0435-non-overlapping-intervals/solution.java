class Solution {
    // TYN and Code is awesome Hint- Sort on the basis of end time
    public int eraseOverlapIntervals(int[][] intervals) {
         if(intervals.length == 0 || intervals == null)
            return 0;
        
        // Sort by the second number in each interval:
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));
        int remove = 0;
        // The second value of the last valid interval.
        int End = intervals[0][1]; 
        
        // We need to traverse the sorted intervals, counting the number of invalid intervals, and updating the prevEnd value when you find a valid interval.
        for(int i = 1;  i < intervals.length; i++){
            // We have an invalid interval if the  current start time is < End time;
            if(intervals[i][0] < End)
                remove++;
            else{
                End = intervals[i][1]; // update the end time
            }
        }
        
        // Return the number of intervals removed:
        return remove;
        
    }
}
