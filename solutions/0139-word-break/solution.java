// class Solution {
//     Map<String,Boolean>map= new HashMap<>();
//     public boolean wordBreak(String s, List<String> wordDict) {
        
//         if(wordDict.contains(s)) return true;
//         return A(s,wordDict);
        
//     }
//     public boolean A(String s, List<String>list)
//     {
//         if(s.length()==0)
//         {
//            return true;
//         } 
//         if(map.containsKey(s)) return true;
//         int i=1;
//         for(i=1;i<=s.length();i++)
//         {
//             if(list.contains(s.substring(0,i)))
//             {
//                 System.out.println("OK");
//                 map.put(s.substring(0,i),true);
//                 if(A(s.substring(i,s.length()),list)) return true;
//             }
           
//         }
       
//         return false;
//     }
// }
class Solution {
 Map<String,Boolean>map= new HashMap<>();
    public boolean wordBreak(String s, List<String> wordDict) {
        
        
        if(wordDict.contains(s)) return true;
        if(map.containsKey(s)) return map.get(s);
        
        for(int i=1;i<=s.length();i++)
        {
            String left= s.substring(0,i);
    
            if(wordDict.contains(left) && wordBreak(s.substring(i),wordDict))
            {
                map.put(s,true);
                        System.out.println("OK");
                return true;
            }
            else map.put(s,false);
        }
        return false;
    }
}
