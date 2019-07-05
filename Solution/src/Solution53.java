/**
 * Problem
 *      53.Maximum Subarray
 *      https://leetcode.com/problems/maximum-subarray/
 * Grade of difficulty
 *      Easy
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution53 {

    /**
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 this solution is base on dynamic planning
     *     2.2 circulate 1 to n traverse array and use a result and sum to cache val
     *          2.2.1 if array[current]<0,sum=array[current]
     *          2.2.2 if array[current]>0,sum=sum+array[current]
     *          2.2.3 compare the sum and result to determine result's value
     * 3.About submit record
     *     3.1 2ms and 37.9MB memory in LeetCode China
     *     3.2 1ms and 38.1MB memory in LeetCode
     * 4.Q&A
     *
     * @param nums
     * @return
     */
    public int maxSubArray(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        if(nums.length==1){
            return nums[0];
        }
        int result=nums[0];
        int sum=0;
        for(int num:nums){
            sum=sum>0?sum+num:num;
            result=Math.max(result,sum);
        }
        return result;
    }
}
