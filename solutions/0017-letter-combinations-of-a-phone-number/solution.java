class Solution {
    List<String>list= new ArrayList<>();
    public List<String> letterCombinations(String digits) {
        String arr[]= new String[]{"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        if(digits.length()==0) return list;
        A(0,"",arr,digits);
        return list;
    }
    public void A(int index,String ans,String arr[],String s)
    {
        if(index>s.length()) return ;
        if(ans.length()==s.length())
        {
            list.add(ans);
            return ;
        }
        String temp= arr[Character.getNumericValue(s.charAt(index))-2]; 
        for(int i=0;i<temp.length();i++)
        {
            ans=ans+temp.charAt(i);
            System.out.println("OK "+ans);
            A(index+1,ans,arr,s);
            ans=ans.substring(0,ans.length()-1);

        }
    }
}
