class Solution {

    public List<Integer> partitionLabels(String s) {
        
      int arr[]= new int[26];

      for(int i=0;i<s.length();i++)
      {
               arr[s.charAt(i)-'a']= i;
      }
      int lastIndex=0;

      int j=-1;

      List<Integer>ans= new ArrayList<>();

      for(int i=0;i<s.length();i++)
      {
            lastIndex=Math.max(lastIndex,arr[s.charAt(i)-'a']);

            if(i==lastIndex)   // thats mean ye jo element h ab wo age nahi h yhi last h 
            {
                ans.add(i-j);
                lastIndex=0;
                j=i;
            }
      }
      return ans;

    }
}
