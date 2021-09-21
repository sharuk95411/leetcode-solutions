class Solution {
    int index=0;
    public String decodeString(String s) {
        
        StringBuilder str= new StringBuilder();
        while(index<s.length()&& s.charAt(index)!=']')
        {
            char c= s.charAt(index);
            if(Character.isDigit(c))
            {
                int value= 0;
                while(index<s.length()&&Character.isDigit(s.charAt(index)))
                {
                    value=value*10+s.charAt(index)-'0';
                        index++;
                }
                index++;
            
            String r=decodeString(s);
            while(value-->0)
            {
                str.append(r);
            }
            index++;
                
            }
            else
            {
                str.append(s.charAt(index));
                index++;
            }
        }
        return str.toString();
    }
}
