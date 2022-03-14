class Solution {
    public String simplifyPath(String path) {
       
        String p[]= path.split("/");
        StringBuilder str= new StringBuilder();
        
        Stack<String>stack= new Stack<>();
        
        for(String temp :p)
        {
            if(!stack.isEmpty() && temp.equals("..")) stack.pop();
            else if((!temp.equals(""))&& (!temp.equals(".") && !temp.equals("..")))
                stack.push(temp);
        }
        
        System.out.println(stack.size());
        if(stack.isEmpty()) return "/";
        
        
        
        while(stack.size()>0)
        {
            str.insert(0,stack.pop()).insert(0,"/");
        }
         // str.insert(1,stack.pop());
       
        // str.reverse();
        
        return str.toString();
    }
}
