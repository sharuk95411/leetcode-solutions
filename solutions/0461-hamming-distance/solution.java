class Solution {
    public int hammingDistance(int x, int y) {
        
        int count=0;
        int temp=1;
        int op=1;
        
        for(int i=31;i>=0;i--)
        {
            int a= temp&x;
            int b= temp&y;
            if(a!=b) count++;
            temp= temp<<1;
            
            
        }
        return count;
    }
}
