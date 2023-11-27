package org.LeetcodeSolution.Array;

import java.util.List;

/**
 * Problem
 *     <a href="https://leetcode.com/problems/count-pairs-whose-sum-is-less-than-target/description/">leetcode.com</a>
 *     <a href="https://leetcode.cn/problems/count-pairs-whose-sum-is-less-than-target/description/">leetcode.cn</a>
 * <br/>Grade of difficulty<br/>
 *     Easy
 * @author cartoon
 * @version 1.0
 */
public class Solution2824 {

    /**
     * 1.About Complexity
     *     1.1 Time Complexity is O(n^2)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 as title say, double traverse array(i < j), plus i and j element and compare target and plus result
     * 3.Q&A
     * @param nums source array
     * @param target target number
     * @return count result
     */
    public int countPairs(List<Integer> nums, int target) {
        int result = 0, length = nums.size();
        for(int i = 0; i < length - 1; i++){
            for(int j = i + 1; j < length; j++){
                if(nums.get(i) + nums.get(j) < target){
                    result++;
                }
            }
        }
        return result;
    }
}
