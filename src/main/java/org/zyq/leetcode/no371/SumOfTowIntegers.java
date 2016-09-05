/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package org.zyq.leetcode.no371;

import static org.zyq.leetcode.util.LeetUtil.output;

/**
 * Calculate the sum of two integers a and b,
 * but you are not allowed to use the operator + and -.
 *
 * Example:
 * Given a = 1 and b = 2, return 3.
 *
 * @author yuqing.zyq
 */
public class SumOfTowIntegers {
    public int getSum(int a, int b) {
        while  (b != 0) {
            int carry = (a & b) << 1;
            a = a ^ b;
            b = carry;
        }

        return a;
    }

    public int getSumRecursive(int a, int b) {
        int carry = (a & b) << 1;
        a = a ^ b;
        if (carry != 0) {
            a = getSum(a, carry);
        }

        return a;
    }

    public static void main(String[] args) {
        SumOfTowIntegers soti = new SumOfTowIntegers();

        output(4, 0, soti.getSum(4, 0));
        output(4, 0, soti.getSumRecursive(4, 0));

        output(4, 5, soti.getSum(4, 5));
        output(4, 5, soti.getSumRecursive(4, 5));

        output(0, 0, soti.getSum(0, 0));
        output(0, 0, soti.getSumRecursive(0, 0));

        output(1, -1, soti.getSum(1, -1));
        output(1, -1, soti.getSumRecursive(1, -1));

        output(4, -1, soti.getSum(4, -1));
        output(4, -1, soti.getSumRecursive(4, -1));

        output(-4, -5, soti.getSum(-4, -5));
        output(-4, -5, soti.getSumRecursive(-4, -5));
    }
}
