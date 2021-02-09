package org.LeetcodeSolution.DynamicPlanning;

/**
 * Problem
 *     718.Maximum Length of Repeated Subarray
 *     https://leetcode.com/problems/maximum-length-of-repeated-subarray/
 *     https://leetcode-cn.com/problems/maximum-length-of-repeated-subarray/
 * Grade of difficulty
 *     Medium
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution718 {

    /**
     * 1.关于复杂度
     *     1.1 时间复杂度为O(n+m)(n是A的长度，m是B的长度)
     *     1.2 空间负责度为O(n+m)
     * 2.我的解题思路
     *     2.1 画表格得到了一个规律：当A B当前索引元素相等时，dp[i][j]=dp[i-1][j-1]+1
     *     2.2 根据2.1的规律，就是一个简单的动态规划
     * 3.提交记录
     *     3.1 力扣中耗时92ms,消耗69.3MB内存
     *     3.2 leetcode中耗时43ms,消耗50.7MB内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n+m)(n is A.length,m is B.length)
     *     1.2 Space Complexity is O(n+m)
     * 2.how I solve
     *     2.1 I draw a form and form a rule:if A[i]=B[j],dp[i][j]=dp[i-1][j-1]+1
     *     2.2 according to 2.1 rule,there is a general dynamic planning
     * 3.About submit record
     *     3.1 92ms and 69.3MB memory in LeetCode China
     *     3.2 43ms and 50.7MB memory in LeetCode
     * 4.Q&A
     * @param A
     * @param B
     * @return
     */
    public int findLength(int[] A, int[] B) {
        if (A == null || B == null || A.length == 0 || B.length == 0) {
            return 0;
        }
        int[][] temp = new int[A.length][B.length];
        int res = Integer.MIN_VALUE;
        for (int i = 0, l1 = A.length; i < l1; i++) {
            for (int j = 0, l2 = B.length; j < l2; j++) {
                if (A[j] == B[i]) {
                    if (i == 0 || j == 0) {
                        temp[i][j] = 1;
                    } else {
                        temp[i][j] = temp[i - 1][j - 1] + 1;
                    }
                }
                res = Math.max(temp[i][j], res);
            }
        }
        return res;
    }
}
