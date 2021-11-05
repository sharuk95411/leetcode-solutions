class Solution {
    public String reverseWords(String s) {
        
        int n= s.length();
        StringBuilder str= new StringBuilder();
    
            String ans="";
        int i=0;
        while(i<n)
        {
            int j=i;
           while( i<n && s.charAt(i)!= ' ')
           {
               
               i++;
           }
            
            str.append(s.substring(j,i));
        
        
            if(i!=n)
            ans= ans+str.reverse().toString()+" ";
            else
                 ans= ans+str.reverse().toString();
             str= new StringBuilder();
            i++;
            
        }
        return ans;
        
    }
}
