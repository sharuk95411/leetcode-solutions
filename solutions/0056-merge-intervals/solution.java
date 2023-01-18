class Pair {

    int row,col;
    Pair(int r,int c)
    {
        row=r;
        col=c;
    }
}

class Solution {
    public int[][] merge(int[][] arr) {
Arrays.sort(arr, (a, b) -> Integer.compare(a[0],b[0])); //increasing orde

for(int i=0;i<arr.length;i++)
{
    System.out.println("COL IS "+arr[i][0]+" AND "+arr[i][1]);
}
Stack<Pair>s = new Stack<>();

   s.push(new Pair(arr[0][0],arr[0][1]));
   int start= arr[0][1];

   for(int i=1;i<arr.length;i++)
   {
       if(start>=arr[i][0])
       {
           Pair p = s.pop();
           s.push(new Pair(p.row,Math.max(arr[i][1],p.col)));
           start= Math.max(p.col,arr[i][1]);
       }
       else
       {
           s.push(new Pair(arr[i][0],arr[i][1]));
           start= arr[i][1];
       }
   }

   int ans[][]= new int[s.size()][2];
   int i= ans.length-1;
   while(i>=0)
   {
       Pair p= s.pop();
       ans[i][0]= p.row;
       ans[i][1]=p.col;
       i--;
   }
   return ans;


 
      


    }
}
