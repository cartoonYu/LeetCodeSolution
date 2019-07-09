/**
 * Problem
 *     162.Find Peak Element
 *     https://leetcode.com/problems/find-peak-element/
 * Grade of difficulty
 *     Medium
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution162 {

    /**
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
        if(nums==null||nums.length==0){
            return 0;
        }
        int i=0,j=nums.length-1;
        while(i<j){
            int mid=i+((j-i)>>1);
            if(nums[mid]>nums[mid+1]){
                j=mid;
            }
            else{
                i=mid+1;
            }
        }
        return i;
    }

    private int index;

    /**
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
        if(nums==null||nums.length==0){
            return 0;
        }
        if(nums.length<2){
            return 0;
        }
        if(nums.length<3){
            return nums[0]>nums[1]?0:1;
        }
        binarySearch(nums,0,nums.length-1);
        return index;
    }

    private void binarySearch(int[] nums,int i,int j){
        if(i>j){
            return;
        }
        int mid=i+((j-i)>>1);
        if(mid>0&&mid<nums.length-1){
            if(nums[mid]>nums[mid-1]&&nums[mid]>nums[mid+1]){
                index=mid;
                return;
            }
        }
        else{
            if(mid==0){
                if(nums[mid]>nums[mid+1]){
                    index=mid;
                    return;
                }
            }
            else{
                if(nums[mid]>nums[mid-1]){
                    index=mid;
                    return;
                }
            }
        }
        binarySearch(nums,i,mid-1);
        binarySearch(nums,mid+1,j);
    }
}
