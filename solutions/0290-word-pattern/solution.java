class Solution {
    public boolean wordPattern(String pattern, String s) {
        
        HashMap<Character,String>h= new HashMap<>();
        List<String>list= new ArrayList<>();
        int j=0;
        
        for(int i=0;i<pattern.length();i++)
        {
            char c= pattern.charAt(i);
            String temp="";
            if(h.get(c)==null)
               
            {
                 if(j>=s.length()) return false;
                while(j<s.length() && s.charAt(j)!=' ')
                {
                    temp=temp+s.charAt(j);
                    j++;
                }
                j++;
                if(list.contains(temp)) return false;
                else list.add(temp);
                // System.out.println(temp);
                h.put(c,temp);
                
            }
            else
            {
                while(j<s.length() && s.charAt(j)!=' ')
                {
                    temp= temp+s.charAt(j);
                    j++;
                }
              // System.out.println(temp);
                j++;
                if(h.get(c).equals(temp)==false) 
                {
                    System.out.println(h.get(c));
                     System.out.println(temp);
                    return false;
                }
            }
        }
        if(j<s.length()) return false;
        
        return true;
    }
}
