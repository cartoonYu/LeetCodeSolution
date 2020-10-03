package org.LeetcodeSolution.Array;

/**
 * Problem
 *     1480.Running Sum of 1d Array
 *     https://leetcode.com/problems/running-sum-of-1d-array/
 *     https://leetcode-cn.com/problems/running-sum-of-1d-array/
 * Grade of difficulty
 *     Easy
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution1480 {

    /**
     * 1.关于复杂度
     *   1.1 时间复杂度为 O(n)
     *   1.2 空间负责度为 O(1)
     * 2.我的解题思路
     *   2.1 循环遍历数组，将当前元素与上一元素相加
     * 3.提交记录
     *   3.1 力扣中耗时 0ms,消耗 39.9MB 内存
     *   3.2 leetcode 中耗时 0ms,消耗 40.3MB 内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 circulate array, add with last element and return
     * 3.About submit record
     *     3.1 0ms and 39.9MB memory in LeetCode China
     *     3.2 0ms and 40.3MB memory in LeetCode
     * 4.Q&A
     * @param nums
     * @return
     */
    public int[] runningSum(int[] nums) {
        for(int i = 1, length = nums.length; i < length; i++){
            nums[i] += nums[i - 1];
        }
        return nums;
    }
}
