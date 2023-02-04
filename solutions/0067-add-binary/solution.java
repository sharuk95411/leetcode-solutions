class Solution {
    public String addBinary(String a, String b) {
        StringBuilder ans= new StringBuilder();
        int i=a.length()-1;
        int j= b.length()-1;
        int carry=0;
        int sum=0;
     int n1=0;
     int n2=0;
        while(i>=0 || j>=0)
        {
           if(i>=0)  n1= a.charAt(i)-'0';
           else n1=0;
           if(j>=0)   n2= b.charAt(j)-'0';
           else n2=0;
           sum= n1+n2+carry;
           if(sum>1) carry =1;
           else carry=0;
           ans.append(sum%2);
           i--;
           j--;
        }
        if(carry>0)ans.append(carry);
        return ans.reverse().toString();
    }
}
