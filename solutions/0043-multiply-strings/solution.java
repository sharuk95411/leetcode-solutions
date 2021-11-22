class Solution {
    
    // Bht pyara Question h logic Pepcoding 
    // Isme Agar negative No ho ye case GFG pr dia h jisko kr dia h to use b TYN
    public String multiply(String num1, String num2) {
        if(num1.equals("0") || num2.equals("0")) return "0";
        
        int i=num1.length();
        int j= num2.length();
    
        int ans[]= new int[i+j];
        i=i-1;
        j=j-1;
        int pf= 0;
        
        while(i>=0)
        {
            int val1= num1.charAt(i)-'0';
            i--;
            int carry=0;
            int k= ans.length-1-pf;
            j=num2.length()-1;
            while(j>=0 || carry>0)
            {
                int val2= j>=0 ? num2.charAt(j)-'0': 0;
                int product= val1*val2+carry+ans[k];
               ans[k]= product%10;
                carry= product/10;
                k--;
                j--;
                
            }
            pf++;
        }
   //     System.out.println(Arrays.toString(ans));
    //    return "1";
        String res="";
        boolean flag=false;
    for(int a: ans)
    {
        if(a==0 && flag==false) continue;
        else
        {
            res+=a;
            flag=true;
        }
    }
        return res;
        
    }
}
