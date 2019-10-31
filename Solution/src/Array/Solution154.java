package Array;

/**
 * Problem
 *     154.Find Minimum in Rotated Sorted Array II
 *     https://leetcode.com/problems/find-minimum-in-rotated-sorted-array-ii/
 *     https://leetcode-cn.com/problems/find-minimum-in-rotated-sorted-array-ii/
 * Grade of difficulty
 *     Hard
 * Related topics
 *     153.Find Minimum in Rotated Sorted Array
 *     167.Two Sum II - Input array is sorted
 *     367. Valid Perfect Square
 *     374.Guess Number Higher or Lower
 * @author cartoon
 * @version 1.0
 */
public class Solution154 {

    /**
     * 1.关于复杂度
     *   1.1 时间复杂度为O(log n)
     *   1.2 空间负责度为O(1)
     * 2.我的解题思路
     *   2.1 这个解法基于二分查找，用右边界的值作为对比值
     *   2.2 传统的查找，但是在当前值等于对比值的情况下，右指针移向左一位
     * 3.提交记录
     *   3.1 力扣中耗时1ms,消耗38.9MB内存
     *   3.2 leetcode中耗时0ms,消耗43.1MB内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(log n)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 this solution is base on binary search,use right border element as correlative value
     *     2.2 traditional search,but when mid value equals correlative value,skip and move to left
     * 3.About submit record
     *     3.1 1ms and 38.9MB memory in LeetCode China
     *     3.2 0ms and 43.1MB memory in LeetCode
     * 4.Q&A
     * @param nums
     * @return
     */
    public int findMin(int[] nums) {
        if(nums==null||nums.length==0){
            return 0;
        }
        int left=0;
        int right=nums.length-1;
        int mid;
        while(left<right){
            mid=left+((right-left)>>1);
            if(nums[mid]==nums[right]){
                right--;
            }
            else if(nums[mid]<nums[right]){
                right=mid;
            }
            else{
                left=mid+1;
            }
        }
        return nums[left];
    }
}
