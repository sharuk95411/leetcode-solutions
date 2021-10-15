class Solution {
    public boolean rotateString(String s, String goal) {
        
    // StringBuilder str= new StringBuilder(s);
        
        int n=s.length();
        int count=n-2;
        
        while(count>=0)
        {
            
            s= s.substring(1,n)+s.substring(0,1);
            if(s.equals(goal)) return true;
            
            count--;
            
        }
        return false;
        
    }
}
