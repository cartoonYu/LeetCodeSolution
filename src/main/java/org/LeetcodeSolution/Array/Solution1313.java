package org.LeetcodeSolution.Array;

import java.util.Arrays;

/**
 * Problem
 *     1313.Decompress Run-Length Encoded List
 *     https://leetcode.com/problems/decompress-run-length-encoded-list/
 *     https://leetcode-cn.com/problems/decompress-run-length-encoded-list/
 * Grade of difficulty
 *     Easy
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution1313 {

    /**
     * 1.关于复杂度
     *   1.1 时间复杂度为 O(n)
     *   1.2 空间负责度为 O(n)
     * 2.我的解题思路
     *   2.1 循环遍历数组计算结果数组的长度
     *   2.2 循环遍历数组，用数组每两个元素计算的结果填充结果数组
     * 3.提交记录
     *   3.1 力扣中耗时 0ms,消耗 39.3MB 内存
     *   3.2 leetcode 中耗时 1ms,消耗 44.6MB 内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(n)
     * 2.how I solve
     *     2.1 circulate array with each two element to get result array length
     *     2.2 circulate array, fill result array with each two element calculate result
     * 3.About submit record
     *     3.1 0ms and 39.3MB memory in LeetCode China
     *     3.2 1ms and 44.6MB memory in LeetCode
     * 4.Q&A
     * @param nums
     * @return
     */
    public int[] decompressRLElist(int[] nums) {
        int resLength = 0;
        for(int index = 0, length = nums.length; index < length; index += 2){
            resLength += nums[index];
        }
        int[] res = new int[resLength];
        int resIndex = 0;
        for(int index = 0, length = nums.length; index < length; index += 2){
            Arrays.fill(res, resIndex, resIndex + nums[index], nums[index + 1]);
            resIndex += nums[index];
        }
        return res;
    }
}
