class Solution {
    public int brokenCalc(int startValue, int target) {
     
        // In this Qurestion all values are always positive
        // case 1 when both values are equals
        // case 2- when target value less then startValue
        // case 3- When target value greater than startValue
        
        
        /* In this question the ans will come when
        - multiply the subtrcat then multiply
         2- subtract then mul then sub */
        // Isme Recursion lgega
        
          
        if(startValue>=target) return startValue-target;
        else if(target%2==0)
            return 1+ brokenCalc(startValue,target/2);
        else
            return 1+brokenCalc(startValue,target+1);
    }
}
