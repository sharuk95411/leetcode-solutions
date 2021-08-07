class Solution {
    public int ladderLength(String beginW, String endW, List<String> list) {
        
        if(!list.contains(endW)) return 0;
        HashMap<String,Boolean>h= new HashMap<>();
        for(String s :list)
        {
            h.put(s,false);
        }
        
        Queue<String>q= new LinkedList<>();
        q.add(beginW);
        h.put(beginW, true);
        int length=0;
        
        while(q.size()>0)
        {
            
            int size= q.size();
            for(int i=0;i<size;i++)
            {
                String s= q.poll();
                if(s.equals(endW)) return length+1;
                wordM(s,h,q);
            }
            length++;
        }
        return 0;
    }
    

        public void wordM(String s,HashMap<String,Boolean>h, Queue<String>q)
        {
            for(int i=0;i<s.length();i++)
            {
                char temp[]= s.toCharArray();
                for(int j=0;j<26;j++)
                {
                    temp[i]= (char)('a'+j);
                    String check= String.valueOf(temp);
                    if(h.containsKey(check) && h.get(check)==false )
                    {
                        h.put(check,true);
                        q.add(check);
                    }
                }
            }
        }
    
}
