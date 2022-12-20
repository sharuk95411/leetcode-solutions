class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> arr) {
        
        List<Integer>keys= new ArrayList<>();
        boolean visit[]= new boolean[arr.size()];
        visit[0]= true;
        keys= arr.get(0);

        for(int i=0;i<keys.size();i++)
        {
              int no= keys.get(i);
              if(visit[no]==false)
              {
                  visit[no]= true;
                  for(int j=0;j<arr.get(no).size();j++)
                  {
                      int a= arr.get(no).get(j);
                      if(keys.contains(a)==false)
                      {
                          keys.add(a);
                      }
                  }
                  i=-1;
              }
        }

        for(int i=0;i<visit.length;i++)
        {
            if(visit[i]==false) return false;
        }
        return true;
    }
}
