class Solution {
    public int[] plusOne(int[] digits) {
       int n = digits.length;

        // Traverse from the last digit
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++; // Just add 1 if less than 9
                return digits; 
            }
            digits[i] = 0; // If 9, make it 0 and continue carry
        }

        // If all digits were 9, we need a bigger array
        int[] result = new int[n + 1];
        result[0] = 1; 
        return result;
    }
}