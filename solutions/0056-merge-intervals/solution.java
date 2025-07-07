class Solution {
    class Pair
    {
        int a,b;
        Pair(int i,int j)
        {
            a=i;
            b=j;
        }
    }
    public int[][] merge(int[][] arr) {

             Arrays.sort(arr, (a, b) ->  Integer.compare(a[0],b[0]));
        List<Pair>list= new ArrayList<>();
        list.add(new Pair(arr[0][0],arr[0][1]));
         
        

        for(int i=1;i<arr.length;i++)
        {
            int right= list.get(list.size()-1).b;
             if(arr[i][1]>right)
             {
                 if(arr[i][0]>right)
                 {
                   list.add(new Pair(arr[i][0],arr[i][1]));
                 }
                 else
                 {
                    int left=  list.remove(list.size()-1).a;     
                    list.add(new Pair(left,arr[i][1]));
                 }
             }
             
        }
        int ans[][]= new int[list.size()][2];
        int i=0;
        while(i<list.size())
        {
            int left= list.get(i).a;
            int right= list.get(i).b;

            ans[i][0]=left;
            ans[i][1]=right;
            i++;
        }
        return ans;
    }
}
