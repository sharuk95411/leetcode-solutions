class Solution {
    List<Integer>list= new ArrayList<>();
    public List<Integer> findAnagrams(String s, String p) {
        if(p.length()>s.length()) return list;
        int p1[]= new int[26];
        for(int i=0;i<p.length();i++)
        {
            p1[p.charAt(i)-'a']++;
        }
        String sub= s.substring(0,p.length());
         int s1[]= new int[26];
            for(int j=0;j<sub.length();j++)
            {
                s1[sub.charAt(j)-'a']++;
                
            }

            if(Arrays.equals(s1,p1))
            list.add(0);
            int temp=0;
        for(int i=p.length();i<s.length();i++)
        {
            s1[s.charAt(i)-'a']++;
            s1[s.charAt(temp)-'a']--;
            temp++;
            if(Arrays.equals(s1,p1))
            list.add(temp);

        }
        return list;
    }
}
