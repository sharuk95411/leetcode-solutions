class Solution {
    Boolean check[];
    public boolean canJump(int[] arr) {
        
         check= new Boolean[arr.length+1];
        if(arr.length==1) return true;
        return A(0,arr);
    }
    public boolean A(int i,int arr[])
    {
        if(i>=arr.length-1)
        {
            return true;
        }
        if(check[i]!=null) return check[i];
        int steps= arr[i];
        boolean b=false;
        for(int j=1;j<=steps;j++)
        {
            if(A(i+j,arr))
            {
                b=true;
                break;
            }
            
        }
        return check[i]= b;
    }
}
