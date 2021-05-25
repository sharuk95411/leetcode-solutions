class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String>l= new ArrayList<>();
          for(String s : words)
          {
              boolean b= B(s,pattern);
              if(b==true) l.add(s);
              
          }
        return l;
    }
     public boolean B(String s, String t)
        {
             HashMap<Character,Character>h1= new HashMap<>();
            HashMap<Character,Boolean>h2= new HashMap<>();
            for(int i=0;i<s.length();i++)
            {
                char c1= s.charAt(i);
                char c2= t.charAt(i);
                if(h1.containsKey(c1)==true)
                {
                    if(h1.get(c1)!=c2)
                
                    return false;
                }
                else if(h2.containsKey(c2) ==true) 
                {
                    return false;
                }
                else
                {
                    h1.put(c1,c2);
                    h2.put(c2,true);
                }
              
        }
          return true;
        }
}
