class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;

        if (x < 10) return true;

        char[] number = (x + "").toCharArray();

        final int halfLength = number.length / 2;
        for (int i = 0; i < halfLength; i++) {
            if (number[i] != number[number.length - i - 1]){
                return false;
            }
        }

        return true;
    }
}