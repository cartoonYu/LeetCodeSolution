package org.LeetcodeSolution.Array;

import java.util.Arrays;

/**
 * Problem
 *     1046.Last Stone Weight
 *     https://leetcode.com/problems/last-stone-weight/
 *     https://leetcode-cn.com/problems/last-stone-weight/
 * Grade of difficulty
 *     Easy
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution1046 {

    /**
     * 1.关于复杂度
     *     1.1 时间复杂度为O(n^2)
     *     1.2 空间负责度为O(1)
     * 2.我的解题思路
     *     2.1 用两个临时变量存储stones数组的长度以及计算的结果
     *     2.2 循环1到数组末尾，排序数组，计算最后两个元素相减的结果
     *     2.3 根据题意操作最后的两个元素
     * 3.提交记录
     *     3.1 力扣中耗时2ms,消耗35.1MB内存
     *     3.2 leetcode中耗时1ms,消耗34.2MB内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n^2)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 use two integer to record stones.length and calculate result
     *     2.2 circulate 1 to length,sort array,and calculate the last two element subtract value
     *     2.3 according to topic to operate last two element
     * 3.About submit record
     *     3.1 2ms and 35.1MB memory in LeetCode China
     *     3.2 1ms and 34.2MB memory in LeetCode
     * 4.Q&A
     * @param stones
     * @return
     */
    public int lastStoneWeight(int[] stones) {
        if (stones == null || stones.length == 0) {
            return 0;
        }
        if (stones.length == 1) {
            return stones[0];
        }
        int length = stones.length, temp;
        for (int i = 0; i < length; i++) {
            Arrays.sort(stones);
            temp = stones[length - 1] - stones[length - 2];
            stones[length - 2] = 0;
            stones[length - 1] = temp;
        }
        return stones[stones.length - 1];
    }
}
