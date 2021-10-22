class Solution {
     // Brute force- each string ka permutation nikalte jana and check krna shows TLE;
    // TC O(size of arr*length of s2);
    // Logic -TECHDOSE and its easy .
    // Hint- Anagram + Hastable ka use hga+ sliding window
    
    public boolean checkInclusion(String s1, String s2) {
    
        if(s1.length()>s2.length()) return false;
        int arr[]= new int[26];
        int brr[]= new int[26];
        
        for(int i=0;i<s1.length();i++)
        {
            arr[s1.charAt(i)-'a']++;
        }
        
        
    //  System.out.println(Arrays.toString(arr));
        for(int j=0;j<s1.length();j++)
            {
                brr[s2.charAt(j)-'a']++;
            }
      //  System.out.println(Arrays.toString(brr));
        int temp=0;
        
        for(int i=s1.length();i<=s2.length();i++)
        {
           if(Arrays.equals(arr,brr)) return true;
            
            
            {
                if(i==s2.length()) break;
                brr[s2.charAt(temp)-'a']--;
                    // System.out.println(Arrays.toString(brr));
                temp++;
                brr[s2.charAt(i)-'a']++;
                 //    System.out.println(Arrays.toString(brr));
                
            }
        }
        return false;
        

        
    }
}
