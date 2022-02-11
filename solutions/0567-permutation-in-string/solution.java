class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
        HashMap<Character,Integer>h1= new HashMap<>();
        
        if(s1.length()>s2.length()) return false;
        
        for(int i=0;i<s1.length();i++)
        {
            char c= s1.charAt(i);
            h1.put(c,h1.getOrDefault(c,0)+1);
        }
        
        HashMap<Character,Integer>h2= new HashMap<>();
        for(int i=0;i<s1.length();i++)
        {
            char c= s2.charAt(i);
            h2.put(c,h2.getOrDefault(c,0)+1);
        }
        int j=0;
        if(h1.equals(h2)) return true;
        for(int i=s1.length();i<s2.length();i++)
        {
        
              char c= s2.charAt(j);
              int value= h2.get(c);
              if(value==1)h2.remove(c);
              else h2.put(c,value-1);
              c= s2.charAt(i);          
              h2.put(c,h2.getOrDefault(c,0)+1);
              if(h1.equals(h2)) return true;
              System.out.println(h2);
              j++;   
            
        }
        return false;
    }
}
