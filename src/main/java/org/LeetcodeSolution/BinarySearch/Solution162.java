package org.LeetcodeSolution.BinarySearch;

/**
 * Problem
 *     162.Find Peak Element
 *     https://leetcode.com/problems/find-peak-element/
 *     https://leetcode-cn.com/problems/find-peak-element/
 * Grade of difficulty
 *     Medium
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution162 {

    /**
     * 1.关于复杂度
     *     1.1 时间复杂度为O(log n)
     *     1.2 空间负责度为O(1)
     * 2.我的解题思路
     *     2.1 这个解法基于二分查找
     *     2.2 对比中间值以及右侧的值，有两种情况
     *         2.2.1 中间值大于右侧值，将右指针改成mid
     *         2.2.2 中间值小于等于右侧值，左指针改为mid+1
     * 3.提交记录
     *     3.1 力扣中耗时1ms,消耗36.8MB内存
     *     3.2 leetcode中耗时0ms,消耗38MB内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(log n)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 this solution is base on binary search
     *     2.2 compare mid val to its right val,there have two condition
     *          2.2.1 mid val is bigger than its right val,make j=mid
     *          2.2.2 mid val is smaller than or equals its right val,make i=mid+1
     *     2.3 return i
     * 3.About submit record
     *     3.1 1ms and 36.8MB memory in LeetCode China
     *     3.2 0ms and 38MB memory in LeetCode
     * 4.Q&A
     * @param nums
     * @return
     */
    public int findPeakElement(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int i = 0, j = nums.length - 1;
        while (i < j) {
            int mid = i + ((j - i) >> 1);
            if (nums[mid] > nums[mid + 1]) {
                j = mid;
            } else {
                i = mid + 1;
            }
        }
        return i;
    }

    private int index;

    /**
     * 1.关于复杂度
     *     1.1 时间复杂度为O(log n)
     *     1.2 空间负责度为O(1)
     * 2.我的解题思路
     *     2.1 这个解法基于二分查找
     *     2.2 利用当前左右边界计算中间索引，对比中间索引的值以及左右侧的值，有三种情况
     *         2.2.1 mid==0，对比中间值以及右侧的值
     *         2.2.2 mid==nums.length,对比中间值及其左侧的值
     *         2.2.3 其余情况同时对比左右侧的值
     *     2.3 递归遍历基于中间索引的左右边界
     * 3.提交记录
     *     3.1 力扣中耗时2ms,消耗36.9MB内存
     *     3.2 leetcode中耗时0ms,消耗38.2MB内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(log n)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 this solution is base on binary search
     *     2.2 calculate mid of index,compare mid val and its behind val,there have three condition
     *          2.2.1 mid==0,compare mid val to its right val
     *          2.2.2 mid==nums.length,compare mid val to its left val
     *          2.2.3 other condition,compare mid val and its left and right val
     *     2.3 recurse to go though left side and right side and return index
     * 3.About submit record
     *     3.1 2ms and 36.9MB memory in LeetCode China
     *     3.2 0ms and 38.2MB memory in LeetCode
     * 4.Q&A
     * @param nums
     * @return
     */
    public int findPeakElementByTraditionalSearch(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        if (nums.length < 2) {
            return 0;
        }
        if (nums.length < 3) {
            return nums[0] > nums[1] ? 0 : 1;
        }
        binarySearch(nums, 0, nums.length - 1);
        return index;
    }

    private void binarySearch(int[] nums, int i, int j) {
        if (i > j) {
            return;
        }
        int mid = i + ((j - i) >> 1);
        if (mid > 0 && mid < nums.length - 1) {
            if (nums[mid] > nums[mid - 1] && nums[mid] > nums[mid + 1]) {
                index = mid;
                return;
            }
        } else {
            if (mid == 0) {
                if (nums[mid] > nums[mid + 1]) {
                    index = mid;
                    return;
                }
            } else {
                if (nums[mid] > nums[mid - 1]) {
                    index = mid;
                    return;
                }
            }
        }
        binarySearch(nums, i, mid - 1);
        binarySearch(nums, mid + 1, j);
    }
}
