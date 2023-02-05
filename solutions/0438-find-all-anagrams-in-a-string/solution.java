class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer>list= new ArrayList<>();
        if(p.length()>s.length()) return list;

        int arr1[]= new int[26];
        int arr2[]= new int[26];

        for(int i=0;i<p.length();i++)
        {
            arr1[p.charAt(i)-'a']++;
        }
        for(int i=0;i<p.length();i++)
        {
            arr2[s.charAt(i)-'a']++;
        }
        if(Arrays.equals(arr1,arr2))list.add(0);
        int j=0;
        for(int i=p.length();i<s.length();i++)
        {
            arr2[s.charAt(j)-'a']--;
            arr2[s.charAt(i)-'a']++;
            if(Arrays.equals(arr1,arr2))list.add(j+1);
            j++;
        }
        return list;
      
    }
}
