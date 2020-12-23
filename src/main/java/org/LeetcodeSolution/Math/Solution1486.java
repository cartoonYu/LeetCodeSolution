package org.LeetcodeSolution.Math;

/**
 * Problem
 *     1486.XOR Operation in an Array
 *     https://leetcode.com/problems/xor-operation-in-an-array/
 *     https://leetcode-cn.com/problems/xor-operation-in-an-array/
 * Grade of difficulty
 *     Easy
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution1486 {

    /**
     * 1.关于复杂度
     *   1.1 时间复杂度为 O(n)
     *   1.2 空间负责度为 O(1)
     * 2.我的解题思路
     *   2.1 遍历数组，对每个元素做异或操作
     * 3.提交记录
     *   3.1 力扣中耗时 0ms,消耗 35.5MB 内存
     *   3.2 leetcode 中耗时 0ms,消耗 35.6MB 内存
     * 4.Q&A
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 circulate array and operate xor to every element
     * 3.About submit record
     *     3.1 0ms and 35.5MB memory in LeetCode China
     *     3.2 0ms and 35.6MB memory in LeetCode
     * 4.Q&A
     * @param n
     * @param start
     * @return
     */
    public int xorOperation(int n, int start) {
        int res = 0;
        for(int i = 0; i < n; i++){
            res ^= start + 2 * i;
        }
        return res;
    }
}
