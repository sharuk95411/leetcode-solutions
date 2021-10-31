class Solution {
    public int maxTwoEvents(int[][] arr) {
        
        Arrays.sort(arr,(a,b)->a[0]==b[0] ? a[1]-b[1]: a[0]-b[0]);
        PriorityQueue<int[]>queue=new PriorityQueue<>((a,b)->a[0]-b[0]); // yha Array ka size 2 h end usme end,value ye do data jyga.
         int maxVal = 0, ans = 0;
        for(int[] e : arr){            
            int start = e[0];
            while(!queue.isEmpty()){
                if(queue.peek()[0] >= start)
                    break;
                int[] eve = queue.remove();
                maxVal = Math.max(maxVal, eve[1]);
            }
            ans = Math.max(ans, e[2] + maxVal);
            queue.add(new int[]{e[1], e[2]});
        }
        
        return ans;
    }
}
/*
  int n = events.length;
        Arrays.sort(events, (a, b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);
        PriorityQueue<int[]> queue = new PriorityQueue<int[]>((a, b) -> a[0] - b[0]);
        
        int maxVal = 0, ans = 0;
        for(int[] e : events){            
            int start = e[0];
            while(!queue.isEmpty()){
                if(queue.peek()[0] >= start)
                    break;
                int[] eve = queue.remove();
                maxVal = Math.max(maxVal, eve[1]);
            }
            ans = Math.max(ans, e[2] + maxVal);
            queue.add(new int[]{e[1], e[2]});
        }
        
        return ans;
*/
