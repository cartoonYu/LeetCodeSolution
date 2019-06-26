import java.util.Arrays;

/**
 * Problem
 *     462.Minimum Moves to Equal Array Elements II
 *     https://leetcode.com/problems/minimum-moves-to-equal-array-elements-ii/
 * Grade of difficulty
 *     Medium
 * Related topics
 *     453.Minimum Moves to Equal Array Elements
 * @author cartoon
 * @version 1.0
 */
public class Solution462 {

    /**
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 this solution is base on median idea
     *     2.2 first exclude nums.length<2,cause answer is 0 for certain
     *     2.3 sort th array,define two pointer to circulate from head and tail,subtract each other
     * 3.About submit record
     *     3.1 4ms and 37.8MB memory in LeetCode China
     *     3.2 2ms and 37.8MB memory in LeetCode
     * 4.Q&A
     * @param nums
     * @return
     */
    public int minMoves2(int[] nums) {
        if(nums==null||nums.length<2){
            return 0;
        }
        Arrays.sort(nums);
        int i=0,j=nums.length-1,res=0;
        while(i<j){
            res+=nums[j--]-nums[i++];
        }
        return res;
    }
}
