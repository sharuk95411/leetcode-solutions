class Solution {

    public int minSteps(int n) {
        if(n==1) return 0;

        return 1+ A(1,1,n);
    }

    public int A (int currA,int clipA, int n)
    {
        if(currA>n) return 10000;
        if(currA==n) return 0;

         int paste= 1+A(currA+clipA,clipA,n);
        int copyAndPaste= 1+1+A(currA+currA,currA,n);
       
        return Math.min(copyAndPaste,paste);
    }
}
