class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        
        int arr[]= new int[26];

        for(int i=0;i<p.length();i++)
        {
            char c= p.charAt(i);
            arr[c-'a']++;
        }
        int i=0;
        int j=0;
        int count =0;
        List<Integer>list= new ArrayList<>();
        while(j<s.length())
        {
            char c= s.charAt(j);
            arr[c-'a']--;
            if(arr[c-'a']>=0) count++;
        
                  if(count==p.length()) list.add(i);
                  if(j-i+1==p.length())
                  {
                    c= s.charAt(i);
                    arr[c-'a']++;
                    if(arr[c-'a']>0) count--;
                    i++;
                  }       
            j++;
        }
        return list;
    }
}
