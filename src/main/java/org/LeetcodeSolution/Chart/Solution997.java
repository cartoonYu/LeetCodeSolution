package org.LeetcodeSolution.Chart;

/**
 * Problem
 *     997.Find the Town Judge
 *     https://leetcode.com/problems/find-the-town-judge/
 *     https://leetcode-cn.com/problems/find-the-town-judge/
 * Grade of difficulty
 *     Easy
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution997 {

    /**
     * 1.关于复杂度
     *   1.1 时间复杂度为 O(n)
     *   1.2 空间负责度为 O(n)
     * 2.我的解题思路
     *   2.1 定义一个数组统计被信任的次数
     *   2.2 定义一个数组标记是否信任其他人
     *   2.3 循环遍历 trust 数组，根据 索引 1 自增 2.1 数组，根据索引 0 标记 2.2 数组为true
     *   2.4 同时遍历 2.1 与 2.2 数组，若 2.1 数组当前元素等于 N 且 2.2 数组元素为 false，返回
     * 3.提交记录
     *   3.1 力扣中耗时 2ms,消耗 46.1MB 内存
     *   3.2 leetcode 中耗时 2ms,消耗 46.7MB 内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(n)
     * 2.how I solve
     *     2.1 define array to mark the count of be trusted
     *     2.2 define array to mark whether trust other
     *     2.3 circulate trust array, plus 2.1 array with element which in index 1, set 2.2 array with true by index 0
     *     2.4 circulate 2.1 and 2.2 in the same time, if 2.1 array's element is equals to N and 2.2 array's element is false, return
     * 3.About submit record
     *     3.1 2ms and 46.1MB memory in LeetCode China
     *     3.2 2ms and 46.7MB memory in LeetCode
     * 4.Q&A
     * @param N
     * @param trust
     * @return
     */
    public int findJudge(int N, int[][] trust) {
        int[] marked = new int[N + 1];
        boolean[] trustAnotherPerson = new boolean[N + 1];
        for(int index = 1; index <= N; index++){
            marked[index] = 1;
        }
        for(int[] trustRelation : trust){
            marked[trustRelation[1]] += 1;
            trustAnotherPerson[trustRelation[0]] = true;
        }
        int res = -1;
        for(int index = 1; index <= N; index++){
            if(marked[index] == N && !trustAnotherPerson[index]){
                res = index;
                break;
            }
        }
        return res;
    }
}
