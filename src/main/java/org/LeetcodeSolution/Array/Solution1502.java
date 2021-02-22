package org.LeetcodeSolution.Array;

import java.util.Arrays;

/**
 * Problem
 *     1502.Can Make Arithmetic Progression From Sequence
 *     https://leetcode.com/problems/can-make-arithmetic-progression-from-sequence/
 *     https://leetcode-cn.com/problems/can-make-arithmetic-progression-from-sequence/
 * Grade of difficulty
 *     Easy
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution1502 {

    /**
     * 1.关于复杂度
     *   1.1 时间复杂度为 O(nlogn)
     *   1.2 空间负责度为 O(1)
     * 2.我的解题思路
     *   2.1 排序原始数组
     *   2.2 求出首两个元素差值
     *   2.3 循环遍历数组，如果相邻两个元素差值不等于 2.2 中数值，返回 false
     * 3.提交记录
     *   3.1 力扣中耗时 1ms,消耗 38MB 内存
     *   3.2 leetcode 中耗时 1ms,消耗 38.5MB 内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(nlogn)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 sort source array
     *     2.2 get first two element's subtract value
     *     2.3 circulate array, if each two element's subtract value isn't equals 2.2 value, return false
     * 3.About submit record
     *     3.1 1ms and 38MB memory in LeetCode China
     *     3.2 1ms and 38.5MB memory in LeetCode
     * 4.Q&A
     * @param arr
     * @return
     */
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int difference = arr[1] - arr[0];
        for(int index = 2, length = arr.length; index < length; index++){
            if(arr[index] - arr[index - 1] != difference){
                return false;
            }
        }
        return true;
    }
}
