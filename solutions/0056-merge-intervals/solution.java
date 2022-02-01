class Solution {
    
    class Pair{
        int start,end;
        Pair(int start,int end)
        {
            this.start= start;
            this.end= end;
        }
    }
    public int[][] merge(int[][] arr) {
        
        Arrays.sort(arr, (a, b) -> a[0] - b[0]);
        List<Pair>list= new ArrayList<>();
        
        int start= arr[0][0];
    
        int end= arr[0][1];
        for(int i=1;i<arr.length;i++)
        {
                if(end>=arr[i][0])
                {
                    if(end>arr[i][1]) continue;
                    else   end= arr[i][1];
                    
                }
            else if(arr[i][0]>end)
            {
                list.add(new Pair(start,end));
                start= arr[i][0];
                end= arr[i][1];
                
            }
            
        }
        list.add(new Pair(start,end));
        int ans[][]= new int [list.size()][2];
        for(int i=0;i<list.size();i++)
        {
            Pair p= list.get(i);
            ans[i][0]=p.start;
            ans[i][1]= p.end;
        }
        return ans;
    }
}
