class Solution {
    public String addBinary(String a1, String b1) {
        StringBuilder str= new StringBuilder();
        String ans="";

        int i= a1.length()-1;
        int j= b1.length()-1;
        int carry=0;
          int sum=0;

        while(i>=0 && j>=0)
        {
            int a= Character.getNumericValue(a1.charAt(i));
            int b= Character.getNumericValue(b1.charAt(j));

            sum=a+b;
            sum=(sum+carry)%2;
            char c=(char)(sum+'0');    
            carry=(a+b+carry)/2;
            ans=c+ans;
            i--;
            j--;
        }

        System.out.println("ANS "+ans);
        
        while(i>=0)
        {
            int a= Character.getNumericValue(a1.charAt(i));
            sum=(a+carry)%2;
            carry=(a+carry)/2;
        char c=(char)(sum+'0');
        ans=c+ans;
            i--;
        }
         while(j>=0)
        {
            int b= Character.getNumericValue(b1.charAt(j));
            sum=(b+carry)%2;
            carry=(b+carry)/2;
             char c=(char)(sum+'0');
        ans=c+ans;
            j--;
        }

        System.out.println("ANS "+ans);

        if(carry>0) ans='1'+ans;
        return ans;


    }
}
