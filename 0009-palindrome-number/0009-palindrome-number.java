class Solution {
    public boolean isPalindrome(int x) {
        StringBuilder number = new StringBuilder();
        number.append(x);

        return number.toString().contentEquals(number.reverse());
    }
}