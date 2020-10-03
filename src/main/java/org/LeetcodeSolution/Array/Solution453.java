package org.LeetcodeSolution.Array;

/**
 * Problem
 *      453.Minimum Moves to Equal Array Elements
 *      https://leetcode.com/problems/minimum-moves-to-equal-array-elements/
 *      https://leetcode-cn.com/problems/minimum-moves-to-equal-array-elements/
 * Grade of difficulty
 *      Easy
 * Related topics
 *      462.Minimum Moves to Equal Array Elements II
 * @author cartoon
 * @version 1.0
 */
public class Solution453 {

    /**
     * 1.关于复杂度
     *     1.1 时间复杂度为O(n)
     *     1.2 空间负责度为O(1)
     * 2.我的解题思路
     *     2.1 因为题目要求所有数都要增长成一样的，另一方面，它需要的次数与所有元素减少到最小值的次数是相同的
     *     2.2 统计数组中最小的元素以及数组所有元素的相加值
     *     2.3 计算减少到最小值所需的次数：sum-min*array.length
     * 3.提交记录
     *     3.1 力扣中耗时4ms,消耗49.2MB内存
     *     3.2 leetcode中耗时1ms,消耗40.3MB内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 cause the topic is ask for increase elements to be same,on the contrary,it is asking for each element to reduce 1
     *     2.2 static the min num of array and plus every element of array
     *     2.3 use sum to subtract min*array.length
     * 3.About submit record
     *     3.1 4ms and 49.2MB memory in LeetCode China
     *     3.2 1ms and 40.3MB memory in LeetCode
     * 4.Q&A
     *
     * @param nums
     * @return
     */
    public int minMoves(int[] nums) {
        int min=nums[0];
        int res=0;
        for(int temp:nums){
            res+=temp;
            if(min>temp){
                min=temp;
            }
        }
        return res-min*nums.length;
    }
}
