
   class Solution {

      Integer arr[][];

    public int minDistance(String w1, String w2) {
         arr= new Integer[w1.length()][w2.length()];
        return A(w1,w2,0,0);
    }

    public int A(String w1,String w2,int i ,int j)
    {
        if(j>=w2.length())  return w1.length()-i;
        else if (i>=w1.length())  return w2.length()-j;
        else if (arr[i][j]!=null) return arr[i][j];
        
   int way1=Integer.MAX_VALUE,way2=Integer.MAX_VALUE,way3=Integer.MAX_VALUE;
        if(w1.charAt(i)==w2.charAt(j))
        {
              return A(w1,w2,i+1,j+1);
        }
        else
        {
        way1 = 1+A(w1,w2,i,j+1);  // insert 
        way2 = 1+A(w1,w2,i+1,j);  // delete
        way3= 1+A(w1,w2,i+1,j+1);  // replace
        }
       
        
    
        return arr[i][j]= Math.min(way1, Math.min(way2,way3));
    }
}
