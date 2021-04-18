package org.LeetcodeSolution.String;

/**
 * Problem
 *      344.Reverse String
 *      https://leetcode.com/problems/reverse-string/
 *      https://leetcode-cn.com/problems/reverse-string/
 * Grade of difficulty
 *      Easy
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution344 {

    /**
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 use two pointer to traverse apart from head and tail,swap them util i<j
     *     2.2 I think it is similar to quick sort in a certain extent
     * 3.About submit record
     *     3.1 4ms and 60.5MB memory in LeetCode China
     *     3.2 1ms and 49.6MB memory in LeetCode
     * 4.Q&A
     * @param s
     */
    public void reverseString(char[] s) {
        int i = 0, j = s.length - 1;
        while (i < j) {
            char temp = s[i];
            s[i++] = s[j];
            s[j--] = temp;
        }
    }
}
