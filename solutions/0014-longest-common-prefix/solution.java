class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        if(strs.length==1) return strs[0];
        String s1= strs[0];
        String ans="";
        boolean flag=false;
        for(int i=1;i<strs.length;i++)
        {
            String s2= strs[i];
            String temp="";
            flag=false;
            for(int j=0;j<Math.min(s1.length(),s2.length());j++)
            {
                     if(s1.charAt(j)==s2.charAt(j))
                     {
                        temp=temp+s1.charAt(j);
                        flag=true;
                     }     
                     else break;
            }
                    if(ans.length()>temp.length())
                     {
                         ans=temp;
                     }
                     if(ans.length()==0) ans=temp;
                     System.out.println("OK "+ans);
                     if(flag==false) return "";
          
        }
          return ans;
    }
}
