class Solution {
    public int reverse(int x) {
        String number = x + "";
        String result = "";

        char[] digits = number.toCharArray();

        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] == '-') {
                result = digits[i] + result;
                break;
            }

            result += digits[i];
        }

        try {
            return Integer.parseInt(result);
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}