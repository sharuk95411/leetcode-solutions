class Solution {
    List<List<String>>outer;
    List<String>inner;
    public List<List<String>> partition(String s) {
        outer= new ArrayList<>();
        inner= new ArrayList<>();
        A(0,s);
        return outer;
    }
    
    public void A(int index,String s)
    {
        if(index>=s.length())
        {
    outer.add(new ArrayList<>(inner));
            return ;
        }
        
        for(int i=index;i<s.length();i++)
        {
             String temp= s.substring(index,i+1);
         
            if(isPalindrome(temp))
            {
                
                inner.add(temp);
                A(i+1,s);
                inner.remove(inner.size()-1);
            }
        }
        return ;
    }
    
    public boolean isPalindrome(String s)
    {
        
        int i=0;
        int j=s.length()-1;
        while(i<j)
        {
            if(s.charAt(i)==s.charAt(j))
            {
                i++;
                j--;
            }
            else return false;
        }
        return true;
    }
}
