/**
 * Problem
 *      453.Minimum Moves to Equal Array Elements
 *      https://leetcode.com/problems/minimum-moves-to-equal-array-elements/
 * Grade of difficulty
 *      Easy
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution453 {

    /**
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 cause the topic is ask for increase elements to be same,on the contrary,it is asking for each element to reduce 1
     *     2.2 static the min num of array and plus every element of array
     *     2.3 use sum to subtract min*array.length
     * 3.About submit record
     *     3.1 4ms and 49.2MB memory in LeetCode China
     *     3.2 1ms and 40.3MB memory in LeetCode
     * 4.Q&A
     *
     * @param nums
     * @return
     */
    public int minMoves(int[] nums) {
        int min=nums[0];
        int res=0;
        for(int temp:nums){
            res+=temp;
            if(min>temp){
                min=temp;
            }
        }
        return res-min*nums.length;
    }
}
