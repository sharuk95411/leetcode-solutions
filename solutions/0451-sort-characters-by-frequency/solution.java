class Solution {
    public String frequencySort(String S) {
        
 HashMap<Character,Integer>h= new HashMap<>();
        
        for(int i=0;i<S.length();i++)
        {
            char c= S.charAt(i);
            h.put(c,h.getOrDefault(c,0)+1);
        }

PriorityQueue<Map.Entry<Character,Integer>>pq= new PriorityQueue<>( (a,b) ->b.getValue()-a.getValue());
for(Map.Entry<Character, Integer> entry: h.entrySet())// h is Object of HashMap
        {
            pq.offer(entry);
            
        }
        String ans="";
        
        while(pq.size()>0)
        {
        
           String temp= Character.toString(pq.peek().getKey());
        //    System.out.println(temp);
            int no= pq.peek().getValue();
        //    System.out.println(no);
            
            while(no>1)
            {
                temp=temp+pq.peek().getKey();
                no--;
            }
            //System.out.println(temp);
            ans= ans+temp;
            temp="";
            pq.poll();
                
        }
//System.out.println(pq.peek().getKey());
//System.out.println(pq.peek().getValue());
        return ans;
         
    }
  
}
