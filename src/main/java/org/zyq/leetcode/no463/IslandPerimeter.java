/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package org.zyq.leetcode.no463;

import java.util.Arrays;

import static org.zyq.leetcode.util.LeetUtil.output;

/**
 * @author yuqing.zyq
 */
public class IslandPerimeter {
    public int islandPerimeter(int[][] grid) {
        int perimeter = 0;
        int height = grid.length;
        int width = grid[0].length;

        for (int i = 0; i < height; ++i) {
            for (int j = 0; j < width; ++j) {
                if (grid[i][j] == 0) {
                    continue;
                }

                // up
                if (i - 1 < 0 || grid[i - 1][j] == 0) {
                    perimeter++;
                }

                // down
                if (i + 1 >= height || grid[i + 1][j] == 0) {
                    perimeter++;
                }

                // left
                if (j - 1 < 0 || grid[i][j - 1] == 0) {
                    perimeter++;
                }

                // right
                if (j + 1 >= width || grid[i][j + 1] == 0) {
                    perimeter++;
                }
            }
        }

        return perimeter;
    }

    public static void main(String[] args) {
        IslandPerimeter ip = new IslandPerimeter();
        int[][] island = new int[][] { { 0, 1, 0, 0 }, { 1, 1, 1, 0 }, { 0, 1, 0, 0 },
                { 1, 1, 0, 0 } };
        output(Arrays.deepToString(island), ip.islandPerimeter(island));
    }
}
