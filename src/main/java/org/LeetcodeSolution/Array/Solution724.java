package org.LeetcodeSolution.Array;

/**
 * Problem
 *     724.Find Pivot Index
 *     https://leetcode.com/problems/find-pivot-index/
 *     https://leetcode-cn.com/problems/find-pivot-index/
 * Grade of difficulty
 *     Easy
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution724 {

    /**
     * 1.关于复杂度
     *   1.1 时间复杂度为 O(n)
     *   1.2 空间负责度为 O(1)
     * 2.我的解题思路
     *   2.1 循环遍历数组将所有数加到 right 变量中
     *   2.2 先用首元素减掉 right 变量，然后跟 left 变量对比
     *   2.3 循环遍历数组，不断减掉 right 变量以及加上 left 变量，对比返回
     * 3.提交记录
     *   3.1 力扣中耗时2ms,消耗39MB内存
     *   3.2 leetcode中耗时1ms,消耗40MB内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 circulate array first fill all num to variable right
     *     2.2 subtract right with first num and compare with current variable left
     *     2.3 circulate array,subtract variable right and increase variable left and compare
     * 3.About submit record
     *     3.1 2ms and 39MB memory in LeetCode China
     *     3.2 1ms and 40MB memory in LeetCode
     * 4.Q&A
     *
     * @param nums
     * @return
     */
    public int pivotIndex(int[] nums) {
        if(nums==null||nums.length==0){
            return -1;
        }
        int left=0,right=0;
        for(int num:nums){
            right+=num;
        }
        right-=nums[0];
        if(right==left){
            return 0;
        }
        for(int i=1,length=nums.length;i<length;i++){
            right-=nums[i];
            left+=nums[i-1];
            if(right==left){
                return i;
            }
        }
        return -1;
    }

}
