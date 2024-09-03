class Solution {
    List<List<String>>ans= new ArrayList<>();
    List<String>inner= new ArrayList<>();
    public List<List<String>> partition(String s) {
        A(s);
        return ans;
    }

    public void A (String s)
    {
        if(s.length()==0)
        {
            ans.add(new ArrayList<>(inner));
            return ;
        }
        for(int i=0;i<s.length();i++)
        {
            String str= s.substring(0,i+1);
            if(isPalindrome(str))
            {
                inner.add(str);
                A(s.substring(i+1));
                inner.remove(inner.size()-1);
            }
        }
    }

    public boolean isPalindrome(String s)
    {
        int i=0;
        int j =s.length()-1;
        while(i<j)
        {
            if(s.charAt(i)!=s.charAt(j)) return false;
            else
            {
                i++;
                j--;
            }
        }
        return true;
    }
}
