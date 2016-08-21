package org.zyq.leetcode.no344;

import static org.zyq.leetcode.util.LeetUtil.output;

/**
 * 344. Reverse String
 *
 * Write a function that takes a string as input and returns the string reversed.
 *
 * Example:
 * Given s = "hello", return "olleh".
 *
 * @author yuqing.zyq
 */
public class ReverseString {

    public String reverseString(String origin) {
        if (origin == null || origin.length() == 0) {
            return "";
        }

        char[] chars = origin.toCharArray();
        int length = origin.length();
        for (int i = 0, max = length / 2; i < max; ++i) {
            char tmp = chars[i];
            chars[i] = chars[length - 1 - i];
            chars[length - 1 - i] = tmp;
        }

        return String.valueOf(chars);
    }

    public static void main(String[] args) {
        ReverseString rs = new ReverseString();

        output(null, rs.reverseString(null));
        output("", rs.reverseString(""));
        output("   ", rs.reverseString("   "));
        output("null", rs.reverseString("null"));

        output("a", rs.reverseString("a"));
        output("ab", rs.reverseString("ab"));
        output("abc", rs.reverseString("abc"));
        output("abcd", rs.reverseString("abcd"));

    }
}
