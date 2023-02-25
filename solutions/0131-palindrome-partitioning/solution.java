class Solution {
    List<List<String>>ans= new ArrayList<>();
    List<String>inner = new ArrayList<>();
    public List<List<String>> partition(String s) {
         A(1,s,s);
         return ans;
    }
    public void A(int index,String temp,String s)
    {
    if(index>s.length())
    {
        ans.add(new ArrayList<>(inner));
        
        return ;
    }

    for(int i=1;i<=temp.length();i++)
    {
        String sub= temp.substring(0,i);
        if(isPalindrome(sub))
        {
            inner.add(sub);
            A(index+i,temp.substring(i,temp.length()),s);
              inner.remove(inner.size()-1);
        }
    }
    }
    public boolean isPalindrome(String s)
    {
        int left=0;
        int right=s.length()-1;
        while(left<=right && s.charAt(left)==s.charAt(right))
        {
           left++;
           right--;
        }
        if(left>right) return true;
        else return false;
    }
}
