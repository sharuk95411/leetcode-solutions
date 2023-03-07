class Solution {
    public int longestSubstring(String s, int k) {
    int freq[]= new int[26];
    for(int i=0;i<s.length();i++)
    {
        freq[s.charAt(i)-'a']++;
    }
    
    int ans = 0;
    while(ans < s.length() && freq[s.charAt(ans)-'a']>=k){
        ans++;
    }
    
    if(ans == s.length()){
        return ans;
    }
    
    int left = longestSubstring(s.substring(0,ans),k);
    int right = longestSubstring(s.substring(ans+1),k);
    
    return Math.max(left,right);
}
    }

