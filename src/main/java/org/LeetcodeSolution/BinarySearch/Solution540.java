package org.LeetcodeSolution.BinarySearch;

/**
 * Problem
 *      540.Single Element in a Sorted Array
 *      https://leetcode.com/problems/single-element-in-a-sorted-array/
 *      https://leetcode-cn.com/problems/single-element-in-a-sorted-array/
 * Grade of difficulty
 *      Medium
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution540 {

    /**
     * 1.关于复杂度
     *     1.1 时间复杂度为O(log n)
     *     1.2 空间负责度为O(1)
     * 2.我的解题思路
     *     2.1 这个算法基于二分查找
     *     2.2 对比当前值以及相邻值，递归继续找到合适的值
     * 3.提交记录
     *     3.1 力扣中耗时1ms,消耗59.3MB内存
     *     3.2 leetcode中耗时0ms,消耗37.4MB内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(log n)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 this solution is base on binary search
     *     2.2 compare mid element to adjacent element,recurse with mid+1 to i or mid-1 to j
     * 3.About submit record
     *     3.1 1ms and 59.3MB memory in LeetCode China
     *     3.2 0ms and 37.4MB memory in LeetCode
     * 4.Q&A
     */
    private int num=-1;

    public int singleNonDuplicate(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        if(nums.length==1){
            return nums[0];
        }
        binarySearch(nums,0,nums.length-1);
        return num;
    }

    private void binarySearch(int[] nums,int i,int j){
        if(i<0||j>nums.length-1||i>j){
            return;
        }
        int mid=i+((j-i)>>1);
        if(mid==0){
            if(nums[mid]!=nums[mid+1]){
                num=nums[mid];
                return;
            }
        }
        else{
            if(mid==nums.length-1){
                if(nums[mid]!=nums[mid-1]){
                    num=nums[mid];
                    return;
                }
            }
            else{
                if(nums[mid]!=nums[mid-1]&&nums[mid]!=nums[mid+1]){
                    num=nums[mid];
                    return;
                }
            }
        }
        binarySearch(nums,mid+1,j);
        binarySearch(nums,i,mid-1);
    }
}
