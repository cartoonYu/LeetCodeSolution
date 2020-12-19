package org.LeetcodeSolution.BinarySearch;

/**
 * Problem
 *      374.Guess Number Higher or Lower
 *      https://leetcode.com/problems/guess-number-higher-or-lower/
 *      https://leetcode-cn.com/problems/guess-number-higher-or-lower/
 * Grade of difficulty
 *      Easy
 * Related topics
 *      153.Find Minimum in Rotated Sorted Array
 *      154.Find Minimum in Rotated Sorted Array II
 *      167.Two Sum II - Input array is sorted
 *      367. Valid Perfect Square
 * @author cartoon
 * @version 1.0
 */
public class Solution374 {

    /**
     * 1.关于复杂度
     *   1.1 时间复杂度为 O(log n)
     *   1.2 空间负责度为 O(1)
     * 2.我的解题思路
     *   2.1 这个解法基于二分查找
     *   2.2 定义左右指针
     *   2.3 使用二分查找寻找待猜数字
     *       2.3.1 计算中间索引
     *       2.3.2 当前中间元素对比 guess 函数返回的结果
     * 3.提交记录
     *   3.1 力扣中耗时 1ms,消耗 34.8MB 内存
     *   3.2 leetcode 中耗时 0ms,消耗 34.3MB 内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(log n)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 this solution is base on binary search
     *     2.2 define two pointer left and right where index in 0 and n
     *     2.3 use a binary search to get square
     *               2.3.1 cal the mid
     *               2.3.2 compare the mid to result from function guess return value
     * 3.About submit record
     *     3.1 1ms and 34.8MB memory in LeetCode China
     *     3.2 0ms and 34.3MB memory in LeetCode
     * 4.Q&A
     * @param n
     * @return
     */
    public int guessNumber(int n) {
        int i = 1;
        int j = n;
        while (i <= j) {
            int mid = i + ((j - i) >> 1);
            if (guess(mid) == 0) {
                return mid;
            }
            if (guess(mid) == 1) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return -1;
    }

    /**
     * this function is used to imitate source title's function
     * @param num
     * @return
     */
    private int guess(int num) {
        return 0;
    }
}
