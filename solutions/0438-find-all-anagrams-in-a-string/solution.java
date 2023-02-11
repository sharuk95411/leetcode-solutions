class Solution {
    public List<Integer> findAnagrams(String s, String p) {

List<Integer>list= new ArrayList<>();
        if(p.length()>s.length()) return list;
        int p1[]= new int[26];

        for(int i=0;i<p.length();i++)
        {
            p1[p.charAt(i)-'a']++;
        }
        int s1[]= new int[26];
  for(int i=0;i<p.length();i++)
  {
      s1[s.charAt(i)-'a']++;
  }
  if(Arrays.equals(s1,p1)) list.add(0);

int temp=0;
  for(int i=p.length();i<s.length();i++)
  {
           s1[s.charAt(temp)-'a']--;
           s1[s.charAt(i)-'a']++;
           if(Arrays.equals(s1,p1)) list.add(temp+1);
           temp++;
  }
  return list;
    }
}
