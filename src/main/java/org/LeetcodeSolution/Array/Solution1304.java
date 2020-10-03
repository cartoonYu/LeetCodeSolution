package org.LeetcodeSolution.Array;

/**
 * Problem
 *     1304.Find N Unique Integers Sum up to Zero
 *     https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/
 *     https://leetcode-cn.com/problems/find-n-unique-integers-sum-up-to-zero/
 * Grade of difficulty
 *     Easy
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution1304 {

    /**
     * 1.关于复杂度
     *   1.1 时间复杂度为 O(n)
     *   1.2 空间负责度为 O(n)
     * 2.我的解题思路
     *   2.1 这个解法基于双指针
     *   2.2 定义两个指针分别位于中间元素的两侧，定义一个基数
     *   2.3 循环遍历到边界，逐步增大基数并赋值
     * 3.提交记录
     *   3.1 力扣中耗时 0ms,消耗 37.7MB 内存
     *   3.2 leetcode 中耗时 0ms,消耗 39.5MB 内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(n)
     * 2.how I solve
     *     2.1 this solution is base on two-pointer
     *     2.2 define two pointer which are behind with middle index, define a cardinal number
     *     2.3 circulate to two boarder, increase cardinal number and return
     * 3.About submit record
     *     3.1 0ms and 37.7MB memory in LeetCode China
     *     3.2 0ms and 39.5MB memory in LeetCode
     * 4.Q&A
     *
     * @param n
     * @return
     */
    public int[] sumZero(int n) {
        int[] res = new int[n];
        int left = n / 2 - 1, right = n % 2 == 0 ? n / 2 : n / 2 + 1;
        int num = 1;
        while(left >= 0 && right < n){
            res[left--] = num;
            res[right++] = -num;
            num += 1;
        }
        return res;
    }
}
