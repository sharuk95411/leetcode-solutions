class Solution {
    public boolean detectCapitalUse(String word) {
     
         boolean check= false;
        if(Character.isUpperCase(word.charAt(0)))
        {
            //System.out.println("OK");
            check= true;
        }
       
        for(int i=0;i<word.length();i++)
        {
            char c= word.charAt(i);
            System.out.println(c);
            if(Character.isUpperCase(c)==true)
            {
                if(check==false) return false;
            }
            else if(Character.isUpperCase(c)==false )
            {
                if(check==true && i!=1) return false;
                check=false;
            }  
            
        }
        return true;
    }
}
