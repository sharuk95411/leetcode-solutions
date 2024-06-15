class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> arr) {
        
        boolean check[]= new boolean[arr.size()];
        check[0]=true;
        List<Integer>l= new ArrayList<>();
        List<List<Integer>>outer= new ArrayList<>();
        outer.add(arr.get(0));
            
        while(outer.size()>0)
        {
               l= outer.get(0);
              int i=0;
            while(i<l.size())
            {
                int index= l.get(i);
                if(check[index]==false)
                {
                    outer.add(arr.get(index));
                    check[index]=true;
                }
                i++;
            }
            outer.remove(0);
        }
        
        for(int i=0;i<check.length;i++)
        {
            if(check[i]==false)return false;
        }
        return true;
    }
}
