class Solution {
    public List<Integer> findAnagrams(String s, String pattern) {
        
        List<Integer>l= new ArrayList<>();
         if(pattern.length()>s.length()) return l;
        
          HashMap<Character,Integer>h1= new HashMap<>();
         HashMap<Character,Integer>h2= new HashMap<>();
         int i=0;
         while(i<pattern.length())
         {
             h1.put(pattern.charAt(i),h1.getOrDefault(pattern.charAt(i),0)+1);
             i++;
         }
       //  System.out.println(h1.entrySet());
       int left=0,right=0;
       while(right-left+1<=pattern.length())
       {
            h2.put(s.charAt(right),h2.getOrDefault(s.charAt(right),0)+1);
            right++;
       }
       
       if(h1.equals(h2)==true) l.add(left);
       
     // System.out.println(right);
      while(right<s.length())
      {
          int freq=h2.get(s.charAt(left));
          if(freq==1)
          {
              h2.remove(s.charAt(left));
          }
          else
          {
              h2.replace(s.charAt(left),freq-1);
          }
          left++;
          h2.put(s.charAt(right),h2.getOrDefault(s.charAt(right),0)+1);
          if(h1.equals(h2)==true) l.add(left);
          right++;
          
          }
      return l;
        
    }
}
