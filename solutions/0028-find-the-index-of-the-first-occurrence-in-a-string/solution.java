class Solution {
    public int strStr(String h, String n) {

       if(n.length()>h.length()) return -1;

       for(int i=0;i<=h.length()-n.length();i++)
       {
           String sub= h.substring(i,n.length()+i);
           if(sub.equals(n))
           return i;
       }
       return -1;
    }
}
