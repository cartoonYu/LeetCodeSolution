/**
 * Problem
 *     283.Move Zeroes
 *     https://leetcode.com/problems/move-zeroes/submissions/
 * Grade of difficulty
 *     Easy
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution283 {

    /**
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 use two circulate to achieve it
     *     2.2 first circulate is to move none 0 to head and record border of none 0
     *     2.3 second circulate is to set 0 within border
     * 3.About submit record
     *     3.1 1ms and 41.6MB memory in LeetCode China
     *     3.2 0ms and 39.2MB memory in LeetCode
     * 4.Q&A
     * @param nums
     */
    public void moveZeroes(int[] nums) {
        if(nums.length==0){
            return ;
        }
        int flag=-1;
        for(int i=0,length=nums.length;i<length;i++){
            if(nums[i]!=0){
                nums[++flag]=nums[i];
            }
        }
        for(int j=nums.length-1;j>flag;j--){
            nums[j]=0;
        }
    }
}
