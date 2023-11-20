package org.LeetcodeSolution.Array;

/**
 * Problem
 *     <a href="https://leetcode.com/problems/max-sum-of-a-pair-with-equal-sum-of-digits/description/">leetcode.com</a>
 *     <a href="https://leetcode.cn/problems/max-sum-of-a-pair-with-equal-sum-of-digits/description/">leetcode.cn</a>
 * Grade of difficulty
 *     Medium
 * @author cartoon
 * @version 1.0
 */
public class Solution2342 {

    /**
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 define array with length 82(upper to 9 + 9 + 9 + 9) to store calculate result
     *     2.2 traverse array, have two situation
     *         2.2.1 current sum result is zero, add current num to count array(first meet)
     *         2.2.2 current sum result is positive, mean previous have same record in count array, plus it and cas to result, replace count element with bigger num
     * 3.Q&A
     * @param nums source array
     * @return calculate result
     */
    public int maximumSum(int[] nums) {
        int[] count = new int[82];
        int result = -1;
        for(int num : nums){
            int sum = getSum(num);
            if(count[sum] != 0){
                result = Math.max(result, num + count[sum]);
                if(count[sum] < num){
                    count[sum] = num;
                }
            } else{
                count[sum] = num;
            }
        }
        return result;
    }

    private int getSum(int num){
        int result = 0;
        while(num != 0){
            result += num % 10;
            num /= 10;
        }
        return result;
    }
}
