package org.LeetcodeSolution.Array;

/**
 * Problem
 *     1672. Richest Customer Wealth
 *     https://leetcode.com/problems/richest-customer-wealth/
 *     https://leetcode-cn.com/problems/richest-customer-wealth/
 * Grade of difficulty
 *     Easy
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution1672 {

    /**
     * 1.关于复杂度
     *   1.1 时间复杂度为 O(m * n)
     *   1.2 空间负责度为 O(1)
     * 2.我的解题思路
     *   2.1 将每个客户的财富相加
     *   2.2 对比与交换最大值
     * 3.提交记录
     *   3.1 力扣中耗时 0ms,消耗 38.3MB 内存
     *   3.2 leetcode 中耗时 0ms,消耗 38.5MB 内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(m * n)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 plus each customer wealth
     *     2.2 compare with current maximum wealth and swap
     * 3.About submit record
     *     3.1 0ms and 38.3MB memory in LeetCode China
     *     3.2 0ms and 38.5MB memory in LeetCode
     * 4.Q&A
     * @param accounts
     * @return
     */
    public int maximumWealth(int[][] accounts) {
        int maxWealth = Integer.MIN_VALUE;
        int temp;
        for(int i = 0, length = accounts.length; i < length; i++){
            temp = 0;
            for(int j = 0, size = accounts[i].length; j < size; j++){
                temp += accounts[i][j];
            }
            if(temp > maxWealth){
                maxWealth = temp;
            }
        }
        return maxWealth;
    }
}
