package org.LeetcodeSolution.Array;

/**
 * Problem
 *     867.Transpose Matrix
 *     https://leetcode.com/problems/transpose-matrix/
 *     https://leetcode-cn.com/problems/transpose-matrix/
 * Grade of difficulty
 *     Easy
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution867 {

    /**
     * 1.关于复杂度
     *   1.1 时间复杂度为 O(n)
     *   1.2 空间负责度为 O(n)
     * 2.我的解题思路
     *   2.1 创建一个大小为源矩阵的转置矩阵大小的矩阵
     *   2.2 循环遍历源矩阵，将值放入对应的转置矩阵位置中
     * 3.提交记录
     *   3.1 力扣中耗时1ms,消耗38.4MB内存
     *   3.2 leetcode中耗时0ms,消耗38.3MB内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(n)
     * 2.how I solve
     *     2.1 create a matrix which its size is transpose source matrix size
     *     2.2 circulate source matrix and put element to rotate matrix
     * 3.About submit record
     *     3.1 1ms and 38.4MB memory in LeetCode China
     *     3.2 0ms and 38.3MB memory in LeetCode
     * 4.Q&A
     *
     * @param A
     * @return
     */
    public int[][] transpose(int[][] A) {
        if (A == null || A.length == 0) {
            return A;
        }
        int[][] res = new int[A[0].length][A.length];
        for (int i = 0, len1 = A.length; i < len1; i++) {
            for (int j = 0, len2 = A[i].length; j < len2; j++) {
                res[j][i] = A[i][j];
            }
        }
        return res;
    }
}
