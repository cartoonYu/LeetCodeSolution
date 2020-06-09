package Array;

/**
 * Problem
 *     1450.Number of Students Doing Homework at a Given Time
 *     https://leetcode.com/problems/number-of-students-doing-homework-at-a-given-time/
 *     https://leetcode-cn.com/problems/number-of-students-doing-homework-at-a-given-time/
 * Grade of difficulty
 *     Easy
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution1450 {

    /**
     * 1.关于复杂度
     *   1.1 时间复杂度为 O(n)
     *   1.2 空间负责度为 O(1)
     * 2.我的解题思路
     *   2.1 对比起始与结束时间并累加结果
     * 3.提交记录
     *   3.1 力扣中耗时 0ms,消耗 37.9MB 内存
     *   3.2 leetcode 中耗时 0ms,消耗 37.5MB 内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 compare with start time and end time and plus result
     * 3.About submit record
     *     3.1 0ms and 37.9MB memory in LeetCode China
     *     3.2 0ms and 37.5MB memory in LeetCode
     * 4.Q&A
     *
     * @param startTime
     * @param endTime
     * @param queryTime
     * @return
     */
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int cnt = 0;
        for(int i = 0, length = startTime.length; i < length; i++){
            if(queryTime >= startTime[i] && queryTime <= endTime[i]){
                cnt++;
            }
        }
        return cnt;
    }
}
