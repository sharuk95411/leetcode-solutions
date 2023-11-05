
class Solution {
    public String minWindow(String s, String t) {
        if(s.length() < t.length()){
            return "";
        }
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<t.length();i++){
            map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0) + 1);
        }
        int left=0,right=0;
        int count=0,start=0,min_length = Integer.MAX_VALUE;
        for(int end=0; end<s.length(); end++)
        {
            char c= s.charAt(end);
            if(map.containsKey(c)){
                if(map.get(c)>0){
                    count++;
                }
               map.put(c, map.get(c)-1); 
            }
            if(count == t.length()) { 
               while(!map.containsKey(s.charAt(start)) || map.get(s.charAt(start)) < 0)
                {
                    if(map.containsKey(s.charAt(start))){
                        map.put(s.charAt(start), map.get(s.charAt(start))+1);
                    }
                    start++;
                } 
                  if(min_length > end-start+1){
                      min_length = end-start+1; 
                     left=start;
                     right=end+1;
                }
                if(map.containsKey(s.charAt(start))){
                    map.put(s.charAt(start), map.get(s.charAt(start))+1);
                }
                count--;
                start++;
            }
        }

        return  s.substring(left, right);
    }
}
