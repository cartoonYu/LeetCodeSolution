package org.LeetcodeSolution.DynamicPlanning;

/**
 * Problem
 *      63.Unique Paths II
 *      https://leetcode.com/problems/unique-paths-ii/
 *      https://leetcode-cn.com/problems/unique-paths-ii/
 * Grade of difficulty
 *      Medium
 * Related topics
 *      62.Unique Paths
 * @author cartoon
 * @version 1.0
 */
public class Solution63 {

    /**
     * 1.关于复杂度
     *   1.1 时间复杂度为 O(m*n)
     *   1.2 空间负责度为 O(m*n)
     * 2.我的解题思路
     *   2.1 这个解法基于动态规划
     *   2.2 经过分析，这个题目含有5中情况
     *        2.2.1 当 i=0 以及 j=0，当前变量等于1，因为只可能有一条路径到达
     *        2.2.2 当 obstacleGrid[i][j]==1，表示当前格子含有障碍物，当前变量为0
     *        2.2.3 当 i=0，temp=temp[i][j-1]
     *        2.2.4 当 j=0，temp[i][j]=temp[i-1][j]
     *        2.2.5 其余情况下，temp[i][j]=temp[i-1][j]+temp[i][j-1]
     *   2.3 使用双重循环遍历网格，计算临时变量
     *   2.4 因为我们无法获取网格的具体信息，而解法的返回值应该临时变量最后一个变量，所以只有返回 temp[obstacleGrid.length-1][obstacleGrid[obstacleGrid.length-1].length-1]
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
     *     2.2 by analyzing,this topic has five condition
     *          2.2.1 when i=0 and j=0,temp=1,because it only haa one route to reach
     *          2.2.2 when obstacleGrid[i][j]==1,it represent there has a obstacle,so temp=0
     *          2.2.3 when i=0,temp=temp[i][j-1]
     *          2.2.4 when j=0,temp[i][j]=temp[i-1][j]
     *          2.2.5 other condition,temp[i][j]=temp[i-1][j]+temp[i][j-1]
     *     2.3 use double circulate with i and j, calculate temp
     *     2.4 cause we have no idea about obstacleGrid's information,but the solution should return last element in horizontal and vertical,
     *          so return temp[obstacleGrid.length-1][obstacleGrid[obstacleGrid.length-1].length-1]
     * 3.About submit record
     *     3.1 1ms and 32.4MB memory in LeetCode China
     *     3.2 0ms and 31.8MB memory in LeetCode
     * 4.Q&A
     * @param obstacleGrid
     * @return
     */
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if (obstacleGrid == null || obstacleGrid.length == 0) {
            return 0;
        }
        int length = obstacleGrid.length;
        int[][] temp = new int[length][];
        for (int i = 0; i < length; i++) {
            temp[i] = new int[obstacleGrid[i].length];
            for (int j = 0, size = obstacleGrid[i].length; j < size; j++) {
                if (obstacleGrid[i][j] == 1) {
                    temp[i][j] = 0;
                    continue;
                }
                if (i == 0 && j == 0) {
                    temp[i][j] = 1;
                    continue;
                }
                if (i == 0) {
                    temp[i][j] = temp[i][j - 1];
                    continue;
                }
                if (j == 0) {
                    temp[i][j] = temp[i - 1][j];
                    continue;
                }
                temp[i][j] = temp[i - 1][j] + temp[i][j - 1];
            }
        }
        return temp[obstacleGrid.length - 1][obstacleGrid[obstacleGrid.length - 1].length - 1];
    }
}
