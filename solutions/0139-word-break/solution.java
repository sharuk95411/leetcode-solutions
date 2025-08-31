class Solution {

    
    public boolean wordBreak(String s, List<String> word) {
         
         Boolean memo[]= new Boolean[s.length()+1];
           return A(s,word,memo);
         
    }

    public boolean A(String s, List<String>word,Boolean[]memo)
    {
        if(s.length()==0) 
        {
          return true;
        }
        else if(s.length()<0) return false;
        else if(memo[s.length()]!=null) return memo[s.length()];

        for(int i =1;i<=s.length();i++)
        {
            String temp= s.substring(0,i);
            // System.out.println("temp  "+temp);
            if(word.contains(temp))
            {
                if(A(s.substring(i),word,memo))
                return memo[s.length()]=true;
            }
        }
        
         return memo[s.length()]=false;
    }
}
