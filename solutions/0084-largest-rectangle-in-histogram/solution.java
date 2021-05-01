// Beutiful Question kai cheze sikhne ko mili h like Monotonic Stack .
// Logic- Pepcoding
// Isme jo loop chalaya gya h wo left to right and right to left kb chlega wo btatae h
// jb hme right me next smller eleement ki index nikalni h to obvious si bt h last me hme kuch ni milega to last ki value ko pehle set kr do so islye isme loop right to left chla h
// ase hi jb left boundary me just left smaller element nikalna h to jo start me hga uske left me koi lement hga hi ni to phle usko set kr do so islye isme left to right loop hga.
// isme stack me hm index push krte  h left smaller element ki and right smaller element ki na ki unki value.
//  ye monotonic stack k upr based ques h so TC is O(n).
// isko khd se lgana taki loop k piche ka intution aa jye kse loop kb chlega.
class Solution {
    public int largestRectangleArea(int[] arr) {
        int rb[]= new int[arr.length]; // rb mean right boundary right me smaller element ki index nikalege.
         Stack<Integer>s= new Stack<>();
         s.push(arr.length-1);
       rb[arr.length-1]= arr.length;
        for(int i=arr.length-2;i>=0;i--)
        {
         while(s.size()>0 && arr[s.peek()]>=arr[i])
         {
             s.pop();
         }
            if(s.size()==0) rb[i]= arr.length;
            else rb[i]= s.peek();
            
            s.push(i);
        }
        
        
        
        
 int lb[]= new int[arr.length]; // lb mean left boundary left me smaller element ki index nikalege.
            Stack<Integer>s1= new Stack<>();
        s1.push(0);
        lb[0]= -1;
        for(int i=1;i<arr.length;i++)
        {
            while(s1.size()>0 && arr[s1.peek()]>=arr[i])
            {
                s1.pop();
            }
            if(s1.size()==0) lb[i]= -1;
            else lb[i]= s1.peek(); 
            
            s1.push(i);
        }
        
        
        
        
        int maxarea=0;
        for(int i=0;i<arr.length;i++)
        {
            int width = rb[i]-lb[i]-1;
            int area= width*arr[i];
            if(area>maxarea)
            {
                maxarea=area;
            }
        }
        return maxarea;
        
    }
}
