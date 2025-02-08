class Solution {
    public String minWindow(String s, String t) {
        
        String ans="";
        if(t.length()>s.length())return ans;
        HashMap<Character,Integer>h= new HashMap<>();
        boolean b=true;

        for(int i =0;i<t.length();i++)
        {
           char c= t.charAt(i);
           h.put(c,h.getOrDefault(c,0)+1);
        }

        int i =0;
        int j=0;
        int count=0;

        while(j<s.length())
        {
            char c= s.charAt(j);
            if(h.containsKey(c))
            {
                  h.put(c,h.get(c)-1);
                  if(h.get(c)>=0) count++;
                  if(count==t.length())
                  {
                     while(i<=j)
                     {
                          char ch=s.charAt(i);
                          if(h.containsKey(ch))
                          {
                              h.put(ch,h.get(ch)+1);
                              if(h.get(ch)==1)
                              {
                                String temp= s.substring(i,j+1);
                                 if(b)
                                 {
                                    ans=temp;
                                    b=false;
                                 }
                                 else
                                 {
                                    if(ans.length()>temp.length()) ans=temp;
                                 }
                                 count--;
                                 i++;
                                 break;
                              }
                              i++;
                          }
                          else
                          i++;
                     }
                
                  }

            }
        
            j++;

        }
        return ans;
    }
}
