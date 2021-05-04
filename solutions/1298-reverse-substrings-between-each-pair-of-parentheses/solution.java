// logic from discussion and its good there is many thing which i learn from this code.
// Try self next Time
class Solution {
    public String reverseParentheses(String s) {
        Stack<StringBuilder>stack= new Stack<>();
        StringBuilder sb= new StringBuilder();
        char ch[]= s.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]=='(')
            {
                stack.push(sb);
                sb= new StringBuilder();
            }
            else if (ch[i]==')')
            {
                String str= sb.reverse().toString();
                sb= stack.pop();
                sb.append(str);
            }
            else
            {
                sb.append(ch[i]);
            }
        }
        return sb.toString();
    }
}
