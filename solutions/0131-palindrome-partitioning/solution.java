class Solution {
    List<List<String>>ans=new ArrayList<>();
    public List<List<String>> partition(String s) {
        
        List<String>inner= new ArrayList<>();
        A(s,inner);
        return ans;
    }

    public void A(String s,List<String>inner)
    {
        if(s.length()==0)
        {
            ans.add(new ArrayList<>(inner));
            return ;
        }

        for(int i=0;i<s.length();i++)
        {
            String check= s.substring(0,i+1);
            if(isPalindrome(check))
            { 
                    inner.add(check);
                    A(s.substring(i+1),inner);
                    inner.remove(inner.size()-1);
            }
        }
    }

    public boolean isPalindrome(String s)
    {
        int i=0;
        int j= s.length()-1;

        while(i<j)
        {
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}
