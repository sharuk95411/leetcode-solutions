// this is O(n)
/* isme left diagonal to simple nikl jyga but right me ek apttern hta h jisme row increase
and column decrease ho rha h */
class Solution {
    public int diagonalSum(int[][] arr) {
         int l= arr.length;
        int sum=0;
        int m=arr.length-1;
        int n=0,j=0;
            for(int i=0;i<l;i++)
            {
                
                sum= sum+arr[i][j];
                j++;
                
                
                    sum= sum+arr[i][m];
                    m--;
                
            }
        
        if(l%2==0)
        {
             return(sum);
        }
        else
        {
        
            sum= sum-arr[l/2][l/2];
            return sum;
            }
        
    }
}
