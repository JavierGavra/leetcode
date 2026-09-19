class Solution {
    public int lengthOfLongestSubstring(String s) {
        String result = "";
        char currChar;
        int max = 0;

        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                currChar = s.charAt(j);
                if (result.contains(Character.toString(currChar))) {
                    result = "";
                    break;
                }

                result = s.substring(i, j + 1);
                max =  Math.max(max, result.length());
            }
        }

        return max;
    }
}