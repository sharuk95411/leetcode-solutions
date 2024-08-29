class Solution {
    public boolean exist(char[][] arr, String s) {
        
        boolean bu[][]= new boolean [arr.length][arr[0].length];
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                   char c= arr[i][j];
                   if(c==s.charAt(0))
                   {
                        boolean b= A(arr,s,i,j,0,bu);
                        if(b)return true;
                   }
            }
        }
        return false;
    }

    private boolean A(char arr[][],String s,int i,int j,int index,boolean isVisit[][])
    {
        if (i<0 || i>=arr.length || j<0 || j>=arr[0].length)
        return false;
        if(isVisit[i][j]==true) return false;

        char c= s.charAt(index);
        if(c==arr[i][j] && index==s.length()-1) return true;
        else if(c==arr[i][j])
        {
             isVisit[i][j]=true;
            Boolean a = A(arr,s,i,j+1,index+1,isVisit);
          Boolean b=  A(arr,s,i+1,j,index+1,isVisit);
           Boolean m = A(arr,s,i,j-1,index+1,isVisit);
           Boolean n= A(arr,s,i-1,j,index+1,isVisit);
           isVisit[i][j]=false;
           return((a||b)||(m||n));
        }
        else 
        return false;
        

    }
}
