package org.LeetcodeSolution.Array;

import java.util.Arrays;

/**
 * Problem
 *     561.Array Partition I
 *     https://leetcode.com/problems/array-partition-i/
 *     https://leetcode-cn.com/problems/array-partition-i/
 * Grade of difficulty
 *     Easy
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution561 {

    /**
     * 1.关于复杂度
     *   1.1 时间复杂度为O(n log n)
     *   1.2 空间负责度为O(1)
     * 2.我的解题思路
     *   2.1 根据规律，结果为奇数索引上的值相加
     *   2.2 对数组进行排序
     *   2.3 将奇数索引上的值相加并返回
     * 3.提交记录
     *   3.1 力扣中耗时18ms,消耗39MB内存
     *   3.2 leetcode中耗时14ms,消耗39MB内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n log n)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 according to the rule,the result is the sum of the values on the odd index
     *     2.2 sort result first
     *     2.3 add every values on the odd index and return
     * 3.About submit record
     *     3.1 18ms and 39MB memory in LeetCode China
     *     3.2 14ms and 39MB memory in LeetCode
     * 4.Q&A
     *
     * @param nums
     * @return
     */
    public int arrayPairSum(int[] nums) {
        if(nums==null||nums.length==0){
            return 0;
        }
        int res=0;
        Arrays.sort(nums);
        for(int i=0,length=nums.length;i<length;i+=2){
            res+=nums[i];
        }
        return res;
    }

}
