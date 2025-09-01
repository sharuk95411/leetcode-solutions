class Solution {
    
    Boolean memo[];
    public boolean canJump(int[] arr) {
        
        memo= new Boolean[arr.length];
        return A(arr,0);
        
    }
    public boolean A(int arr[],int index)
    {
        if(index>=arr.length) return false;
        else if(index==arr.length-1) return true;

    if(memo[index]!=null) return memo[index];
        int steps= arr[index];
        for(int i=1;i<=steps;i++)
        {
            if(A(arr,i+index)) 
            {
                     return memo[index]=true;
            }
            
        }
        return memo[index]=false;
    }
}
