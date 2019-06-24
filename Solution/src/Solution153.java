/**
 * Problem
 *      153.Find Minimum in Rotated Sorted Array
 *      https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
 * Grade of difficulty
 *      Medium
 * Related topics
 *      167.Two Sum II - Input array is sorted
 *      367. Valid Perfect Square
 *      374.Guess Number Higher or Lower
 * @author cartoon
 * @version 1.0
 */
public class Solution153 {

    /**
     * 1.About Complexity
     *     1.1 Time Complexity is O(log n)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 this solution is base on usual binary search
     *     2.2 return value of index low
     * 3.About submit record
     *     3.1 1ms and 34.4MB memory in LeetCode China
     *     3.2 0ms and 39MB memory in LeetCode
     * 4.Q&A
     * @param nums
     * @return
     */
    public int findMin(int[] nums) {
        if(nums==null){
            return 0;
        }
        int low=0;
        int high=nums.length;
        int temp=nums[nums.length-1];
        while(low<high){
            int mid=low+((high-low)>>1);
            if(nums[mid]>temp){
                low=mid+1;
            }
            else{
                high=mid;
            }
        }
        return nums[low];
    }
}
