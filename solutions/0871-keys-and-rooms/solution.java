class Solution {

    boolean isVisited[];
    public boolean canVisitAllRooms(List<List<Integer>> arr) {
        
        isVisited= new boolean[arr.size()];
        A(arr,0,isVisited);
        for(int i=0;i<isVisited.length;i++)
        {
            if(isVisited[i]==false) return false;
        }
        return true;

    }
    public void A(List<List<Integer>>arr,int i,boolean isVisited[])
    {
        if(isVisited[i]==false)
        {
            isVisited[i]=true;
            List<Integer>keys= arr.get(i);
            int keySize= keys.size();
            while(keySize>0)
            {
                for(int j=0;j<keys.size();j++)
                {
                    int roomNo= keys.get(j);
                    A(arr,roomNo,isVisited);
                    keySize--;
                }
            }

        }
        else return ;
    }
}
