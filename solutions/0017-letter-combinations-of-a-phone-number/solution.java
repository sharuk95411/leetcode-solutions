class Solution {
    public List<String> letterCombinations(String s) {
        List<String>list= new ArrayList<>();
        if(s.length()==0) return list;
String arr[]=new String[]{"null","null","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
     
        A(s,0,list,arr,"");
        return list;
    }

    public void A(String s,int index, List<String>list,String arr[],String ans)
    {
            if(ans.length()==s.length())
{
   list.add(ans);
   return;
}
if(index>=s.length()) return ;


String temp= arr[s.charAt(index)-'0'];
System.out.println("TEMP "+temp);

for(int i=0;i<temp.length();i++)
{
   
   ans=ans+temp.charAt(i);
   A(s,index+1,list,arr,ans);
   ans=ans.substring(0,ans.length()-1);
   System.out.println("STRING __ "+ans);
}

    }
}
