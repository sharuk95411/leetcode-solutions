class Solution {

    class Pair
    {
        int a,b;
        Pair(int row,int col)
        {
            a=row;
            b=col;
        }
    }
    public int[][] merge(int[][] arr) {
        
        List<Pair>l= new ArrayList<>();
        Arrays.sort(arr, (a, b) ->  Integer.compare(a[0],b[0]));
        int start= arr[0][0];
        int end= arr[0][1];

        for(int i=1;i<arr.length;i++)
        {
            if(end>=arr[i][0])
            {
                end= Math.max(arr[i][1],end);
            }
            else
            {
                l.add(new Pair(start,end));
                start=arr[i][0];
                end= arr[i][1];
            }
        }
        l.add(new Pair(start,end));

        int ans[][]= new int[l.size()][2];
        for(int i=0;i<l.size();i++)
        {
            Pair p=l.get(i);
            ans[i][0]=p.a;
            ans[i][1]=p.b;
        }
        return ans;


    }
}
