class Solution {
    boolean b[];
    public boolean canReach(int[] arr, int start) {
        
        b= new boolean[arr.length];
        return A(arr,start);
    }
    
    private boolean A(int arr[],int index)
    {
        if(index>=arr.length || index<0) return false;
        
        else if(b[index]==true ) return false;
        
        else if(b[index]==false)
        {
            b[index]=true;
            if(arr[index]==0) return true;
        }

        return (A(arr,index+arr[index]) || A(arr,index-arr[index]));
        
    }
}
