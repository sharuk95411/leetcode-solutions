class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(s.length()!=t.length()) return false;
        int arr[]= new int[26];
        for(int i=0;i<t.length();i++)
        {
            arr[t.charAt(i)-'a']++;
        }
        for(int i=0;i<s.length();i++)
        {
            if(arr[s.charAt(i)-'a']==0) return false;
            else arr[s.charAt(i)-'a']--;
        }
        return true;
    }
}
