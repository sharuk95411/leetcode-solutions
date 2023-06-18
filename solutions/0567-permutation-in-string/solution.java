class Solution {
    public boolean checkInclusion(String p, String s) {
 int freq1[] = new int[26];
   int freq2[] = new int[26];
    if(s.length()<p.length())
        return false;
    
    for(int i=0; i<p.length(); i++){
        freq1[s.charAt(i)-'a']++;
        freq2[p.charAt(i)-'a']++;
    }
 
    int start=0;
    int end=p.length();
    
    if(Arrays.equals(freq1,freq2))
        return true;
    
    while(end<s.length()){
        
        freq1[s.charAt(start)-'a']--;
        freq1[s.charAt(end)-'a']++;
        
        if(Arrays.equals(freq1,freq2))
        return true;
        
        start++;
        end++;
    }
  return false;
    }
}
