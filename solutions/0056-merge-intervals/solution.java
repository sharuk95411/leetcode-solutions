class Solution {
    
    class Pair{
        int i,j;
            Pair(int a,int b)
        {
            i=a;
            j=b;
        }
    }
    Queue<Pair>q= new LinkedList<>();
    public int[][] merge(int[][] arr) {
        
        Arrays.sort(arr, (a, b) ->  Integer.compare(a[0],b[0]));
        
        int a= arr[0][0];
        int b= arr[0][1];
        for(int i=1;i<arr.length;i++)
        {
            if(b>=arr[i][0])
            {
                   b=Math.max(b,arr[i][1]);
            }
            else
            {
                 q.add(new Pair(a,b));
                a=arr[i][0];
                b=arr[i][1];
            }
        }
        
        q.add(new Pair(a,b));
        int ans[][]=new int[q.size()][2];
        
        for(int i=0;i<ans.length;i++)
        {
            Pair p=q.poll();
            ans[i][0]=p.i;
            ans[i][1]=p.j;
        }
        
            return ans;
    }
}
