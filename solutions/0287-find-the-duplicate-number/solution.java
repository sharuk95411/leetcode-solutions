class Solution {
    public int findDuplicate(int[] arr) {

      

        int i=0;
        while(i<arr.length)
        {
            int index= Math.abs(arr[i]);
            if(arr[index]<0) return index;
            else
            {
                arr[index]=-arr[index];
                i++;
            }
        }
        


        return 5;
    }
}
