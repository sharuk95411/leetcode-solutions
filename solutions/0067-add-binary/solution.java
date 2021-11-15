class Solution {
    public String addBinary(String a, String b) {
     
        int i=a.length()-1;
        int j= b.length()-1;
        StringBuilder str= new StringBuilder();
        int carry=0;
        char a1='0',  b1='0';
        
        while(i>=0 || j>=0)
        {
            if(i>=0)
            {
                 a1= a.charAt(i);
            }
            else
                a1='0';
                if(j>=0)
            {
                 b1= b.charAt(j);
            }
            else
                b1='0';
            
            if(a1=='1' && b1=='1')
            {
                if(carry==0)
                {
                str.append("0");
                    carry=1;
                }
                else
                {
                    str.append("1");
                }
                
            }
            else if(a1=='1' ||b1=='1')
            {
                if(carry>0)
                {
                    str.append("0");
                }
                else
                {
                    str.append("1");
                }
            }
            else
            {
                 if(carry>0)
                {
                    str.append("1");
                              carry=0;
                }
                
                else
                {
                    str.append("0");
                }
                
            }
        
            i--;
            j--;
        }
               if(carry>0) str.append("1");
                               
                               return str.reverse().toString();
        
        
    }
}
