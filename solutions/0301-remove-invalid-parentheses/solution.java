class Solution {
    public List<String> removeInvalidParentheses(String s) {
        
        int no= A(s);
        List<String>ans= new ArrayList<>();
         if (s == null) return ans;
          Set<String> check = new HashSet<>();
        B(s,no,ans,check);
        return ans;
    }
    public int A(String str)
	{
		Stack<Character> s= new Stack<>();
        
		for(int i=0;i<str.length();i++)
		{
            char c=str.charAt(i);
			if(c=='(')
			{
				s.push(c);
			}
			else if(c==')')
			{
				
				 if(s.size()==0)
				{
					s.push(c);
				}
				else if(s.peek()=='(')
				{
					s.pop();
				}
				else if(s.peek()==')')
				{
					s.push(c);
				}
			}
		}
		return s.size();
		
	}
    public void B(String str,int no, List<String>ans,Set<String>check)
	{
		if(no==0)
		{
			int newno= A(str);
			if(newno==0)
			{
				if(!ans.contains(str))
				{
                    check.add(str);
					ans.add(str);
				}
			}
		}
		for(int i=0;i<str.length();i++)
		{
		String left= str.substring(0,i);
			String right=str.substring(i+1);
            if(!check.contains(left+right))
            {
                check.add(left+right);
			B(left+right,no-1,ans,check);
            }
			
			
		}
	}

}
