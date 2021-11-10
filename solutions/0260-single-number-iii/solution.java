class Solution {
    public int[] singleNumber(int[] nums) {
      
     int temp=0;
        for(int a :nums)
        {
            temp=temp^a;
        }
        temp= temp & -temp;
        
        int x=0;
        int y=0;
        
        for(int a :nums)
        {
            if((temp & a)==0)
            {
                x=x^a;
            }
            else  y=y^a;
        }
        
        return new int[]{x,y};
    }
}
