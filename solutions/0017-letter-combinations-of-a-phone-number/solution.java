class Solution {
     List<String>l= new ArrayList<>();
    public List<String> letterCombinations(String digits) {

        if(digits.length()==0) return l;
        String arr[]= {"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        A("",arr,0,digits);
        return l;
    }

    public void A(String ans,String arr[],int index,String s)
    {
        if(index==s.length())
        {
           l.add(ans);
           return ; 
        }

        int j= s.charAt(index)-'0';
        String temp= arr[j-2];
        for(int i=0;i<temp.length();i++)
        {
            ans=ans+temp.charAt(i);
            A(ans,arr,index+1,s);
            ans=ans.substring(0,ans.length()-1);
        }

         
    }
}
