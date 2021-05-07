package org.LeetcodeSolution.String;

/**
 * Problem
 *     657.Robot Return to Origin
 *     https://leetcode.com/problems/robot-return-to-origin/
 *     https://leetcode-cn.com/problems/robot-return-to-origin/
 * Grade of difficulty
 *     Easy
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution657 {

    /**
     * 1.关于复杂度
     *   1.1 时间复杂度为 O(n)
     *   1.2 空间负责度为 O(1)
     * 2.我的解题思路
     *   2.1 定义两个变量表示x轴与y轴
     *   2.2 循环遍历字符串，根据题意改变2.1的变量
     *   2.3 对比2.1变量是否为0并返回
     * 3.提交记录
     *   3.1 力扣中耗时5ms,消耗37.8MB内存
     *   3.2 leetcode中耗时4ms,消耗38.3MB内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 set two integer with x-axis and y-axis
     *     2.2 circulate string and change 2.1 variables depend on topic
     *     2.3 compare 2.1 variables with 0 and return
     * 3.About submit record
     *     3.1 5ms and 37.8MB memory in LeetCode China
     *     3.2 4ms and 38.3MB memory in LeetCode
     * 4.Q&A
     *
     * @param moves
     * @return
     */
    public boolean judgeCircle(String moves) {
        if (moves == null || moves.length() == 0) {
            return true;
        }
        int x = 0, y = 0;
        char[] chars = moves.toCharArray();
        for (char temp : chars) {
            switch (temp) {
                case 'U': {
                    y -= 1;
                    break;
                }
                case 'D': {
                    y += 1;
                    break;
                }
                case 'L': {
                    x -= 1;
                    break;
                }
                case 'R': {
                    x += 1;
                    break;
                }
            }
        }
        return x == 0 && y == 0;
    }

    /**
     * 1.关于复杂度
     *   1.1 时间复杂度为 O(n)
     *   1.2 空间负责度为 O(1)
     * 2.我的解题思路
     *   2.1 定义4个变量标识4个方向
     *   2.2 循环遍历数组统计方向的个数
     *   2.3 对比返回布尔值
     * 3.提交记录
     *   3.1 力扣中耗时6ms,消耗37.5MB内存
     *   3.2 leetcode中耗时4ms,消耗37.9MB内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 define four variable which are sign four direction
     *     2.2 circulate string and statistics direction and update 2.2 variables
     *     2.3 compare and return
     * 3.About submit record
     *     3.1 6ms and 37.5MB memory in LeetCode China
     *     3.2 4ms and 37.9MB memory in LeetCode
     * 4.Q&A
     *
     * @param moves
     * @return
     */
    public boolean judgeCircleWithIncrease(String moves) {
        if (moves == null || moves.length() == 0) {
            return true;
        }
        int u = 0, d = 0, l = 0, r = 0;
        char[] chars = moves.toCharArray();
        for (char temp : chars) {
            switch (temp) {
                case 'U': {
                    u += 1;
                    break;
                }
                case 'D': {
                    d += 1;
                    break;
                }
                case 'L': {
                    l += 1;
                    break;
                }
                case 'R': {
                    r += 1;
                    break;
                }
            }
        }
        return u == d && l == r;
    }
}
