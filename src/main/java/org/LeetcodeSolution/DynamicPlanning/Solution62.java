package org.LeetcodeSolution.DynamicPlanning;

/**
 * Problem
 *      62.Unique Paths
 *      https://leetcode.com/problems/unique-paths/
 *      https://leetcode-cn.com/problems/unique-paths/
 * Grade of difficulty
 *      Medium
 * Related topics
 *      63.Unique Paths II
 * @author cartoon
 * @version 1.0
 */
public class Solution62 {

    /**
     * 1.关于复杂度
     *   1.1 时间复杂度为 O(m*n)
     *   1.2 空间负责度为 O(m*n)
     * 2.我的解题思路
     *   2.1 这个解法基于动态规划
     *   2.2 经过分析，这个题目有两种情况
     *        2.2.1 列为 0 或者行为 0 时，当前变量为 1，因为在当前情况下只可能有一条路径到达当前地点
     *        2.2.2 因为题目限制了机器人行走的路径，所以 temp[i][j]=temp[i-1][j]+temp[i][j-1]
     * 3.提交记录
     *   3.1 力扣中耗时1ms,消耗32.4MB内存
     *   3.2 leetcode中耗时0ms,消耗31.8MB内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(m*n)
     *     1.2 Space Complexity is O(m*n)
     * 2.how I solve
     *     2.1 this solution is base on dynamic planning
     *     2.2 by analyzing,this topic has two condition
     *          2.2.1 when i=0 or j=0,temp=1,because it only haa one route to reach
     *          2.2.2 cause the topic limit robot's walk way,so temp=temp[i-1][j](from the top)+temp[i][j-1](from the left)
     *     2.3 use double circulate with i and j, calculate temp
     *     2.4 return temp[m-1][n-1](the last element in m and n)
     * 3.About submit record
     *     3.1 1ms and 32.4MB memory in LeetCode China
     *     3.2 0ms and 31.8MB memory in LeetCode
     * 4.Q&A
     * @param m
     * @param n
     * @return
     */
    public int uniquePaths(int m, int n) {
        int[][] temp = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0) {
                    temp[i][j] = 1;
                    continue;
                }
                temp[i][j] = temp[i - 1][j] + temp[i][j - 1];
            }
        }
        return temp[m - 1][n - 1];
    }
}
