class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
        
        Arrays.sort(arr);
        List<List<Integer>>ans= new ArrayList<>();
       int i=0;

        while(i<arr.length-2)
        {
            if(i>0 && arr[i]==arr[i-1])
            {
                i++;
                continue;
            }
           int j=i+1;
           int k= arr.length-1;
           while(j<arr.length-1 && j<k)
           {
              int sum= arr[i]+arr[j]+arr[k];
              if(sum==0)
              {
                 List<Integer>inner = new ArrayList<>();
                 inner.add(arr[i]);
                 inner.add(arr[j]);
                 inner.add(arr[k]);
                    ans.add(new ArrayList<>(inner));
        
                j++;
                k--;
                while(j<k && arr[j]==arr[j-1]) j++;
                while(k>j && arr[k]==arr[k+1])k--;
              }
              else if(sum<0)
              {
                   j++;
              }
              else
              {
                k--;
              }
           }
           i++;
        }
        return ans;
    }
}
