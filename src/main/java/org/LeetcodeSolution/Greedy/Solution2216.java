package org.LeetcodeSolution.Greedy;

/**
 * Problem
 *     <a href="https://leetcode.com/problems/minimum-deletions-to-make-array-beautiful/description/">leetcode.com</a>
 *     <a href="https://leetcode.cn/problems/minimum-deletions-to-make-array-beautiful/description/">leetcode.cn</a>
 * Grade of difficulty
 *     Medium
 * @author cartoon
 * @version 1.0
 */
public class Solution2216 {

    /**
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 traverse array, define pointer to record delete count there have two situation
     *          2.1.1 current element is equals next element, record delete count, move pointer to next and keep roll
     *          2.1.2 current element is not equals next element, skip next element and keep traverse
     *     2.2 if array length substract delete count is odd number, plus one to delete count(question ask array length is even number)
     * 3.Q&A
     * @param nums source array
     * @return result
     */
    public int minDeletion(int[] nums) {
        int result = 0, length = nums.length, index;
        for(int i = 0; i < length; i++){
            index = i + 1;
            while(index < length && nums[i] == nums[index]){
                result++;
                index++;
            }
            i = index;
        }
        return (length - result) % 2 == 0 ? result : result + 1;
    }
}
