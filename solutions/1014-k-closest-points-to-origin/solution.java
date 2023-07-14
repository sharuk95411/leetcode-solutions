class Solution {

    class A
    {
        int x,y,d;
        A(int m,int n,int distance)
        {
            x=m;
            y=n;
            d=distance;
        }
    }
    public class C implements Comparator<A>
    {
        public int compare(A a1, A a2)
        {
            if(a1.d>a2.d) return -1;
            else if(a1.d<a2.d) return 1;
            else return 0;
        }
    }

         public int[][] kClosest(int[][] p, int k) {
        PriorityQueue<A>pq= new PriorityQueue<>(new C());
         for(int i=0;i<p.length;i++)
         {
             int x= p[i][0];
             int y= p[i][1];
            int d= x*x +y*y;
             if(pq.size()==k)
             {
                A a= pq.peek();
                if(d<a.d) 
                {
                    pq.poll();
                    pq.add(new A(x,y,d));
                    
                }
             }
             else
             {
                 pq.add(new A(x,y,d));
             }
         }
int ans[][]= new int[k][2];
int i=0;
while(pq.size()>0)
{
        A a =pq.poll();
        ans[i][0]=a.x;
        ans[i][1]=a.y;
        i++;
}
return ans;

    }
}
