class Solution {
    public boolean areNumbersAscending(String s) {
    
        int n1=0;
        String s1="";
        for(int i=0;i<s.length();i++)
        {
        
            if(Character.isDigit(s.charAt(i)))
            {
                s1="";
                while(i<s.length() && Character.isDigit(s.charAt(i))==true)
                {
                     s1= s1+Character.toString(s.charAt(i));
                    i++;
                }
                
                if(n1==0)
                {
                    n1= Integer.parseInt(s1);
                }
                else
                {
                    int n2= Integer.parseInt(s1);
                    if(n1>=n2) return false;
                    else
                    n1= n2;
                }
            }
        }
        return true;
    }
}
