class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> arr) {
        
        List<Integer>key= new ArrayList<>();
        boolean check[]= new boolean[arr.size()];
        A(key,0,arr,check);
        for(int i=0;i<check.length;i++)
        {
            if(check[i]==false)return false;
        }
        return true;
    }
    
    public void A(List<Integer>keys,int room_visit,List<List<Integer>> arr,boolean check[])
                  {
                      check[room_visit]=true;
                      keys=arr.get(room_visit);
                      
                      for(int i=0;i<keys.size();i++)
                      {
                          if(check[keys.get(i)]==false)
                          {
                              A(keys,keys.get(i),arr,check);
                          }
                      }
                  }
}
