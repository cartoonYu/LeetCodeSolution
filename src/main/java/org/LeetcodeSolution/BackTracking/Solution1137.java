package org.LeetcodeSolution.BackTracking;

/**
 * Problem
 *     1137.N-th Tribonacci Number
 *     https://leetcode.com/problems/n-th-tribonacci-number/
 *     https://leetcode-cn.com/problems/n-th-tribonacci-number/
 * Grade of difficulty
 *     Easy
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution1137 {

    /**
     * 1.关于复杂度
     *   1.1 时间复杂度为 O(n)
     *   1.2 空间负责度为 O(1)
     * 2.我的解题思路
     *   2.1 排除 n < 3 的情况
     *   2.2 定义一个数组记录最近三个元素的情况
     *   2.3 循环遍历 3 到 n，将 2.2 的数组元素全加起来并赋值给 res， 前移 2.2 数组一位，将 2.2 数组最后一位元素设为 res
     * 3.提交记录
     *   3.1 力扣中耗时 0ms,消耗 34.9MB 内存
     *   3.2 leetcode 中耗时 0ms,消耗 35.4MB 内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 exclude when n < 3
     *     2.2 define a array which contains with last three number
     *     2.3 circulate 3 to n, plus 2.2 array element to res, move 2.2 array forward, set 2.2 array's last element with res
     * 3.About submit record
     *     3.1 0ms and 34.9MB memory in LeetCode China
     *     3.2 0ms and 35.4MB memory in LeetCode
     * 4.Q&A
     * @param n
     * @return
     */
    public int tribonacci(int n) {
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        if(n == 2){
            return 1;
        }
        int res = 0;
        int[] nums = new int[3];
        nums[0] = 0;
        nums[1] = 1;
        nums[2] = 1;
        for(int i = 3; i <= n; i++){
            res = nums[0] + nums[1] + nums[2];
            nums[0] = nums[1];
            nums[1] = nums[2];
            nums[2] = res;
        }
        return res;
    }

}
