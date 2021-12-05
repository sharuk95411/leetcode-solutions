class Solution {
    public int[][] kClosest(int[][] p, int k) {
    /*  Sol 1- TC is NlogN 
    Arrays.sort(p,(p1,p2)-> p1[0]*p1[0]+p1[1]*p1[1] -p2[0]*p2[0]-p2[1]*p2[1]);
        
        int ans[][]= new int[k][2];
        for(int i=0;i<k;i++)
        {
            ans[i][0]= p[i][0];
            ans[i][1]= p[i][1];
        }
        return ans;*/
//PriorityQueue<int[]> pq = new PriorityQueue<int[]>((p1, p2) -> p2[0] * p2[0] + p2[1] * p2[1] - p1[0] * p1[0] - p1[1] * p1[1]);
PriorityQueue<int[]>pq= new PriorityQueue<>((p1,p2)->p2[0]*p2[0]+p2[1]*p2[1] -p1[0]*p1[0]-p1[1]*p1[1]);
            
            for(int arr[]: p)
            {
                pq.offer(arr);
                if(pq.size()>k)
                {
                    pq.poll();
                }
            }
        
        int ans[][]= new int[k][2];
        int i=0;
        while(i<k)
        {
            ans[i]= pq.poll();
            i++;
        }
        return ans;
    }
}
