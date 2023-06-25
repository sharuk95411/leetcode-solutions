class Solution {
    public int characterReplacement(String s, int k) {
       int[] arr = new int[26];  //Will be used to store the number of each char in current window
        
        int windowStartIndex = 0;       //Starting index of the window
        int windowEndIndex = 0;         //Ending index of the window
        
        int maxNumOfSameCharsInCurrentWindow = 0;           //Max num of same chars in current window
        
        int ans = 0;                            //Max length of possible repetitive subsequence
        
        for(windowEndIndex = 0; windowEndIndex<s.length(); windowEndIndex++){  //Window will keep expanding to right in each step
            char newChar = s.charAt(windowEndIndex);               //The newly added char to right because of window expansion
            
            arr[newChar-'A']++;                                         //Increment the new char count
            
            //Check and update max number of same chars in current window
            maxNumOfSameCharsInCurrentWindow = Math.max(maxNumOfSameCharsInCurrentWindow, arr[newChar-'A']);
            
            //Number of other (non-max char) in current window = Window size - num of max chars
            int numOfOtherChars = (windowEndIndex - windowStartIndex + 1) - maxNumOfSameCharsInCurrentWindow;
            
            if(numOfOtherChars<=k){             //Valid window, where the num of max-chars can be maximized by filling gaps
                
                //Since we can fill the gaps, the whole window can be filled with max-char. Check and update maxRepSubseqLen
                ans = Math.max(ans, windowEndIndex - windowStartIndex + 1);    
            }
            else {       //Invalid window. Slide one step to right
                
                //Decrease count of left char, since we are excluding it from window
                arr[s.charAt(windowStartIndex)-'A']--;    
                
                //Move start of window to one step right
                windowStartIndex++;
                
            }
        }
        
        return ans;
    }
}
