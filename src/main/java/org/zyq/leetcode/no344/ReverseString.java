/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package org.zyq.leetcode.no344;

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
    public static void reverse(String input) {
        String output = doReverse(input);
        System.out.printf("Input: \"%s\" , Output: \"%s\".\n", input, output);
    }

    private static String doReverse(String origin) {
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
        ReverseString.reverse(null);
        ReverseString.reverse("");
        ReverseString.reverse("   ");
        ReverseString.reverse("null");

        ReverseString.reverse("a");
        ReverseString.reverse("ab");
        ReverseString.reverse("abc");
        ReverseString.reverse("abcd");

    }
}
