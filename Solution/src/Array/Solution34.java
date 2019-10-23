package Array;

/**
 * Problem
 *      34.Find First and Last Position of Element in Sorted Array
 *      https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
 *      https://leetcode-cn.com/problems/find-first-and-last-position-of-element-in-sorted-array/
 * Grade of difficulty
 *      Medium
 * Related topics
 *      33.Search in Rotated Sorted Array
 *      35.Search Insert Position
 *      278.First Bad Version
 * @author cartoon
 * @version 1.0
 */
public class Solution34 {

    /**
     * 1.关于复杂度
     *   1.1 时间复杂度为O(log n)
     *   1.2 空间负责度为O(1)
     * 2.我的解题思路
     *   2.1 定义两个指针
     *   2.2 二分查找源数组找出给定target的左边界
     *   2.3 标记左边界，二分查找左边界到数组末尾找出给定target的右边界
     * 3.提交记录
     *   3.1 力扣中耗时1ms,消耗40.8MB内存
     *   3.2 leetcode中耗时0ms,消耗39.2MB内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(log n)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 define two point
     *     2.2 use binary search with 1 to nums.length to find left boundary
     *     2.3 mark left boundary and continue use binary search with left bound to nums.length to find right boundary
     * 3.About submit record
     *     3.1 1ms and 40.8MB memory in LeetCode China
     *     3.2 0ms and 39.2MB memory in LeetCode
     * 4.Q&A
     *
     * @param nums
     * @param target
     * @return
     */
    public int[] searchRange(int[] nums, int target) {
        int[] res=new int[]{-1,-1};
        if(nums.length==0){
            return res;
        }
        if(target<nums[0]||target>nums[nums.length-1]){
            return res;
        }
        int i=0,j=nums.length-1;
        while(i<=j){
            int mid=i+((j-i)>>1);
            if(nums[mid]>=target){
                j=mid-1;
            }
            else{
                i=mid+1;
            }
        }
        if(nums[i]!=target){
            return res;
        }
        res[0]=i;
        j=nums.length-1;
        while(i<=j){
            int mid=i+((j-i)>>1);
            if(nums[mid]>target){
                j=mid-1;
            }
            else{
                i=mid+1;
            }
        }
        res[1]=j;
        return res;
    }
}
