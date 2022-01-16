class Solution {
    int visit[];
    public boolean canJump(int[] nums) {
        
        
        if(nums.length==0) return false;
        if(nums[0]==0&& nums.length==1) return true;
        
        visit= new int[nums.length];
        
          int a= A(nums,0);
        if(a==1) return true;
        else return false;
           
    }
    
    private int A(int arr[],int index)
    {
        if(index==arr.length-1)
        {
            return 1;
        }
        if(index>=arr.length)
        {
            visit[index]=-1;
            return -1;
        }
        
        
        if(arr[index]==0) 
        {
            visit[index]=-1;
            return -1;
        }
        if(visit[index]!=0) return visit[index];
        int start= index;
        int end= arr[index];
        for(int i=1;i<=end;i++)
        {
            if(A(arr,i+start)==1)
            {
                visit[i]=1;
                return 1;
            }
        }
        return visit[index] =-1;
    }
    
}
