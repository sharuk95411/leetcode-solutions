class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        
        
        List<Integer>list= new ArrayList<>();
        int i=0;
        int j= arr.length-1;
        while(j-i>=k)
        {
            int a= Math.abs(arr[i]-x);
            int b = Math.abs(arr[j]-x);

            if(a==b)
            {
                  if(arr[i]<arr[j])
                  j--;
                  else i++;
            }
            else if (a>b)
            {
                i++;
            }
            else j--;
        }
        while(i<=j)
        {
        list.add(arr[i]);
        i++;
        }
        return list;
        
    }
}
