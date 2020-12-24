package org.LeetcodeSolution.Chart;

/**
 * Problem
 *     1615. Maximal Network Rank
 *     https://leetcode.com/problems/maximal-network-rank/
 *     https://leetcode-cn.com/problems/maximal-network-rank/
 * Grade of difficulty
 *     Medium
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution1615 {

    /**
     * 1.关于复杂度
     *   1.1 时间复杂度为 O(n^2)
     *   1.2 空间负责度为 O(n^2)
     * 2.我的解题思路
     *   2.1 标记连通城市的道路并计算道路的数量
     *   2.2 循环遍历两个城市，将他们连通的道路数量相加，如果当前两个城市有直接连接的道路，计数减 1
     *   2.3 返回 2.2 计算的最大值
     * 3.提交记录
     *   3.1 力扣中耗时 3ms,消耗 39.5MB 内存
     *   3.2 leetcode 中耗时 3ms,消耗 40.5MB 内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n^2)
     *     1.2 Space Complexity is O(n^2)
     * 2.how I solve
     *     2.1 mark connected with city by incoming param
     *     2.2 calculate the number of roads connecting the city
     *     2.3 circulate every two city, plus their road count, if current two city have direct connect, subtract 1
     *     2.4 return 2.3 biggest calculate result
     * 3.About submit record
     *     3.1 3ms and 39.5MB memory in LeetCode China
     *     3.2 3ms and 40.5MB memory in LeetCode
     * 4.Q&A
     * @param n
     * @param roads
     * @return
     */
    public int maximalNetworkRank(int n, int[][] roads) {
        int[][] source = new int[n][n];
        for (int[] road : roads) {
            source[road[0]][road[1]] = 1;
            source[road[1]][road[0]] = 1;
        }
        int[] roadCnt = new int[n];
        int roadCntTemp;
        for (int i = 0; i < n; i++) {
            roadCntTemp = 0;
            for (int j = 0; j < n; j++) {
                roadCntTemp += source[i][j];
            }
            roadCnt[i] = roadCntTemp;
        }
        int res = 0, temp;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                temp = roadCnt[i] + roadCnt[j];
                if (source[i][j] == 1 && source[j][i] == 1) {
                    temp -= 1;
                }
                if (temp > res) {
                    res = temp;
                }
            }
        }
        return res;
    }
}
