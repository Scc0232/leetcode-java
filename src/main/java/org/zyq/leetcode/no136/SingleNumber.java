/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package org.zyq.leetcode.no136;

import static org.zyq.leetcode.util.LeetUtil.output;

/**
 * Given an array of integers, every element appears twice except for one.
 * Find that single one.
 *
 * Note:
 * Your algorithm should have a linear runtime complexity.
 * Could you implement it without using extra memory?
 *
 * @author yuqing.zyq
 */
public class SingleNumber {
    public int singleNumber(int[] nums) {
        for (int i = 1; i < nums.length; ++i) {
            nums[0] = nums[0] ^ nums[i];
        }

        return nums[0];
    }

    public static void main(String[] args) {
        SingleNumber sn = new SingleNumber();
        int[] input;

        input = new int[] {1, 3, 5, 1, 3};
        output(input, sn.singleNumber(input));

        input = new int[] {1, 3, 1, 1, 3};
        output(input, sn.singleNumber(input));

        input = new int[] {1, 3, 3, 1, 5};
        output(input, sn.singleNumber(input));
    }
}
