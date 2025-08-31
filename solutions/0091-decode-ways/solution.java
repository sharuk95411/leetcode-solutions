class Solution {
    public int numDecodings(String s) {

         int[] memo = new int[s.length()];
        Arrays.fill(memo, -1); // initialize with -1 (not computed yet)
        return decode(s, 0, memo);
    }

    private int decode(String s, int i,int memo[]) {
        // Base case: reached the end successfully
        if (i == s.length()) {
            return 1;
        }
    
     // If already computed, return stored result
        if (memo[i] != -1) return memo[i];

        // A leading zero cannot form a valid code
        if (s.charAt(i) == '0') {
            return 0;
        }

      int way1=0,way2=0;
        // Option 1: take a single digit
        way1 = decode(s, i + 1,memo);

        // Option 2: take two digits if valid (<= 26)
        if (i + 1 < s.length()) {
            int num = Integer.parseInt(s.substring(i, i + 2));
            if (num <= 26) {
                way2= decode(s, i + 2,memo);
            }
        }

        return memo[i]= way1+way2;
    }
}

