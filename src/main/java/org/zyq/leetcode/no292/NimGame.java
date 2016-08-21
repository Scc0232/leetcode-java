package org.zyq.leetcode.no292;

import static org.zyq.leetcode.util.LeetUtil.output;

/**
 * 292. Nim Game  QuestionEditorial Solution  My Submissions
 *
 * You are playing the following Nim Game with your friend:
 * There is a heap of stones on the table, each time one of you take turns to remove 1 to 3 stones.
 * The one who removes the last stone will be the winner.
 * You will take the first turn to remove the stones.
 *
 * Both of you are very clever and have optimal strategies for the game.
 * Write a function to determine whether you can win the game given the number of stones in the heap.

 * For example, if there are 4 stones in the heap, then you will never win the game:
 * no matter 1, 2, or 3 stones you remove, the last stone will always be removed by your friend.
 *
 * @author yuqing.zyq
 */
public class NimGame {
    public boolean canWinNim(int n) {
        return n % 4 != 0;
    }

    public static void main(String[] args) {
        NimGame ng = new NimGame();

        output(0, ng.canWinNim(0));
        output(0, ng.canWinNim(2));
        output(0, ng.canWinNim(4));
        output(0, ng.canWinNim(7));
        output(0, ng.canWinNim(8));
    }
}
