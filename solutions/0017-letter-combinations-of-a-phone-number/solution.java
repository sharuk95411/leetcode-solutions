class Solution {
    List<String>ans= new ArrayList<>();
    public List<String> letterCombinations(String digits) {
        String arr[]= {"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    if(digits.length()==0) return ans;
        fun(0,"",arr,digits);
        return ans;
    }
    public void fun(int i,String s,String arr[],String digits)
    {
        if(s.length()==digits.length())
        {
            ans.add(s);
            return ;
        }
       if(i>=digits.length()) return ;
        String s1= arr[Character.getNumericValue(digits.charAt(i))-2];
        for(int j=0;j<s1.length();j++)
        {
                s=s+s1.charAt(j);
                fun(i+1,s,arr,digits);
                s=s.substring(0,s.length()-1);
        }
    }
}
