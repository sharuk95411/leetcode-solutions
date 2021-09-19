class Solution {
    public int finalValueAfterOperations(String[] arr) {
        int ans= 0;
        for(int i=0 ;i<arr.length;i++)
        {
            String s= arr[i];
            if(s.charAt(0)=='+') ans= ans+1;
            else if(s.charAt(0)=='-') ans= ans-1;
            else if(s.charAt(s.length()-1)=='+') ans= ans+1;
            else ans= ans-1;
        }
        return ans;
        
    }
}
