class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer>h= new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char c= s.charAt(i);
            h.put(c,h.getOrDefault(c,0)+1);
        }
     //  PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b) -> h.get(b) - h.get(a));
         PriorityQueue<Character>pq= new PriorityQueue<>((a,b)-> h.get(b)-h.get(a));

          for (Map.Entry<Character,Integer> m : h.entrySet())
          {
            pq.add(m.getKey());
          }
          String ans="";
        
        while(pq.size()>0)
        {
            char c= pq.poll();
            int freq= h.get(c);
            while(freq>0)
            {
                ans= ans+c;
                freq--;
            }
        }
        return ans;


    }
}
