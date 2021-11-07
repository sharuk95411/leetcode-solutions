class Solution {
    public int countVowelSubstrings(String str) {
        
        int count=0;
        HashSet<Character> hash = new HashSet<Character>();
         int n = str.length();
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (isVowel(str.charAt(j)) == false)
                    break;
 
            
                hash.add(str.charAt(j));

                if (hash.size() == 5)count++;
            }
            hash.clear();
        }
        return count;
    }
     public boolean isVowel(char x) {
        return (x == 'a' || x == 'e' || x == 'i'
                || x == 'o' || x == 'u');
    }
}
