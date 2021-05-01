// Hint- Isme decreasing monotonic stack ka concept use hua h monotonic stck k bre me lead coding and ISHA GONUGUNTA ki vdio dekh lena idea lg jyga kha monotonic stack ka use hota h

// Monotonic Stack se solve krne pr TC reduce hokr O(n) ho jti h agr isko Brute Forse se kroge to TC O(n2) hgi so Monotonoc stack use krne se TC reduce ho jti h
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
            Stack<Integer> stack = new Stack<>();
    int[] ret = new int[temperatures.length];
    for(int i = 0; i < temperatures.length; i++) {
        while(!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
            int idx = stack.pop();
            ret[idx] = i - idx;
        }
        stack.push(i);
    }
    return ret;
        
    }
}
