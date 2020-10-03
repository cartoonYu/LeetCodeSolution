package org.LeetcodeSolution.DynamicPlanning;

/**
 * Problem
 *     746.Min Cost Climbing Stairs
 *     https://leetcode.com/problems/min-cost-climbing-stairs/
 *     https://leetcode-cn.com/problems/min-cost-climbing-stairs/
 * Grade of difficulty
 *     Easy
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution746 {

    /**
     * 1.关于复杂度
     *   1.1 时间复杂度为 O(n)
     *   1.2 空间负责度为 O(1)
     * 2.我的解题思路
     *   2.1 根据题意，当传入数组长度小于2直接比较返回
     *   2.2 当攀爬时，存在两种情况，判断最小的情况
     *        2.2.1 爬1步，当前结果会是 result[index-1]+cost[index]
     *        2.2.2 爬2步，当前结果会是 result[index-2]+cost[index]
     *   2.3 判断最后两步发生的情况，返回较小的结果
     * 3.提交记录
     *   3.1 力扣中耗时2ms,消耗37.5MB内存
     *   3.2 leetcode中耗时1ms,消耗36.8MB内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 according to topic,exclude cost.length<2 and return directly
     *     2.2 there have two condition while climbing,judge the minimum condition
     *              2.2.1 climb one step,current result will be result[index-1]+cost[index]
     *              2.2.2 climb two step,current result will be result[index-2]+cost[index]
     *     2.3 judge last two condition,return the smaller one
     * 3.About submit record
     *     3.1 2ms and 37.5MB memory in LeetCode China
     *     3.2 1ms and 36.8MB memory in LeetCode
     * 4.Q&A
     * @param cost
     * @return
     */
    public int minCostClimbingStairs(int[] cost) {
        if(cost.length==0||cost.length==1){
            return 0;
        }
        if(cost.length==2){
            return cost[0]<cost[1]?cost[0]:cost[1];
        }
        int length=cost.length;
        int[] sum=new int[length];
        sum[0]=cost[0];
        sum[1]=Math.min(cost[1]+sum[0],cost[1]);
        for(int i=2;i<length;i++){
            sum[i]=cost[i]+Math.min(sum[i-1],sum[i-2]);
        }
        return Math.min(sum[length-1],sum[length-2]);
    }
}
