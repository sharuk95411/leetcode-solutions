class Solution {
    public String addBinary(String a, String b) {
        StringBuilder ans= new StringBuilder();

int i=a.length()-1;
int j= b.length()-1;

int sum=0;
int carry =0;
int l= Math.max(i,j);

for(int k=l;l>=0;l--)
{
    int n= (i<0)? 0: Character.getNumericValue(a.charAt(i));
    int m= (j<0)? 0: Character.getNumericValue(b.charAt(j));  
     System.out.println("N "+n +" M "+m);
    sum= carry+m+n;
      if(sum>1)
      {
          ans.append(String.valueOf(sum%2));
          carry=1;
      }
      else
      {
          ans.append(String.valueOf(sum));
          carry=0;
      }
      i--;
      j--;
}

if(carry>0) ans.append("1");
return ans.reverse().toString();
    }
}
