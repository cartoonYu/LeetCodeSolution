package org.LeetcodeSolution.DynamicPlanning;

/**
 * Problem
 *     309.Best Time to Buy and Sell Stock with Cooldown
 *     https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-cooldown/
 *     https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-with-cooldown/
 * Grade of difficulty
 *     Medium
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution309 {

    /**
     * 1.关于复杂度
     *     1.1 时间复杂度为O(n)
     *     1.2 空间负责度为O(n)
     * 2.我的解题思路
     *     2.1 定义两个数组，hold用于记录当前持有的花费，profit用于记录当前卖出的利润
     *     2.2 循环遍历数组
     *         2.2.1 对比上一持有花费hold[i-1]以及卖出上二的股票以及购入当前股票的利润profit[i-2]-prices[i]
     *         2.2.2 对比上一股票卖出的利润profit[i-1]以及购入上一股票在当前卖出的利润hold[i-1]+prices[i]
     * 3.提交记录
     *     3.1 力扣中耗时3ms,消耗36.3MB内存
     *     3.2 leetcode中耗时1ms,消耗35.8MB内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(n)
     * 2.how I solve
     *     2.1 define two array，hold is used to record current cost，profit is used to record current profit
     *     2.2 circulate array,compare and set
     *         2.2.1 compare hold[i-1](last hold cost) and profit[i-2]-prices[i](sell last two stock and buy current profit)
     *         2.2.2 compare profit[i-1](last profit) and hold[i-1]+prices[i](buy last stock and sell current stock)
     * 3.About submit record
     *     3.1 3ms and 36.3MB memory in LeetCode China
     *     3.2 1ms and 35.8MB memory in LeetCode
     * 4.Q&A
     * @param prices
     * @return
     */
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }
        int length = prices.length;
        int[] profit = new int[length], hold = new int[length];
        hold[0] = -prices[0];
        for (int i = 1; i < length; i++) {
            if (i == 1) {
                hold[i] = Math.max(hold[i - 1], -prices[i]);
            } else {
                hold[i] = Math.max(hold[i - 1], profit[i - 2] - prices[i]);
            }
            profit[i] = Math.max(profit[i - 1], hold[i - 1] + prices[i]);
        }
        return profit[length - 1];
    }
}
