class Solution {
  
    public long countVowels(String s) {
          long count=0;
        String vowel="aeiou";
        long n= s.length();
        for(int i=0;i<n;i++)
        {
            if(vowel.indexOf(s.charAt(i))>=0)
            {
                count+= (n-i)*(i+1);
            }
        }
        return count;
}
}
