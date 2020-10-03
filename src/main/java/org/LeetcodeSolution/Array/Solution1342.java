package org.LeetcodeSolution.Array;

/**
 * Problem
 *     1342. Number of Steps to Reduce a Number to Zero
 *     https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/
 *     https://leetcode-cn.com/problems/number-of-steps-to-reduce-a-number-to-zero/
 * Grade of difficulty
 *     Easy
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution1342 {

    /**
     * 1. 关于复杂度
     *   1.1 时间复杂度为 O(n)
     *   1.2 空间负责度为 O(1)
     * 2. 我的解题思路
     *   2.1 简单的数学运算
     * 3. 提交记录
     *   3.1 力扣中耗时0ms,消耗36.5MB内存
     *   3.2 leetcode中耗时0ms,消耗36.4MB内存
     * 4. Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 simple solution with arithmetical operation
     * 3.About submit record
     *     3.1 0ms and 36.5MB memory in LeetCode China
     *     3.2 0ms and 36.4MB memory in LeetCode
     * 4.Q&A
     *
     * @param num
     * @return
     */
    public int numberOfSteps (int num) {
        int cnt = 0;
        while(num != 0){
            if(num % 2 == 0){
                num /= 2;
            } else{
                num -= 1;
            }
            cnt++;
        }
        return cnt;
    }
}
