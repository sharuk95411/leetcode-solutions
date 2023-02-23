class Solution {
    List<String>list= new ArrayList<>();
    public List<String> letterCombinations(String digits) {
        if(digits.length()==0) return list;
        String arr[]= {"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        A(arr,"",0,digits);
        return list;
    }

    public void A(String arr[],String ans,int index,String digits )
    {
        if(ans.length()==digits.length())
        {
            list.add(ans);
            return ;
        }
        //else if(index>=digits.length()) return;
        System.out.println("NUMERIC "+Character.getNumericValue(digits.charAt(index)));
        String s= arr[Character.getNumericValue(digits.charAt(index))-2];

        for(int i=0;i<s.length();i++)
        {
            ans= ans+String.valueOf(s.charAt(i));
            System.out.println("ANS  is "+ans);
            A(arr,ans,index+1,digits);
            ans=ans.substring(0,ans.length()-1);
            System.out.println("Removed "+ans);
        }
    }
}
