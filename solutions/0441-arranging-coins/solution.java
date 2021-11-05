class Solution {
    public int arrangeCoins(int n) {
        return (int)(Math.sqrt(2 * (long)n + 0.25) - 0.5); // cast "n" to "long" to avoid integer overflow
    }
}
