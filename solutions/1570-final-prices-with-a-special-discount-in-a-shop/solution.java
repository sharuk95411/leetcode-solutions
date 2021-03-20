class Solution {
    public int[] finalPrices(int[] arr) {
        
       int i=0,j=1;
        while(i<arr.length-1)
        {
            if(j==arr.length)
            {
                i++;
                j=i+1;
                continue;
            }
            if(j>i && arr[i]>=arr[j])
            {
                arr[i]= arr[i]-arr[j];
                i++;
                j=i+1;
                continue;
            }
            j++;
        }
        return arr;
        
    }
}
