package leetcode.problems.lengthOfLastWord;

public class Solution {
    public int lengthOfLastWord(String s) {
        String[] str = s.split(" ");
        if (str.length == 0) {
            return 0;
        }
        return str[str.length -1].length();
    }
}
