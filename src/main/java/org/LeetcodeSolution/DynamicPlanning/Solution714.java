package org.LeetcodeSolution.DynamicPlanning;

/**
 * Problem
 *     714.Best Time to Buy and Sell Stock with Transaction Fee
 *     https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-transaction-fee/submissions/
 *     https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-with-transaction-fee/submissions/
 * Grade of difficulty
 *     Medium
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution714 {

    /**
     * 1.关于复杂度
     *     1.1 时间复杂度为O(n)
     *     1.2 空间负责度为O(1)
     * 2.我的解题思路
     *     2.1 定义cost以及pro分别记录当前最大花费以及最大利润
     *     2.2 循环遍历数组对比设计cost以及pro
     * 3.提交记录
     *     3.1 力扣中耗时10ms,消耗73.8MB内存
     *     3.2 leetcode中耗时7ms,消耗51.7MB内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 define cost which is mark current cost money,pro which is mark current profit
     *     2.2 compare and set cost and profit
     * 3.About submit record
     *     3.1 10ms and 73.8MB memory in LeetCode China
     *     3.2 5ms and 51.7MB memory in LeetCode
     * 4.Q&A
     *
     * @param prices
     * @param fee
     * @return
     */
    public int maxProfit(int[] prices, int fee) {
        if(prices==null|prices.length<2){
            return 0;
        }
        int cost=Integer.MIN_VALUE,pro=0;
        for(int price:prices){
            cost=Math.max(cost,pro-price-fee);
            pro=Math.max(pro,price+cost);
        }
        return pro;
    }

}
