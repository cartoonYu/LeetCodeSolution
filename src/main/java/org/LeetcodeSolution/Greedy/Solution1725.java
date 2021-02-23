package org.LeetcodeSolution.Greedy;

/**
 * Problem
 *     1725.Number Of Rectangles That Can Form The Largest Square
 *     https://leetcode.com/problems/number-of-rectangles-that-can-form-the-largest-square/
 *     https://leetcode-cn.com/problems/number-of-rectangles-that-can-form-the-largest-square/
 * Grade of difficulty
 *     Easy
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution1725 {

    /**
     * 1.关于复杂度
     *   1.1 时间复杂度为 O(n)
     *   1.2 空间负责度为 O(1)
     * 2.我的解题思路
     *   2.1 遍历数组每一行，获取当前最小边，若当前最小边大于最大边，重置 result，若当前最小边等于当前最大边，结果自增
     * 3.提交记录
     *   3.1 力扣中耗时 2ms,消耗 38.9MB 内存
     *   3.2 leetcode 中耗时 1ms,消耗 39.5MB 内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 circulate each row, get current minimum side, if current minimum side is bigger than current maximum size,
     *         reset result, if current minimum side is equals to current maximum size, plus result
     * 3.About submit record
     *     3.1 2ms and 38.9MB memory in LeetCode China
     *     3.2 1ms and 39.5MB memory in LeetCode
     * 4.Q&A
     * @param rectangles
     * @return
     */
    public int countGoodRectangles(int[][] rectangles) {
        int maxLen = -1, res = 0, min;
        for(int index = 0, length = rectangles.length; index < length; index++){
            min = Math.min(rectangles[index][0], rectangles[index][1]);
            if(maxLen < min){
                maxLen = min;
                res = 1;
            } else if(maxLen == min){
                res++;
            }
        }
        return res;
    }
}
