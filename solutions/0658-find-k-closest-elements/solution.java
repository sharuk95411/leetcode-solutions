class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        
        List<Integer>ans= new ArrayList<>();
        int i=0;
        int j=arr.length-1;
        while(j-i>=k)
        {
            int a =Math.abs(arr[i]-x);
            int b =Math.abs(arr[j]-x);
            if(a==b)
                j--;
            else if(a>b)i++;
            else j--;
        }
        while(i<=j)
        {
            ans.add(arr[i]);
            i++;
        }
        return ans;
    }
}
