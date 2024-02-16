class Solution {
    public void moveZeroes(int[] num) {
        
        Boolean check = true;
        int pos=-1;
        for(int i=0;i<num.length;i++)
        {
           if(num[i]!=0 && pos>=0)
           {
               num[pos]=num[i];
               num[i]=0;
               pos++;
           }
            else if(check==true && num[i]==0)
            {
                pos=i;
                check=false;
            }
        }
        
    }
}
