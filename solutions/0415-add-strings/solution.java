class Solution {
    public String addStrings(String s1, String s2) {
        
      int i= s1.length()-1;
        int j= s2.length()-1;
        StringBuilder str= new StringBuilder();
        int carry=0;
        
        
        while(i>=0 || j>=0)
        {
            
        int a= (i>=0) ? s1.charAt(i)-'0':0;
            
        int b= (j>=0) ? s2.charAt(j)-'0': 0;
        
            
            int sum= a+b+carry;
            carry= sum/10;
             sum= sum%10;
            str.append(sum);
            i--;
            j--;
            
        }
        if(carry>0) str.append(carry);
        return str.reverse().toString();
        
    }
}
