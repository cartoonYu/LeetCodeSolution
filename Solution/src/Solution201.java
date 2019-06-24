/**
 * Problem
 *      201.Bitwise AND of Numbers Range
 *      https://leetcode.com/problems/bitwise-and-of-numbers-range/
 * Grade of difficulty
 *      Medium
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution201 {

    /**
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 this solution is base on a comment from leetCode china
     *     2.2 use a integer to cache offset
     *     2.3 right deviate n and m util m=n
     *     2.4 return n left offset cache integer
     * 3.About submit record
     *     3.1 36ms and 37.6MB memory in LeetCode China
     *     3.2 5ms and 35.7MB memory in LeetCode
     * 4.Q&A
     * @param m
     * @param n
     * @return
     */
    public int rangeBitwiseAnd(int m, int n) {
        if(m==n){
            return m;
        }
        if(m==0){
            return 0;
        }
        int off=0;
        for(;m!=n;off++){
            m>>=1;
            n>>=1;
        }
        return n<<off;
    }
}
