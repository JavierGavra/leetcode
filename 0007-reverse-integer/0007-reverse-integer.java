class Solution {
    public int reverse(int x) {
        StringBuilder number = new StringBuilder();
        number.append(x);
        
        number.reverse();
        
        if (number.charAt(number.length() - 1) == '-') {
            number.deleteCharAt(number.length() - 1);
            number.insert(0, '-');
        }
        
        try {
            return Integer.parseInt(number.toString());
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}