package org.LeetcodeSolution.Array;

/**
 * Problem
 *     1512.Number of Good Pairs
 *     https://leetcode.com/problems/number-of-good-pairs/
 *     https://leetcode-cn.com/problems/number-of-good-pairs/
 * Grade of difficulty
 *     Easy
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution1512 {

    /**
     * 1.关于复杂度
     *   1.1 时间复杂度为 O(n^2)
     *   1.2 空间负责度为 O(1)
     * 2.我的解题思路
     *   2.1 双重循环遍历数组，主循环为 0 到 数组长度，次循环为 0 到主循环位置，若两个循环当前元素相等，结果变量自增
     * 3.提交记录
     *   3.1 力扣中耗时 1ms,消耗 37.2MB 内存
     *   3.2 leetcode 中耗时 1ms,消耗 38.7MB 内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n^2)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 double circulate array, primary circulation is 0 to nums.length, minor circulation is 0 to primary circulation index, if two circulation element are the same, plus result
     * 3.About submit record
     *     3.1 1ms and 37.2MB memory in LeetCode China
     *     3.2 1ms and 38.7MB memory in LeetCode
     * 4.Q&A
     * @param nums
     * @return
     */
    public int numIdenticalPairs(int[] nums) {
        int res = 0;
        for(int i = 0, length = nums.length; i < length; i++){
            for(int j = i + 1; j < length; j++){
                if(nums[i] == nums[j]){
                    res++;
                }
            }
        }
        return res;
    }

}
