class Solution {
    public int numberOfSubstrings(String s) {
        
        int arr[]=new int[3];

        int i =0;
        int j=0;

        int ans=0;

        while(j<s.length())
        {
            char c= s.charAt(j);
            arr[c-'a']++;
            if(j-i>=2)
            {
                if(check(arr))
                {
                    ans= ans+s.length()-j;
                    arr[s.charAt(i)-'a']--;
                    i++;
                    if(j-i>=2) 
                    {
                        arr[c-'a']--;
                        j--;
                    }
                }
            }
            j++;
        }
 return ans;
    }

    public boolean check(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==0) return false;
        }
        return true;
    }
  
}
  
