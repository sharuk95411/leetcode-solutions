class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer>list= new ArrayList<>();
        
        if(p.length()>s.length()) return list;
        int pF[]= new int[26];
        
        for(int i=0;i<p.length();i++)
        {
            pF[p.charAt(i)-'a']++;
        }
        
        int sF[]= new int[26];
        
        for(int i=0;i<p.length();i++)
        {
            sF[s.charAt(i)-'a']++;
        }
        System.out.println(sF[1]);
        if(Arrays.equals(pF, sF))list.add(0);
        int index=0;
        for(int i=p.length();i<s.length();i++)
        {
            sF[s.charAt(index)-'a']--;
            sF[s.charAt(i)-'a']++;
            index++;
             if(Arrays.equals(pF, sF))list.add(index);
        }
        return list;
        
        
    }
}
