// Use two Integer type stack.
// Logic-codebix but TC is not good when its under O(n)
// https://leetcode.com/problems/valid-parenthesis-string/discuss/107566/Java-12-lines-solution-backtracking isne recusrion se kia h jo ki approach achi h but TL exceed a ri h 
/* This is Optimal Solution Hint- One Stack used and its Char Type
Stack<Character> stk = new Stack<>();
        int scount = 0;
        for(char c : s.toCharArray()) {
            if(c == '(') stk.push(c);
            else {
                if(c == ')' && !stk.isEmpty()) stk.pop();
                else if(c == ')' && scount > 0) scount--;
                else if(c  == ')') return false;
                else {
                    scount++;
                    if(!stk.isEmpty()) {
                        stk.pop();
                        scount++;
                    }
                }
            }
        }
        return stk.isEmpty();
*/
class Solution {
    public boolean checkValidString(String s) {
     if(s.length()==0) return true;
        Stack<Integer>s1= new Stack<>();
       Stack<Integer>s2= new Stack<>();
       char c[]= s.toCharArray();
       for(int i=0;i<c.length;i++)
       {
          if(c[i]=='(') s1.push(i);
          else if(c[i]==')')
          {
              if(s1.size()>0) s1.pop();
              else if(s2.size()>0) s2.pop();
              else return false;
          }
          else
          s2.push(i);
       }
       while(s1.size()>0 && s2.size()>0)
       {
           Integer a= s2.pop();
           if(a>s1.peek()) s1.pop();
           
       }
       if(s1.size()>0) return false;
       else return true;
    }
}
