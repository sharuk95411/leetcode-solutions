class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        
        List<Integer>list= new ArrayList<>();
        
        if(p.length()>s.length()) return list;
        
        String sub= s.substring(0,p.length());
        
        int arr1[]= new int[26];
        int arr2[]= new int[26];
        
        for(int i=0;i<p.length();i++)
        {
            arr1[sub.charAt(i)-'a']++;
        }
        for(int i=0;i<p.length();i++)
        {
            arr2[p.charAt(i)-'a']++;
        }
        
        if(Arrays.equals(arr1,arr2)) list.add(0);

        
        int start=0;
        int end= p.length();
        while(end<s.length())
        {
                    arr1[s.charAt(end)-'a']++;
                    arr1[s.charAt(start)-'a']--;
            if(Arrays.equals(arr1,arr2)) list.add(start+1);
            start++;
            end++;
        }
               return list;
    }
}
