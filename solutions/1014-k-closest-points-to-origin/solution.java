 /*  Sol 1- TC is NlogN 
    Arrays.sort(p,(p1,p2)-> p1[0]*p1[0]+p1[1]*p1[1] -p2[0]*p2[0]-p2[1]*p2[1]);
        
        int ans[][]= new int[k][2];
        for(int i=0;i<k;i++)
        {
            ans[i][0]= p[i][0];
            ans[i][1]= p[i][1];
        }
        return ans; */
//======================================================================================
/*Soln 2- TC is Nlog(k)         
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
        return ans;*/
//==========================================================================================

// question easy h but isme bht kuch seekhne ko mila h 

class Solution {
    // Ye mmne khud se kia h and isme float type k based pr kse sort krte h PQ me wo seekha h and sol-1 and sol-2 are both are awesomee so un dno ko zruru ache se smjh lena 
    class pair
    {
        int x,y;
        Double distance;
        pair(int x,int y, Double distance)
        {
            this.x=x;
            this.y= y;
            this.distance=distance;
        }
    }
    public int[][] kClosest(int[][] points, int k) {
        
        int no_of_points= points.length;
        
    int ans[][]= new int[k][2];
        
PriorityQueue<pair>pq= new PriorityQueue<pair>((p1,p2)->(p1.distance.compareTo(p2.distance)));
   // yha compare to krne se hi double me sort krege withouut iske PQ integer k base pr sort krta h so ye new chz seekhi h      
        
        
        for(int i=0;i<points.length;i++)
        {
            int x2=points[i][0];
            int y2= points[i][1];
           //System.out.println(x2+" "+y2);
                double distance= Math.sqrt((x2*x2)+(y2*y2));
           System.out.println(distance);
            pq.add(new pair(x2,y2,distance));
        }
        
        for(int i=0;i<k;i++)
        {
            pair p= pq.poll();
            ans[i][0]= p.x;
            ans[i][1]=p.y;
        }
        return ans;
        
    }
}
