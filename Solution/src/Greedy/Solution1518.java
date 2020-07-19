package Greedy;

/**
 * Problem
 *     1518.Water Bottles
 *     https://leetcode.com/problems/water-bottles/
 *     https://leetcode-cn.com/problems/water-bottles/
 * Grade of difficulty
 *     Easy
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution1518 {

    /**
     * 1.关于复杂度
     *   1.1 时间复杂度为 O(n)
     *   1.2 空间负责度为 O(1)
     * 2.我的解题思路
     *   2.1 因为开始时给定的 numBottles 都盛满了水，所以用 numBottles 初始化结果变量
     *   2.2 循环计算直到 numBottles 小于 numExchange
     *       2.2.1 根据规则兑换酒并且将酒的数量添加到结果变量中
     *       2.2.2 numBottles 减去上轮空瓶子（已经根据规则兑换），增加本轮空瓶子
     * 3.提交记录
     *   3.1 力扣中耗时 0ms,消耗 36.4MB 内存
     *   3.2 leetcode 中耗时 0ms,消耗 35.9MB 内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 cause in the beginning numBottles are fill with water, init result with numBottles
     *     2.2 circulate when numBottles is bigger than numExchange
     *         2.2.1 get another full water bottles by rule with empty bottle and add to result
     *         2.2.2 numBottles subtract last round empty bottle(already exchange water), add current round empty bottle
     * 3.About submit record
     *     3.1 0ms and 36.4MB memory in LeetCode China
     *     3.2 0ms and 35.9MB memory in LeetCode
     * 4.Q&A
     *
     * @param numBottles
     * @param numExchange
     * @return
     */
    public int numWaterBottles(int numBottles, int numExchange) {
        int res = numBottles, temp;
        while(numBottles >= numExchange){
            temp = numBottles / numExchange;
            res += numBottles / numExchange;
            numBottles -= temp * numExchange;
            numBottles += temp;

        }
        return res;
    }

}
