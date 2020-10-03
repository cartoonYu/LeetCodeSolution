package org.LeetcodeSolution.Array;

/**
 * Problem
 *     665.Non-decreasing Array
 *     https://leetcode.com/problems/non-decreasing-array/
 *     https://leetcode-cn.com/problems/non-decreasing-array/
 * Grade of difficulty
 *     Easy
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution665 {

    /**
     * 1.关于复杂度
     *     1.1 时间复杂度为O(n)
     *     1.2 空间负责度为O(1)
     * 2.我的解题思路
     *     2.1 循环遍历数组，有三种情况
     *         2.1.1 nums[i]>=nums[i-1],符合题意
     *         2.1.2 nums[i-2]>nums[i],表示nums[i-1]会小于nums[i-2],所以我们将nums[i]设置为nums[i-1]
     *         2.1.3 nums[i-2]<=nums[i],将nums[i-1]设为nums[i]会符合题意
     * 3.提交记录
     *     3.1 力扣中耗时2ms,消耗49.5MB内存
     *     3.2 leetcode中耗时1ms,消耗46.2MB内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 circulate array from head to tail,there have three condition
     *         2.1.1 nums[i]>=nums[i-1],conform to topic's mean
     *         2.1.2 nums[i-2]>nums[i],it means nums[i-1] will be smaller than nums[i-2],so we set nums[i] to nums[i-1]
     *         2.1.3 nums[i-2]<=nums[i],set nums[i-1] to nums[i] will conform topic's mean
     * 3.About submit record
     *     3.1 2ms and 49.5MB memory in LeetCode China
     *     3.2 1ms and 46.2MB memory in LeetCode
     * 4.Q&A
     *
     * @param nums
     * @return
     */
    public boolean checkPossibility(int[] nums) {
        if(nums==null||nums.length<2){
            return true;
        }
        int flag=0;
        for(int i=1,length=nums.length;i<length&&flag<2;i++){
            if(nums[i]>=nums[i-1]){
                continue;
            }
            flag++;
            if(i-2>=0&&nums[i]<nums[i-2]){
                nums[i]=nums[i-1];
            }
            else{
                nums[i-1]=nums[i];
            }
        }
        return flag<2;
    }
}
