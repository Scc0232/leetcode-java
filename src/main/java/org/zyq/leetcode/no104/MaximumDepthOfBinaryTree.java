/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package org.zyq.leetcode.no104;

/**
 * Given a binary tree, find its maximum depth.
 *
 * The maximum depth is the number of nodes along the longest path
 * from the root node down to the farthest leaf node.
 *
 * @author yuqing.zyq
 */
public class MaximumDepthOfBinaryTree {

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        if (root.left == null && root.right == null) {
            return 1;
        }

        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return left > right ? left + 1 : right + 1;
    }

    public static void main(String[] args) {
        MaximumDepthOfBinaryTree mdobt = new MaximumDepthOfBinaryTree();

        TreeNode root = new TreeNode(1);
        TreeNode left_2 = new TreeNode(2);
        root.left = left_2;
        System.out.println(mdobt.maxDepth(root));

        TreeNode right_3 = new TreeNode(3);
        left_2.right = right_3;
        System.out.println(mdobt.maxDepth(root));

        TreeNode left_4 = new TreeNode(4);
        TreeNode right_4 = new TreeNode(4);
        right_3.left = left_4;
        right_3.right = right_4;
        System.out.println(mdobt.maxDepth(root));

        TreeNode right_2 = new TreeNode(2);
        root.right = right_2;
        System.out.println(mdobt.maxDepth(root));
    }
}
