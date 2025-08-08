class Solution {
    public String decodeString(String s) {
        
         Stack<Integer> countStack = new Stack<>();
        Stack<String> stringStack = new Stack<>();
        String currentString = "";
        int k = 0;

        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                k = k * 10 + (ch - '0');  // Handle multi-digit numbers
            } else if (ch == '[') {
                countStack.push(k);               // Push the repeat count
                stringStack.push(currentString);  // Push the string so far
                currentString = "";               // Reset for new block
                k = 0;                             // Reset count
            } else if (ch == ']') {
                int repeatTimes = countStack.pop();
                String lastString = stringStack.pop();
                String temp = "";
                for (int i = 0; i < repeatTimes; i++) {
                    temp += currentString;       // Repeat the current string
                }
                currentString = lastString + temp; // Combine with previous string
            } else {
                currentString += ch;             // Build the current string
            }
        }

        return currentString;
    }
}
