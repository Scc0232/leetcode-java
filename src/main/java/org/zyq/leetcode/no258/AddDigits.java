/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package org.zyq.leetcode.no258;

import static org.zyq.leetcode.util.LeetUtil.output;

/**
 * Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.
 *
 * For example:
 * Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.
 *
 * @author yuqing.zyq
 */
public class AddDigits {
    public int addDigits(int num) {
        return (num - 1) % 9 + 1;
    }

    public static void main(String[] args) {
        AddDigits ad = new AddDigits();

        output(38, ad.addDigits(38));
        output(1234, ad.addDigits(1234));
        output(9876, ad.addDigits(9876));
        output(55555, ad.addDigits(55555));
    }
}
