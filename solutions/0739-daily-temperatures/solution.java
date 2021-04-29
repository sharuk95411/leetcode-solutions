// Hint- Isme index k sth khela gya h agr tm dhyn dena iske solution pr
// This is O(n) jo copy paste kia h isko  khd se next time try krna and iska O(n2) me mne khd se submit kr chuka hu but o(n) me possible h jb to yhi krna best rhega
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
