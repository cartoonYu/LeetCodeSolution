package org.LeetcodeSolution.Greedy;

/**
 * Problem
 *     134.Gas Station
 *     https://leetcode.com/problems/gas-station/
 *     https://leetcode-cn.com/problems/gas-station/
 * Grade of difficulty
 *     Medium
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution134 {

    /**
     * 1. 关于复杂度
     *     1.1 时间复杂度为O(n)
     *     1.2 空间负责度为O(1)
     * 2. 我的解题思路
     *     2.1 使用三个临时变量
     *         2.1.1 cur，记录当前油缸量
     *         2.1.2 total，记录总的消耗以及加油数的运算和
     *         2.1.3 start，符合条件的起点
     *     2.2 循环遍历数组
     *         2.2.1 用cur和total加上当前gas减掉cost
     *         2.2.2 如果cur<0，表示当前起点无法满足要求，重置cur以及start
     *     2.3 如果total<0，表示没有可用起点，返回-1，否则的话，返回start
     * 3. 提交记录
     *     3.1 力扣中耗时1ms,消耗38.4MB内存
     *     3.2 leetcode中耗时0ms,消耗36.8MB内存
     * 4. Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 use three variable
     *         2.1.1 cur,current tank gas
     *         2.1.2 total,total with cost and add gas
     *         2.1.3 start,mark start station
     *     2.2 use a circulation
     *         2.2.1 add gas and subtract cost with cur and total
     *         2.2.2 if cur<0,it means this start station is not available,reset start and cur
     *     2.3 if total<0,it means no station is available,return -1,otherwise return start
     * 3.About submit record
     *     3.1 1ms and 38.4MB memory in LeetCode China
     *     3.2 0ms and 36.8MB memory in LeetCode
     * 4.Q&A
     *
     * @param gas
     * @param cost
     * @return
     */
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int cur=0,total=0,start=0;
        for(int i=0,length=cost.length;i<length;i++){
            cur+=gas[i]-cost[i];
            total+=gas[i]-cost[i];
            if(cur<0){
                start=i+1;
                cur=0;
            }
        }
        return total<0?-1:start;
    }
}
