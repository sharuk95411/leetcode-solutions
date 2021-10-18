class Solution {
    // bht acha use kia gya freq ka with in array jiske advantage se hashmap ka use krne se bach gye
    public boolean isAnagram(String s, String t) {
     
        int arr[]= new int[26];
        for(int i=0;i<s.length();i++)
        {
            arr[s.charAt(i)-'a']++;
            
        }
        for(int i=0;i<t.length();i++)
        {
            arr[t.charAt(i)-'a']--;
            
        }
        for(int a :arr)
        {
            if(a!=0) return false;
        }
        return true;
    }
}
