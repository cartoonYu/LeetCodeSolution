package org.LeetcodeSolution.DynamicPlanning;

/**
 * Problem
 *     121.Best Time to Buy and Sell Stock
 *     https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 *     https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock/
 * Grade of difficulty
 *     Easy
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution121 {

    /**
     * 1.关于复杂度
     *     1.1 时间复杂度为O(n)
     *     1.2 空间负责度为O(1)
     * 2.我的解题思路
     *     2.1 这个算法基于备忘录式的动态规划
     *     2.2 定义两个变量记录当前最小价钱以及最大利润
     *     2.3 循环遍历数组
     *         2.3.1 对比当前价钱以及最小价钱，更新最小价钱
     *         2.3.2 求出当前价格卖出得到的利润，对比更新最大利润
     *     2.4 返回最大利润变量的值
     * 3.提交记录
     *     3.1 力扣中耗时2ms,消耗38.2MB内存
     *     3.2 leetcode中耗时0ms,消耗35.4MB内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 this solution is base on dynamic planning
     *     2.2 define two integer to cache minimum price and result
     *     2.3 circulate prices,compare min to current price,subtract current price and min price and c${entry.className}ompare result to temp result
     * 3.About submit record
     *     3.1 2ms and 38.2MB memory in LeetCode China
     *     3.2 0ms and 35.4MB memory in LeetCode
     * 4.Q&A
     * @param prices
     * @return
     */
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }
        int result = 0;
        int min = prices[0];
        for (int i = 0, length = prices.length; i < length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            }
            int temp = prices[i] - min;
            result = result > temp ? result : temp;
        }
        return result;
    }
}
