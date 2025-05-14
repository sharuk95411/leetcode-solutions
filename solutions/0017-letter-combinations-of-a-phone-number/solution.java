class Solution {
    List<String>ans= new ArrayList<>();
    public List<String> letterCombinations(String digits)
     {
        if(digits.length()==0) return ans;
        
      String arr[]= {"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

        A(0,arr,digits,"");
        return ans;
    }

    public void A(int index,String arr[],String digits,String s)
    {
        if(index>=digits.length())
        {
            ans.add(s);
            return ;
        }

        String s1=arr[Character.getNumericValue(digits.charAt(index))-2];
        for(int j=0;j<s1.length();j++)
        {
            A(index+1,arr,digits,s+s1.charAt(j));
        }
    }
}
