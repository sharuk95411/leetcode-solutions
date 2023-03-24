class Solution {
    public int[] intersect(int[] arr1, int[] arr2) {

     Arrays.sort(arr1);
     Arrays.sort(arr2);   
     List<Integer>list= new ArrayList<>();
    int n= Math.min(arr1.length,arr2.length);
int i=0,j=0;
        while(i<arr1.length && j<arr2.length)
        {
            if(arr1[i]==arr2[j])
            {
                list.add(arr1[i]);
                i++;
                j++;
            }
            else if(arr1[i]<arr2[j])
            {
                i++;
            }
            else j++;
        }
        int ans[]= new int[list.size()];

        for(int k=0;k<list.size();k++)
        {
            ans[k]= list.get(k);
        }
        return ans;
    }
}
