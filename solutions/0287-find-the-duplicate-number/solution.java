class Solution {
    public int findDuplicate(int[] arr) {
               boolean b[]= new boolean[arr.length];
        int temp=-1;
        for(int i=0;i<arr.length;i++)
        {
            if(b[arr[i]]==true)
            {
                temp= arr[i];
            break;
            }
            b[arr[i]]= true;
        }
        return temp;
        
    }
}
