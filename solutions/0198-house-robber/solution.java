class Solution {
    Integer t[];
    public int rob(int[] arr) {
        t= new Integer [arr.length];
        return A(arr,0);
        
    }
    public int A(int arr[], int index)
    {
        if(index>=arr.length)
            return 0;
        
        if(t[index]!=null) return t[index];
        
        int stealCurrent= arr[index]+ A(arr,index+2);
        int skipCurrent= A(arr,index+1);
        
        return t[index] =Math.max(stealCurrent,skipCurrent);
    }
}
