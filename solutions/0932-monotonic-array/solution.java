
class Solution {
    public boolean isMonotonic(int[] arr) {
        if(arr.length==1) return true;
        else
        {
            boolean incheck=false, decheck=false;
            for(int i=1;i<arr.length;i++)
            {
                if(arr[i]>arr[i-1]) // Increasing order check
                    incheck=true;
                if(arr[i-1]>arr[i]) // decresing order check
                       decheck= true;
                if(incheck==true && decheck==true) return false;
            }
            // if both are true mean array k elenments an to continously increse kr rhe h na hi decrese 
                     //  if(incheck==true && decheck==true) return false;
                   //    else return true;
            return true;
        }
    }
}
