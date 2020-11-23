package org.LeetcodeSolution.Array;

/**
 * Problem
 *     1365. How Many Numbers Are Smaller Than the Current Number
 *     https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number
 *     https://leetcode-cn.com/problems/how-many-numbers-are-smaller-than-the-current-number
 * Grade of difficulty
 *     Easy
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution1365 {

    /**
     * 1. 关于复杂度
     *   1.1 时间复杂度为 O(n)
     *   1.2 空间负责度为 O(n)
     * 2. 我的解题思路
     *   2.1 依据题目规则预设一个长度为101的数组
     *   2.2 计算各个数字出现在源数组的个数
     *   2.3 计算小于当前数字的个数总和并返回
     * 3. 提交记录
     *   3.1 力扣中耗时1ms,消耗39.8MB内存
     *   3.2 leetcode中耗时1ms,消耗39.4MB内存
     * 4. Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(n)
     * 2.how I solve
     *     2.1 use title's rule to set a array which length is 101
     *     2.2 calculate number of every element of source array
     *     2.3 sum count of smaller than current number and return
     * 3.About submit record
     *     3.1 1ms and 39.8MB memory in LeetCode China
     *     3.2 1ms and 39.4MB memory in LeetCode
     * 4.Q&A
     * @param nums
     * @return
     */
    public int[] smallerNumbersThanCurrent(int[] nums) {
        if(nums == null || nums.length == 0){
            return nums;
        }
        int[] temp = new int[101];
        for(int num : nums){
            temp[num] ++;
        }
        for(int i = 1, length = temp.length; i < length; i++){
            temp[i] += temp[i - 1];
        }
        int[] res = new int[nums.length];
        for(int i = 0, length = nums.length; i < length; i++){
            if(nums[i] > 0){
                res[i] = temp[nums[i] - 1];
            }
        }
        return res;
    }

}
