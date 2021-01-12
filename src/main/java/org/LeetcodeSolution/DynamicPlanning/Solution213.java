package org.LeetcodeSolution.DynamicPlanning;

/**
 * Problem
 *     213.House Robber II
 *     https://leetcode.com/problems/house-robber-ii/
 *     https://leetcode-cn.com/problems/house-robber-ii/
 * Grade of difficulty
 *     Medium
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution213 {

    /**
     * 1.关于复杂度
     *   1.1 时间复杂度为O(n)
     *   1.2 空间负责度为O(n)
     * 2.我的解题思路
     *   2.1 这个解法基于动态规划
     *   2.2 因为房子形成一个圈，所以解法分为两个部分
     *       2.2.1 不抢劫第一间房子
     *       2.2.2 不抢劫最后一间房子
     *   2.3 定义一个数组记录计算的结果和一个整数记录最后的结果
     *   2.4 正反序分别遍历数组更新数组以及整数
     * 3.提交记录
     *   3.1 力扣中耗时0ms,消耗34.3MB内存
     *   3.2 leetcode中耗时0ms,消耗34.3MB内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(n)
     * 2.how I solve
     *     2.1 this solution is base on dynamic planning
     *     2.2 cause all houses are arranged in a circle,the process can be spilt off two part
     *         2.2.1 don't rob first house
     *         2.2.2 don't rob last house
     *     2.3 set a array to cache calculate process result and a num to return
     *     2.4 positive sequence traversal and negative sequence traversal array and update cache array and result
     * 3.About submit record
     *     3.1 0ms and 34.3MB memory in LeetCode China
     *     3.2 0ms and 34.3MB memory in LeetCode
     * 4.Q&A
     * @param nums
     * @return
     */
    public int rob(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        int res = 0, length = nums.length;
        int[] temp = new int[length];
        temp[1] = nums[1];
        res = temp[1];
        for (int i = 2; i < length; i++) {
            temp[i] = Math.max(temp[i - 1], temp[i - 2] + nums[i]);
            res = Math.max(temp[i], res);
        }
        temp[length - 1] = 0;
        temp[length - 2] = nums[length - 2];
        res = Math.max(res, temp[length - 2]);
        for (int i = length - 3; i >= 0; i--) {
            temp[i] = Math.max(temp[i + 1], temp[i + 2] + nums[i]);
            res = Math.max(temp[i], res);
        }
        return res;
    }
}
