/**
 * Problem
 *     121.Best Time to Buy and Sell Stock
 *     https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 * Grade of difficulty
 *     Easy
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution121 {

    /**
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 this solution is base on dynamic planning
     *     2.2 define two integer to cache minimum price and result
     *     2.3 circulate prices,compare min to current price,subtract current price and min price and compare result to temp result
     * 3.About submit record
     *     3.1 2ms and 38.2MB memory in LeetCode China
     *     3.2 0ms and 35.4MB memory in LeetCode
     * 4.Q&A
     * @param prices
     * @return
     */
    public int maxProfit(int[] prices) {
        if(prices==null||prices.length==0){
            return 0;
        }
        int result=0;
        int min=prices[0];
        for(int i=0,length=prices.length;i<length;i++){
            if(prices[i]<min){
                min=prices[i];
            }
            int temp=prices[i]-min;
            result=result>temp?result:temp;
        }
        return result;
    }
}
