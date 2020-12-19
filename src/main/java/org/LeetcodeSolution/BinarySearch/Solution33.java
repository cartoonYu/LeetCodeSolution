package org.LeetcodeSolution.BinarySearch;

/**
 * Problem
 *      33.Search in Rotated Sorted Array
 *      https://leetcode.com/problems/search-in-rotated-sorted-array/
 *      https://leetcode-cn.com/problems/search-in-rotated-sorted-array/
 * Grade of difficulty
 *      Medium
 * Related topics
 *      34.Find First and Last Position of Element in Sorted Array
 *      35.Search Insert Position
 *      278.First Bad Version
 * @author cartoon
 * @version 1.0
 */
public class Solution33 {

    /**
     * 1.关于复杂度
     *     1.1 时间复杂度为O(log n)
     *     1.2 空间负责度为O(1)
     * 2.我的解题思路
     *     2.1 这个算法参考程序员小灰的微信公众号：https://mp.weixin.qq.com/s/33aOwDGFQ5omE3sHmVLXVA
     *     2.2 关于旋转点以及中间值一共有两种情况，加上目标值总共有四种
     *         2.2.1 中间值在旋转点的左侧
     *               2.2.1.1 目标在旋转点左侧，所以可推断出：nums[target]<target<nums[mid]
     *               2.2.1.2 目标在旋转点右侧，推断出：!(nums[start]<=target<nums[mid])
     *         2.2.2 中间值在旋转点右侧
     *               2.2.1.1 目标在旋转点左侧，所以可推断出：target<nums[mid]<target<=nums[end]
     *               2.2.1.2 目标在旋转点右侧，推断出：!(target<nums[mid]<target<=nums[end])
     *     2.3 根据2.2的四种情况，二分查找
     * 3.提交记录
     *     3.1 力扣中耗时1ms,消耗35.5MB内存
     *     3.2 leetcode中耗时0ms,消耗39.7MB内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(log n)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 the solution is base on 程序员小灰's WeChat office account:https://mp.weixin.qq.com/s/33aOwDGFQ5omE3sHmVLXVA
     *     2.2 there have two situation between rotate point and middle num
     *          ,if plus target's situation,there have four
     *          2.2.1 middle num is in the left side of rotate point
     *                2.2.1.1 target is in the left side of middle num,so we can infer:nums[target]<target<nums[mid]
     *                2.2.1.2 target is in the right side of middle num,so we can infer:!(nums[start]<=target<nums[mid])
     *          2.2.2 middle num is in the right side of rotate point
     *                2.2.2.1 target is in the left side of middle num,so we can infer:target<nums[mid]<target<=nums[end]
     *                2.2.2.2 target is in the right side of middle num,so we can infer:!(target<nums[mid]<target<=nums[end])
     *     2.3 according to the four situation,we can set a circulate to move start and end like usual binary search
     *     2.4 if you have WeChat,I recommend you to focus 程序员小灰,I think his arithmetic explain is fun and easy to understand
     * 3.About submit record
     *     3.1 1ms and 35.5MB memory in LeetCode China
     *     3.2 0ms and 39.7MB memory in LeetCode
     * 4.Q&A
     *
     * @param nums
     * @param target
     * @return
     */
    public int search(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        while (start <= end) {
            int mid = start + ((end - start) >> 1);
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] >= nums[start]) {
                if (nums[start] <= target && target < nums[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (nums[mid] < target && target <= nums[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
