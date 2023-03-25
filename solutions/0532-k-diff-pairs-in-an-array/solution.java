class Solution {
    public int findPairs(int[] arr, int k) {
        HashMap<Integer,Integer>h= new HashMap<>();

        for(int i =0;i<arr.length;i++)
        {
               h.put(arr[i],i);
        }
        int ans=0;
        for(int i=0;i<arr.length;i++)
        {
              int no= arr[i]+k;
              if(h.containsKey(no) && h.get(no)!=i)
              {
                  ans++;
                  h.remove(no);
              }
        }
        return ans;
    }
}
