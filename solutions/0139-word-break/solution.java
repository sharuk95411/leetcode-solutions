class Solution 
{
    Boolean arr[][];
    public boolean wordBreak(String s, List<String> wordDict) {
        arr= new Boolean[s.length()][s.length()];
        return A(0,0,s,wordDict);
        
    }

    public boolean A(int i,int j, String s, List<String>wordDict)
    {
            if(j>=s.length()) return false;
           if(arr[i][j]!=null) return arr[i][j];
            String temp = s.substring(i,j+1);
            if(wordDict.contains(temp))
            {
                if(j+1==s.length())
                {
                    return true ;
                }
               if(A(j+1,j+1,s,wordDict))
               return arr[i][j]=true;
        
            }
            return  arr[i][j]=A(i,j+1,s,wordDict);

    }

}
