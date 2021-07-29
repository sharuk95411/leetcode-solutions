class Solution {
    class Pair
    {
        int index,value;
        List<Integer>l= new ArrayList<>();
        Pair( List<Integer>l,int index,int value)
        {
            this.l= l;
            this.index=index;
            this.value=value;
        }
    }
    
    public int[] smallestRange(List<List<Integer>> nums) {
        
        PriorityQueue<Pair> pq = new PriorityQueue<>((p1, p2) -> p1.value - p2.value);
       int max= Integer.MIN_VALUE;
       int range= Integer.MAX_VALUE;
       int min= Integer.MAX_VALUE;
       int index=0;
        for(int i=0;i<nums.size();i++)
        {
             if(nums.get(i).get(0)>max) max=nums.get(i).get(0);
            List<Integer>l= nums.get(i);
            Pair obj= new Pair(l,index,l.get(index));
            
            
        pq.add(obj);
        }
        int high=0,low=0;
       // System.out.println(max);
       //System.out.println(pq.poll().value);
       
         while(pq.size()>0)
         {
             Pair p= pq.poll();
             min= p.value;
             if(range>max-min) 
             {
                 range= max-min;
                 low=min;
                 high=max;
                 
             }
             index=p.index +1;
             List<Integer>list= p.l;
             if(index>=list.size()) break;
            // System.out.println(r);
             if(list.get(index)>max) max=list.get(index);
              Pair obj= new Pair(list,index,list.get(index));
              pq.add(obj);
             
             
         }
         int ans[]= {low,high};
         return ans;
    }
}
